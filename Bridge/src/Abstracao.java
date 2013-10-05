public abstract class Abstracao {
	protected Interface interfaceCriada;

	protected Abstracao(final Interface inter) {
		this.interfaceCriada = inter;
	}

	public abstract void soma();
}
