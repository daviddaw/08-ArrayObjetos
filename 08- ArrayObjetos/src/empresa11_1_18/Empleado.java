package empresa11_1_18;

public class Empleado {
	private int codigoE;
	private String nombre;
	private double sueldo;
	public Empleado(int codigoE, String nombre, double sueldo) {
		this.codigoE = codigoE;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	
	public int getCodigoE() {
		return codigoE;
	}
	public void setCodigoE(int codigoE) {
		this.codigoE = codigoE;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	@Override
	public String toString() {
		return "Empleado [codigoE=" + codigoE + ", nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
	
	

}
