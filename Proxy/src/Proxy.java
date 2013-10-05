
public class Proxy implements Interface {

	private Implementacao implementacao = null;
	private Cliente cliente= null;
			
	public Proxy(final Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public void salvar() {
		if(implementacao == null){
			implementacao = new Implementacao(cliente);
		}
		implementacao.salvar();
	}


}
