package SieteYMedia;

import java.util.Scanner;

public class Carta {

	private String [] palo= {"Oros", "Copas", "Espadas", "Bastos"};
	private String [] nombre={"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete",  "Sota", "Caballo", "Rey"};
	private double valor;

public Carta(){
	
}

public void sacarCarta(){
	Scanner in = new Scanner(System.in);
	int alpalo, alnombre, alOrde=0;
	double valor=0, sumaTotal=0;
	String palo="", respuesta="";
	do{
		do{
		alpalo=(int) (Math.random()*4);
		}while(alpalo<1 || alpalo>4);
		switch (alpalo) {
		case 1:
			palo="Oros";
			break;
		case 2:
			palo="copas";
				break;
		case 3:
			palo="Espadas";
			break;
		case 4:
			palo="Bastos";
			break;
		}
		do{
		alnombre=(int) (Math.random()*13);
		}while (alnombre<1 || alnombre>13);
		if (alnombre>=1 && alnombre<=7) {
			valor=alnombre;
		}
		if (alnombre>=8 && alnombre<=11) {
			valor=0.5;
		}
	
		System.out.println(alnombre+" de "+palo+" Valor: "+valor);
		
		sumaTotal+=valor;
	
		System.out.println("Desea otra carta? (s/n)");
		respuesta=in.next();
	
	} while (respuesta.equalsIgnoreCase("s") && sumaTotal<17);
	
	if (sumaTotal<18)
		System.out.println("Jugada del jugador: "+sumaTotal);
	
	else{
		System.out.print("Jugada del jugador: "+sumaTotal);
		System.out.println(" Tu valor ha excedido el limite establecido.");
	}
	
	System.out.println("");
	
	do{
	alOrde=(int) (Math.random()*17);
	}while (alOrde<1 || alOrde>17);
		System.out.println("Jugada del ordenador: "+alOrde);
		
	System.out.println("");	
	
	if (sumaTotal>alOrde && sumaTotal<18 ) {
		System.out.println("El Jugador ha ganado la partida");
	}
	else
		System.out.println("El Ordenador ha ganado la partida");
	
}

public String[] getPalo() {
	return palo;
}

public void setPalo(String[] palo) {
	this.palo = palo;
}

public String[] getNombre() {
	return nombre;
}

public void setNombre(String[] nombre) {
	this.nombre = nombre;
}

public double getValor() {
	return valor;
}

public void setValor(double valor) {
	this.valor = valor;
}

}