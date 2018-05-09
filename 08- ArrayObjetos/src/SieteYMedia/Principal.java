package SieteYMedia;

import java.util.Scanner;

public class Principal {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String respuesta="";
		
		do{
			
		System.out.println("Juego del Black Jack:\n");
		
		Carta carta1=new Carta();
		
		
		
		
		carta1.sacarCarta();
		
		System.out.println();
		
		System.out.println("Desea volver a jugar? (s/n)");
		respuesta=in.next();
		
		System.out.println();
		}while (respuesta.equalsIgnoreCase("s"));
		System.out.println("FIN");
		
	}

}