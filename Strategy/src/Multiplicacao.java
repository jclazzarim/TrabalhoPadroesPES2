public class Multiplicacao implements Strategy {

	@Override
	public int operar(int a, int b) {
		System.out.println("Multiplicando");
		return a * b;
	}

}
