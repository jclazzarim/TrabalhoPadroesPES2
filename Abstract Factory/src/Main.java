public class Main {

	public static void main(String[] args) {
		Factory factory = Factory.gerar(1);
		Factory factory2 = Factory.gerar(0);

		Armadura armadura = factory.criarArmadura();
		Armadura armadura2 = factory2.criarArmadura();
		armadura.criar();
		armadura2.criar();
	}

}
