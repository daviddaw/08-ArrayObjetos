package empresa;

import java.util.Scanner;

public class ScannerJava {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		siNo();
		
		in.close();
		
		
	}
	//Numeros
	public static int entero() {
		Scanner in =new Scanner(System.in);
		int n;
		System.out.print(" > ");
		n=in.nextInt();
		System.out.println();
		
		return n;
	}
    
	public static int positivo() {
		Scanner in =new Scanner(System.in);
		int n;
		do {
			System.out.println(" ");
			System.out.print(" > ");
			n=in.nextInt();
			System.out.println();
			if(n<=0)
				System.out.println("Ese numero no es positivo");
			
		} while (n<=0);

		return n;
	}
	
	public static int positivoYCero() {
		Scanner in =new Scanner(System.in);
		int n;
		do {
			System.out.println(" ");
			System.out.print(" > ");
			n=in.nextInt();
			System.out.println();
			if(n<0)
				System.out.println("Ese numero no es positivo o cero");
			
		} while (n<0);

		return n;
	}
	public static int mayorUno() {
		Scanner in =new Scanner(System.in);
		int n;
		do {
			System.out.print(" > ");
			n=in.nextInt();
			System.out.println();
			
		} while (n<=1);

		return n;
	}

	public static double positivoDouble() {
		Scanner in =new Scanner(System.in);
		double n;
		do {
			System.out.print(" > ");
			n=in.nextInt();
			System.out.println();
			if(n<=0)
				System.out.println("Ese numero no es positivo");
			
		} while (n<=0);

		return n;
	}
    //String

	public static String siNo() {
		Scanner in =new Scanner(System.in);
		String respuesta;
		do {
			System.out.print(" > ");
			respuesta=in.next();
			System.out.println();
			System.out.println(!respuesta.equalsIgnoreCase("S")+ " && " +!respuesta.equalsIgnoreCase("N"));
		} while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));//Si los dos son true no sale del ciclo
		

		return respuesta;
	}
	
    //String

	public static String Simbolo() {
		Scanner in =new Scanner(System.in);
		String respuesta;
		do {
			System.out.print(" > ");
			respuesta=in.next();
			System.out.println();
/*			System.out.println(!respuesta.equalsIgnoreCase("+")+
					" && " +!respuesta.equalsIgnoreCase("-") +
					" && " +!respuesta.equalsIgnoreCase("*") +
					" && " +!respuesta.equalsIgnoreCase("/") +
					" && " +!respuesta.equalsIgnoreCase("^") +
					"&&"+ !respuesta.equalsIgnoreCase("%"));*/
			      if (!respuesta.equalsIgnoreCase("+") && 
							!respuesta.equalsIgnoreCase("-") &&
							!respuesta.equalsIgnoreCase("*") &&
							!respuesta.equalsIgnoreCase("/") &&
							!respuesta.equalsIgnoreCase("^") && 
							!respuesta.equalsIgnoreCase("%")) {
			    	  System.out.println("El caracter "+respuesta+" no es valido.");
					
				}
			
		} while (!respuesta.equalsIgnoreCase("+") && 
				!respuesta.equalsIgnoreCase("-") &&
				!respuesta.equalsIgnoreCase("*") &&
				!respuesta.equalsIgnoreCase("/") &&
				!respuesta.equalsIgnoreCase("^") && 
				!respuesta.equalsIgnoreCase("%"));//Si todos son true no sale del ciclo
		

		return respuesta;
	}



}
