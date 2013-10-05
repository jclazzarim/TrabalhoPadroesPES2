
public class Contexto {
	private Strategy strategy;
	
	public Contexto(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executarStrategy(int a, int b){
		return this.strategy.operar(a, b);
	}
}
