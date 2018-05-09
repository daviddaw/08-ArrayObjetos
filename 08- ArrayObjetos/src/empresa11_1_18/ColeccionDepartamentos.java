package empresa11_1_18;

public class ColeccionDepartamentos {
	Departamento[] arrayDptos = new Departamento[4];
	
	public void insertarDep(Departamento depAux) {
		
		
	}




	public Departamento buscaCodDpto(int codigoDepartamento) {
		Departamento depAux = arrayDptos[codigoDepartamento];
		return depAux;
		
	}

	public Departamento buscarNombreDpto(String nombreDepartamento) {
		Departamento depAux = null;
		for (int i = 0; i < arrayDptos.length; i++) {
			if (arrayDptos[i].getNombre().equalsIgnoreCase(nombreDepartamento)) {
				System.out.println("yaesta dado de alta");
			}else {
				
				
			}
			//depAux.getNombre()=nombreDepartamento;
			//depAux.getNombre().equalsIgnoreCase(nombreDepartamento);
			
		}
		
		return depAux;
	}





	




}
