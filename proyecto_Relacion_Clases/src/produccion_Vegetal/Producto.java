package produccion_Vegetal;

public class Producto {
	
	private String nombre;
	private Double cantidad;
	private Packaging packaging;
	
	public Producto(String nombre, Double cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.packaging = new Packaging ("Contenedor", "Mediano");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	
	public void infoProducto() {
		System.out.println("Producto: " + nombre + " --> Cantidad: " + cantidad);
	}
	
}
