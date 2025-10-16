package produccion_Vegetal;

public class Cliente {
	
	private String razonSocial;
	private int cuit;
	private String contacto;
	
	public Cliente(String razonSocial, int cuit, String contacto) {
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.contacto = contacto;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	public void datosCliente() {
		System.out.println("Nombre: " + razonSocial + " --> CUIT: " + cuit + " --> Contacto: " + contacto);
	}

}
