public class Main {
	public static void main(String[] args) {
		Interface teste = new Proxy(new Cliente("Julio Cesar","Lazzarim", "123.456.789-01" ));
		
		teste.salvar();
		teste.salvar();
		teste.salvar();
		teste.salvar();
	}
}
