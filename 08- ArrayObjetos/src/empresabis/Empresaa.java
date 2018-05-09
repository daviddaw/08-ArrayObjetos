package empresabis;

import java.util.Scanner;

public class Empresaa {
Departamento[] dep1 = new Departamento[4];

public void altaDepartamento(Departamento depart) {
	
	String nombre = pedirNombre();
	buscarDpto(nombre);
	
	
	
}

private Departamento buscarDpto(String nombre) {
	boolean encontrado = false;
	Departamento DepAux = null;
	
	for (int i = 0; i < dep1.length && !encontrado; i++) {
		if (dep1[i].getNombre().equalsIgnoreCase(nombre)) {
			System.out.println("ya esta creado ese departamento");
			encontrado=true;//depAux=dep1[i]
		}
		
	}
/*	if (encontrado) {   //inicializandola i fuera para poder acceder
		DepAux=dep1[i];
	}
	*/
	return DepAux;
	
}



public String pedirNombre() {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Escribe el nombre del departamento");
	String nombre=in.next();
	
	return nombre;
	
}



}
