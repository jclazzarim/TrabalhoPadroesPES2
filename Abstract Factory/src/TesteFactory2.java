
public class TesteFactory2 extends Factory {

	@Override
	public Armadura criarArmadura() {
		return new PlateArmor();
	}

}
