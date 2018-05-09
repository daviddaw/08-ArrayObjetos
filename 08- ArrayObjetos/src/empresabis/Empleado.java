package empresabis;

public class Empleado {
	private String nombre;
	private int codigo;
	private double sueldo;
	
	public Empleado(String nombre, int codigo, double sueldo) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.sueldo = sueldo;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	/*public void setCodigo(int codigo) {
		this.codigo = codigo;
	}*/

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", codigo=" + codigo + ", sueldo=" + sueldo + "]";
	}
	
}
