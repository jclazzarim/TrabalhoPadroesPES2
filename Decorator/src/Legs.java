public class Legs extends TierDecorator {

	public Legs(Tier tier) {
		super(tier);
	}

	public int getIlvl() {
		return super.getIlvl() + 15;
	}
	
	public String getPartes(){
		return super.getPartes() + separador + "legs";
	}
}
