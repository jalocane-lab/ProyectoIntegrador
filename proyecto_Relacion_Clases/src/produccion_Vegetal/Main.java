package produccion_Vegetal;

public class Main {

	public static void main(String[] args) {

		Area areasEmpresa = new Area ("Produccion", "RRHH ", " Ventas");
		Empresa empresa = new Empresa (areasEmpresa, "Dulces Puelo", 2065362566);

		System.out.println("");
		System.out.println("----------------------------");
		System.out.println("--- Datos de la Empresa --- ");
		System.out.println("----------------------------");
		empresa.infoEmpresa();
		empresa.mostrarAreas();
		
		
		Empleado empleado1 = new Empleado("Martin López", "16/08/1987", 35263355, "Productor", 1253326);
		Empleado empleado2 = new Empleado("Sofía Goméz", "13/06/90", 38454213, "Reclutadora", 1250000);
		Empleado empleado3 = new Empleado("Leticia Gonzales", "13/06/92", 40454213, "Vendedora", 1250000);
		Empleado[] empleados = {empleado1, empleado2, empleado3};
		
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("--- Listado de Empleados Dulces Puelo --- ");
		System.out.println("------------------------------------------");
		for (int i = 0; i < 3; i++) {
			empleados[i].infoPersona();
		}
		
		Cliente cliente1 = new Cliente("ELRE S.R.L", 30-123456789, "1166526451");
		Cliente cliente2 = new Cliente("Del Lago S.A.", 30-25452555-8, "dellago@hotmail.com");
		Cliente[] clientes = {cliente1, cliente2};
		
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("--- Listado de Empleados Dulces Puelo --- ");
		System.out.println("------------------------------------------");
		for (int i = 0; i < 3; i++) {
			clientes[i].datosCliente();
		}
	}

}
