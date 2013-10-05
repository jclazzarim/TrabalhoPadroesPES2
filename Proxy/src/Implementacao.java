public class Implementacao implements Interface {

	private Cliente cliente = null;

	public Implementacao(final Cliente cliente) {
		this.cliente = cliente;
		exibeCliente();
	}

	private void exibeCliente() {
		System.out.println("Processando: " + cliente.toString());
	}

	@Override
	public void salvar() {
		System.out.println("Salvando Cliente: " + cliente.toString());
	}

}