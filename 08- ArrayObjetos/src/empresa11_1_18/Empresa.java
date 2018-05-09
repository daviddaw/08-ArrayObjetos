package empresa11_1_18;

import java.util.Scanner;

public class Empresa {
ColeccionDepartamentos coleccionDepartamentos = new ColeccionDepartamentos();

public void altaDpto() {
	Departamento depAux;
	int codigoDepartamento,numeroEmpleados;
	String nombreDepartamento;
	//Datos
	System.out.println("Alta del Departamento");
	codigoDepartamento=pedirCodigo();
	// comprobacion de si existe ya el codigo en el array 
	if (coleccionDepartamentos.buscaCodDpto(codigoDepartamento)==null) {//coleccionDepartamentos.buscaCodDptoEnArray(codigoDepartamento); busca el codigo para saber si esta vacio o no
		System.out.println("Perfecto el codigo "+codigoDepartamento+" esta sin usar.");
		
		nombreDepartamento=pedirNombre();
		// comprobacion de si esta usado el nombre
		if (coleccionDepartamentos.buscarNombreDpto(nombreDepartamento)==null) {
			System.out.println("Perfecto ese nombre aun no fue utilizado");
			
			numeroEmpleados=pedirNumEmp();	
			//Ya tengo los campos del nuevo departamento y los meto en un Departamento auxiliar(me sirve solo para guardar el objeto y enviarlo)
			depAux = new Departamento(numeroEmpleados, nombreDepartamento, numeroEmpleados);
			coleccionDepartamentos.insertarDep(depAux);
		}else {
			System.out.println("No se ha podido crear el departamento por que ese nombre esta usado");
		}
	
	}else {
		System.out.println("Este codigo ya ha sido usado por otro departamento");
	}
	

	
	



	
	
}

public int pedirNumEmp() {//No se puede meter un negativo en empleados
	Scanner in = new Scanner(System.in);
	
	int numemp;
	do {
		System.out.println("Escribe el numero de empleados que tiene");
		numemp= in.nextInt();
	} while (numemp<0);
	return numemp;
}

public String pedirNombre() {//Inserto el nombre del dep
	Scanner in = new Scanner(System.in);
	System.out.println("Escribe el nombre");	
	return in.next();
}

public int pedirCodigo() {//valido falta acabar
	Scanner in = new Scanner(System.in);
	int codigoEmpleado;
	do {
		System.out.println("Escribe el codigo");
		codigoEmpleado=in.nextInt();
	} while ((codigoEmpleado<1) || (codigoEmpleado>4)); //Validado entre 1 y 4
	
	return codigoEmpleado;

}

public void asignarEmpDpto() {
	// TODO Auto-generated method stub
	
}

public void visualizarDpto() {
	// TODO Auto-generated method stub
	
}

public void buscarEmpDptoCod() {
	// TODO Auto-generated method stub
	
}

public void buscarNombreEmpDpto() {
	// TODO Auto-generated method stub
	
}

public void incrementarSueldoEmp() {
	// TODO Auto-generated method stub
	
}

public void borrarEmpleado() {
	// TODO Auto-generated method stub
	
}

public void visualizarEmpMaxSueldo() {
	// TODO Auto-generated method stub
	
}

public void visualizarEmpMaxSueldoEmpresa() {
	// TODO Auto-generated method stub
	
}

}
