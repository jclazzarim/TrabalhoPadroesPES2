public class Abstrai extends Abstracao {
	private int x, y;

	public Abstrai(int x, int y, final Interface inter) {
		super(inter);
		this.x = x;
		this.y = y;
	}

	@Override
	public void soma() {
		System.out.println(interfaceCriada.soma(x, y));
	}
}
