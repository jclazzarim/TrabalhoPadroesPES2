public class Main {
	
	public static void main(String[] args) {
		Contexto contexto;
		
		contexto = new Contexto(new Soma());
		System.out.println(contexto.executarStrategy(1, 2));
		
		contexto = new Contexto(new Multiplicacao());
		System.out.println(contexto.executarStrategy(15, 2));
		
	}
}
