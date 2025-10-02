package produccion_Vegetal;

public class Empleado extends Persona {
	
	private Persona persona;
	private String puesto;
	private double salario;
	
	public Empleado(String nombre, String fecha_nacimiento, int dni, String puesto, double salario) {
		super(nombre, fecha_nacimiento, dni);
		this.puesto = puesto;
		this.salario = salario; 
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public void infoPersona() {
		System.out.println("Nombre: " + getNombre() + " --> DNI: " + getDni() + "Fecha de Nacimiento: " + getFecha_nacimiento() + " Puesto: " + puesto + " Salario: $" + salario);
	}

}

	
	
