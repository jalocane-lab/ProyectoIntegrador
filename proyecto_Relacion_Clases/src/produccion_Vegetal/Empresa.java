package produccion_Vegetal;

public class Empresa {
	
	private Area areas;
	public Empresa(Area areas) {
		this.areas = areas;
	}
	
	public void mostrarAreas() {
		System.out.println(areas.getArea1() + "  " + areas.getArea2() + areas.getArea3());
	}

}

