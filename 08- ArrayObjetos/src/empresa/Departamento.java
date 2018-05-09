package empresa;
import java.util.Arrays;

public class Departamento {
	private  static int contador;
	private  int codDpto;
	private String nombre;
	private int numeroEmpleado;
	private Empleado[] arrayEmp;
	
	public Departamento( String nombre, int numeroEmpleado) {
		contador++;
		this.codDpto = contador;
		this.nombre = nombre;
		this.numeroEmpleado = numeroEmpleado;
		this.arrayEmp =new Empleado[numeroEmpleado];// O J O
	}
	public int getCodDpto() {
		return codDpto;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	public Empleado[] getArrayEmp() {
		return arrayEmp;
	}
/*	public void setArrayEmp(Empleado[] arrayEmp) {
		this.arrayEmp = arrayEmp;
	}*///no se necesita
	@Override
	public String toString() {
		return "Departamento [codDpto=" + codDpto + ", nombre=" + nombre + ", numeroEmpleado=" + numeroEmpleado
				+ ", arrayEmp=" + Arrays.toString(arrayEmp) + "]";
	}
	
	
}
