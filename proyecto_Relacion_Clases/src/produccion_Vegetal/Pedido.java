package produccion_Vegetal;

public class Pedido {
	
	private Cliente cliente;
	private int idpedido;
	
	public Pedido(Cliente cliente, int idpedido) {
		this.cliente = cliente;
		this.idpedido = idpedido;
	}

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}
	
	
}
