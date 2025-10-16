package produccion_Vegetal;

public class Packaging {
	
	public String tipo;
	public String tamaño;

	public Packaging(String tipo, String tamaño) {
		this.tipo = tipo;
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	

}
