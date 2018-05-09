package empresa11_1_18;

import java.util.Scanner;

import empresa.Empresaa;
import empresa.ScannerJava;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Empresa renault;
		renault = new Empresa();
		int opcion;
		System.out.println(" ");
		System.out.println("     Elija una opcion del menú");
		System.out.println(" ");
		System.out.println("> Pulse 1 para dar de alta un departamento");
		System.out.println("> Pulse 2 para asignar un empleado a un departamento");
		System.out.println("> Pulse 3 para visualizar un departamento");
		System.out.println("> Pulse 4 para buscar un empleado en un departamento por codigo");
		System.out.println("> Pulse 5 para buscar un empleado en un departamento por nombre");
		System.out.println("> Pulse 6 para incrementar sueldo de un empleado");
		System.out.println("> Pulse 7 para borrar un empleado");
		System.out.println("> Pulse 8 para visualizar el empleado con mas sueldo de un departamento");
		System.out.println("> Pulse 9 para visualizar el empleado con mas sueldo de la empresa");
		String resp;

		 opcion=ScannerJava.positivo();
		 switch (opcion) {
		case 1: renault.altaDpto();
			break;
		case 2: renault.asignarEmpDpto();
			break;
		case 3: renault.visualizarDpto();		
			break;
		case 4: renault.buscarEmpDptoCod();
			break;
		case 5: renault.buscarNombreEmpDpto();
			break;
		case 6: renault.incrementarSueldoEmp();
			break;
		case 7: renault.borrarEmpleado();
			break;
		case 8: renault.visualizarEmpMaxSueldo();
			break;
		case 9: renault.visualizarEmpMaxSueldoEmpresa();
			break;
		default: System.out.println("No has elegido ninguna opcion valida");
			break;
		}
		
		


		
		

	}

}
