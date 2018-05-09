package siete_y_media;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		String palo = null,nombre=null;
		double valor = 0;

		


		
		 //Creamos la carta
		String plantarse = null;
		double acumuladoJugador = 0,acumuladoBanca = 0;
		boolean perdido=false;
		do {
			
			Scanner in = new Scanner(System.in);
			
			 //Generamos los  valores de la carta
			int paloCarta=(int)(Math.random()*4);// va de 0 a 3(4  numeros)
			palo=generadorPalo(paloCarta);
			int nombreCarta=(int)(Math.random()*10+1);//va de 1 a 10(10 numeros)
			nombre=generadorNombre(nombreCarta);
			valor=generadorvalor(nombreCarta);
			Carta jugador = new Carta(palo,nombre,valor);
			
			System.out.println("Saca una carta");
			System.out.println(jugador.toString());
			 acumuladoJugador = acumuladoJugador+valor;
			 acumuladoBanca = acumuladoBanca+valor;
			 
			 

				System.out.println("llevas acumulado"+acumuladoJugador);

	           if (acumuladoJugador<=7.5) {
	        	   System.out.println("Te plantas?");
					plantarse=in.next();
			}else {
				System.out.println("Has perdido");
				perdido=true;
				
			}
				
			

		} while (acumuladoJugador<7.5 && plantarse.equalsIgnoreCase("no"));
		
		if (!perdido) {
			System.out.println("juega la banca");
			do {
				
				Scanner in = new Scanner(System.in);
				
				 //Generamos los  valores de la carta
				int paloCarta=(int)(Math.random()*4);// va de 0 a 3(4  numeros)
				palo=generadorPalo(paloCarta);
				int nombreCarta=(int)(Math.random()*10+1);//va de 1 a 10(10 numeros)
				nombre=generadorNombre(nombreCarta);
				valor=generadorvalor(nombreCarta);
				Carta banca = new Carta(palo,nombre,valor);
				
				System.out.println("Saca una carta");
				System.out.println(banca.toString());
				 acumuladoBanca = acumuladoBanca+valor;
				 

					System.out.println("llevas acumulado"+acumuladoBanca);

		           if (acumuladoBanca<7.5 ) { //acumulado> que jugador y menor o igual de 7.5"
		        	   System.out.println("Te plantas?");
						plantarse=in.next();
				}else if (acumuladoBanca==7.5) {
					plantarse="si";
				}
		           /*else {
					System.out.println("Has perdido");
					perdido=true;*/
					
				
					
				

			} while (acumuladoBanca<7.5 && plantarse.equalsIgnoreCase("no"));
			
			
			
			
			
			
			
		}

		
		
		
		
		
	}







	private static double generadorvalor(int nombreCarta) {
		double valor;
		switch (nombreCarta) {
		case  1:valor=1;    break;
		case  2:valor=2;    break;
		case  3:valor=3;    break;
 		case  4:valor=4;    break;
		case  5:valor=5;    break;
		case  6:valor=6;    break;
		case  7:valor=7;    break;	
		case  8:
		case  9:
		case 10:valor=0.5;  break;
		
		default:valor=0; break;
		}
		return valor;
	}



	private static String generadorNombre(int nombreCarta) {
		
		String nombre;
		switch (nombreCarta) {
		case  1:nombre="As";       break;
		case  2:nombre="dos";      break;
		case  3:nombre="tres";     break;
		case  4:nombre="cuatro";   break;
		case  5:nombre="cinco";    break;
		case  6:nombre="seis";     break;
		case  7:nombre="siete";    break;
		case  8:nombre="Sota";     break;
		case  9:nombre="caballo";  break;
		case 10:nombre="rey";      break;
		default:nombre=null;       break;
		}
		return nombre;
	}

	private static String generadorPalo(int paloCarta) {	
		String palo;
		
		switch (paloCarta) {
		case  0:palo="Oros";   break;
		case  1:palo="Copas";  break;
		case  2:palo="Espadas";break;
		case  3:palo="Bastos"; break;
		default:palo=null;     break;
		
		
				
	}
		return palo;	

	
 
		
	}
	private static void visualizar(String palo, String nombre,double valor) {
	
	System.out.println(nombre+" de "+palo+" valor "+valor );
		}
		
	
	

}
