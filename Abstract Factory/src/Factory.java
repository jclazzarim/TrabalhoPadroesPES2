public abstract class Factory {

	public static Factory gerar(int tipo) {
		if (tipo == 0) {
			return new TesteFactory();
		} else {
			return new TesteFactory2();
		}
	}
	
	public abstract Armadura criarArmadura();
}
