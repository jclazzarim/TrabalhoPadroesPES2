
public abstract class TierDecorator extends Tier {

	protected final Tier tier;
	protected String separador = ", ";

	public TierDecorator(Tier tier) {
		this.tier = tier;
	}
	
	@Override
	public int getIlvl() {
		return tier.getIlvl();
	}


	@Override
	public String getPartes() {
		return tier.getPartes();
	}

}
