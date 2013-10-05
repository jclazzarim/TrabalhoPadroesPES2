public class Soma implements Strategy {

	@Override
	public int operar(int a, int b) {
		System.out.println("Somando");
		return a + b;
	}

}
