public class Main {

	public static void main(String[] args) {
		Factory factory = Factory.gerar(1);

		Armadura armadura = factory.criarArmadura();
		armadura.criar();
	}

}
