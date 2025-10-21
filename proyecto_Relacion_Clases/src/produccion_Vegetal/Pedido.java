package produccion_Vegetal;

public class Pedido {
	
	private Cliente cliente;
	private Remito remito;
	private int idpedido;
	
	public Pedido(Cliente cliente, String descripcionPedido, int idpedido) {
		this.cliente = cliente;
		this.remito = new Remito (descripcionPedido);
		this.idpedido = idpedido;
	}

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}
	public void mostrarPedido() {
		System.out.println("Codigo de Envio: " + idpedido + "  Cliente: " + cliente.getRazonSocial() + " --> Descripción del pedido: " + remito.getDescripcionPedido());
	}
	
}
