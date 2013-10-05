
public class TesteFactory extends Factory {

	@Override
	public Armadura criarArmadura() {
		return new ChainArmor();
	}

}
