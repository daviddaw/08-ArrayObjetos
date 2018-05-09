package empresa;

import java.util.Scanner;

public class Empresa {
	//private final int numDpto=4;
	private Departamento[] arrayDpto;
	
	
	public Empresa() {//Estamoscreando  un array de Departamentos, numDpto indica el tamño del array
		arrayDpto = new Departamento[4];
	}
	
	
	public Departamento[] getArrayDpto() {
		return arrayDpto;
	}

	public void setArrayDpto(Departamento[] arrayDpto) {
		this.arrayDpto = arrayDpto;
	}
	
	
	public void altaDpto2() {
		Scanner in = new Scanner(System.in);
		int codDptoAux=in.nextInt();
		/*buscarDpto(codDptoAux);*/
		Departamento dptoAux =buscarDpto(codDptoAux);
		if (dptoAux != null) {
			System.out.println(" El departamento ya existe");
			
		}else {
			nuevoDpto(codDptoAux);
		}
		
	}


	public Departamento nuevoDpto(int codDptoAux) {
		Scanner in = new Scanner(System.in);
		String nombreDptoAux=in.next();
		Departamento dptoAux=buscarDptoNombre(nombreDptoAux);
		if (dptoAux!=null) {
			System.out.println("El departamento "+dptoAux.toString()+"ya existe");
			
		}else {//continuamos con el alta
			System.out.println("Introduce el numero de empleados");
			int numEmp=in.nextInt();
			dptoAux=new Departamento(/*codDptoAux*/nombreDptoAux, numEmp);
			//inserto en la posicion e la posicion codigodepartamento -1
		}
		
		
		 return dptoAux;
		
		
	}
	
	public void insertarDpto(Departamento dptAux) {
		
		
		
		
	}

	
    public Departamento  buscarDptoNombre(String nombreDptoAux) {
    	Departamento dptoAux=null;
    	boolean encontrado=false;
		
    	//busqueda secuencial del nombre enel array
		 for (int i = 0; i < arrayDpto.length && !encontrado; i++) {
			if (arrayDpto[i]!=null && arrayDpto[i].getNombre().equalsIgnoreCase(nombreDptoAux)) {//Puededar un error si esta en null
				dptoAux=arrayDpto[i];//Lo  hemos encontrado
				encontrado=true;//Duda
			}
			else {
				encontrado=false;
				/*System.out.println("No existe");*/ //no se pone  puede estar en otra posicion
				//solo cuando acabe el for podremos ponerlo
			}
    }
		return dptoAux;
    }
	public Departamento buscarDpto(int codDptoAux) {
		
		// devuelve el departamento si lo encuentra  si no hay devuelve null
		 return arrayDpto[codDptoAux-1];

		}
		
	
	
	//secuencial 
/*	public boolean buscarDpto(int codDptoAux) {//no es tan eficaz
		if (arrayDpto[codDptoAux-1]==null) 
		return false;
		else {
			return true;
		}
	}*/


	public void altaDpto(String nombre, int numeroEmpleados) {//Pide los datos necesarios por parametro, nombre y numero de empleados
		Departamento dpto1 = new Departamento(nombre,numeroEmpleados);//El constructor esta en departamento
		//inserto el departamento creado en un array
		System.out.println(" cod dpto"+dpto1.getCodDpto());
		
		
		for (int i = 0; i < arrayDpto.length; i++) {
			System.out.println(arrayDpto.length);
		}
		
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


	public void insertarDpto() {
		// TODO Auto-generated method stub
		
	}




	
	

}
