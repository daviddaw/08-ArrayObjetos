package empresa;

public class Empleado {
	    private  static int contador;
		private int codigo;
		private  String nombre;
		private double sueldo;
		
		
		public Empleado(String nombre, double sueldo) {
			contador++;
			codigo = contador;
			this.nombre = nombre;
			this.sueldo = sueldo;
		}
		public int getCodigo() {
			return codigo;
		}
/*		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}*/
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
			return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", sueldo=" + sueldo + "]";
		}
		
		

	

}
