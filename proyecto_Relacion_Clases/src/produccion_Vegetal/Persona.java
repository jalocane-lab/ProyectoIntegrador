package produccion_Vegetal;

public class Persona {
	
	private String nombre;
	private String fecha_nacimiento;
	private int dni;
	
	public Persona(String nombre, String fecha_nacimiento, int dni) {
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void infoPersona() {
		System.out.println("Nombre: " + nombre + " --> DNI: " + dni + "Fecha de Nacimiento: " + fecha_nacimiento);
	}
}
