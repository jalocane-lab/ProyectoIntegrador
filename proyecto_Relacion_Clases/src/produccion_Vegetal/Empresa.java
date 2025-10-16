package produccion_Vegetal;

public class Empresa {
	
	private Area areas;
	private String nombre;
	private int cuit;
	
	public Empresa(Area areas, String nombre, int cuit) {
		this.areas = areas;
		this.nombre = nombre;
		this.cuit = cuit;
	}
	
	public void infoEmpresa() {
		System.out.println("* Nombre de la Empresa: " + nombre + " --> CUIT: " + cuit);
	}
	
	public void mostrarAreas() {
		System.out.println("--> Áreas de la Empresa: " + areas.getArea1() + "  " + areas.getArea2() + areas.getArea3());
	}

}

