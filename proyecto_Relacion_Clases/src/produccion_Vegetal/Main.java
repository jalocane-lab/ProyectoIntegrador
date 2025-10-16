package produccion_Vegetal;

public class Main {

	public static void main(String[] args) {

		Area areasEmpresa = new Area ("Produccion", "RRHH ", " Ventas");
		Empresa empresa = new Empresa (areasEmpresa, "Dulces Puelo", 2065362566);

		empresa.infoEmpresa();
		empresa.mostrarAreas();

	}

}
