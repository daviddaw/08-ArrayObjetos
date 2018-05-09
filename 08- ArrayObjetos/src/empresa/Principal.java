package empresa;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Empresa empresa;
		empresa = new Empresa();
		int opcion;
		System.out.println(" ");
		System.out.println("     Elija una opcion del menú");
		System.out.println(" ");
		System.out.println("> Pulse 1 para dar de alta un departamento");
		System.out.println("> Pulse 2 para asignar un empleado a un departamento");
		System.out.println("> Pulse 3 para isualizar un departamento");
		System.out.println("> Pulse 4 para buscar un empleado en un departamento por codigo");
		System.out.println("> Pulse 5 para buscar un empleado en un departamento por nombre");
		System.out.println("> Pulse 6 para incrementar sueldo de un empleado");
		System.out.println("> Pulse 7 para borrar un empleado");
		System.out.println("> Pulse 8 para visualizar el empleado con mas sueldo de un departamento");
		System.out.println("> Pulse 9 para visualizar el empleado con mas sueldo de la empresa");
		 opcion=ScannerJava.positivo();
		 switch (opcion) {
		case 1:
			//Alta departamento
			String nombre;
			int numeroEmpleados;
			System.out.println("Ha elegido dar de alta un departamento");
			System.out.println("Introduce el nombre del departamento");
			nombre=in.next();
			System.out.println("Introduce el numero de empleados que va tener el departamento");			
			numeroEmpleados=ScannerJava.positivo();
			empresa.altaDpto(nombre,numeroEmpleados);
			//empresa.insertarDpto();
			

		case 2:
			//Asignar empleado a un dpto
			empresa.asignarEmpDpto();
			break;
		case 3://visualizar empleados de un dpto			
			empresa.visualizarDpto();		
			break;
		case 4://buscar empleado por codigo
			empresa.buscarEmpDptoCod();
			break;
		case 5://buscar empleado por nombre
			empresa.buscarNombreEmpDpto();
			break;
		case 6://incrementar sueldo de un empleado
			empresa.incrementarSueldoEmp();
			break;
		case 7:
			//borrar empleado
			empresa.borrarEmpleado();
			break;
		case 8:// empleado con mayor sueldo de un departamento
			empresa.visualizarEmpMaxSueldo();
			break;
		case 9://empleado con mayor sueldo de la empresa
			empresa.visualizarEmpMaxSueldoEmpresa();
			break;
		default:
			System.out.println("No has elegido ninguna opcion valida");
			break;
		}
		
		
//validar opciones

		
		
		
	}


	
/*	public static void altaDpto2() {    Solo si queremos crear el alta desde el main
		
	}*/

}
