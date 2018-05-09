package empresabis;

import java.util.Arrays;

public class Departamento {
	//Es autonumerico
	private static int contador;
	private int codigoDpto;
	private String nombre;
	private int numeroEmp;
	private Empleado[] arrayEmpleados;
	
	public Departamento(int codigoDpto, String nombre, int numeroEmp) {
		this.codigoDpto = contador;
		this.nombre = nombre;
		this.numeroEmp = numeroEmp;
		this.arrayEmpleados = new Empleado[numeroEmp];
		contador++;
	}

	public int getCodigoDpto() {
		return codigoDpto;
	}

/*	public void setCodigoDpto(int codigoDpto) {
		this.codigoDpto = codigoDpto;
	}*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroEmp() {
		return numeroEmp;
	}

	public void setNumeroEmp(int numeroEmp) {
		this.numeroEmp = numeroEmp;
	}

	public Empleado[] getArrayEmpleados() {
		return arrayEmpleados;
	}

	public void setArrayEmpleados(Empleado[] arrayEmpleados) {
		this.arrayEmpleados = arrayEmpleados;
	}

	@Override
	public String toString() {
		return "Departamento [codigoDpto=" + codigoDpto + ", nombre=" + nombre + ", numeroEmp=" + numeroEmp
				+ ", arrayEmpleados=" + Arrays.toString(arrayEmpleados) + "]";
	}
	
	
	
	
	
	
}
