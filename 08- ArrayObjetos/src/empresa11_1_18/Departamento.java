package empresa11_1_18;

import java.util.Arrays;

public class Departamento {
	private int codigoDeprtamento;
	private String nombreDepartamento;
	private int numeroEmpleados;
	private Empleado[] arrayEmpleados;
	
	//Constructor
	public Departamento(int codigoD, String nombre, int numeroEmpleados) {
		this.codigoDeprtamento = codigoD;
		this.nombreDepartamento = nombre;
		this.numeroEmpleados = numeroEmpleados;
		this.arrayEmpleados = new Empleado[numeroEmpleados];//dentro del corchela longitud del array
	}

	public int getCodigoD() {
		return codigoDeprtamento;
	}

	/*public void setCodigoD(int codigoD) {
		this.codigoD = codigoD;
	}*/

	public String getNombre() {
		return nombreDepartamento;
	}

	public void setNombre(String nombre) {
		this.nombreDepartamento = nombre;
	}

	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}

	public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}

	public Empleado[] getArrayEmpleados() {
		return arrayEmpleados;
	}

	

/*	public void setArrayEmpleados(Empleado[] arrayEmpleados) {
		this.arrayEmpleados = arrayEmpleados;
	}*/
	
	@Override
	public String toString() {
		return "Departamento [codigoD=" + codigoDeprtamento + ", nombre=" + nombreDepartamento + ", numeroEmpleados=" + numeroEmpleados
				+ ", arrayEmpleados=" + Arrays.toString(arrayEmpleados) + "]";
	}
}
