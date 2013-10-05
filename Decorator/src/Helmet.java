
public class Helmet extends TierDecorator {

	public Helmet(Tier tier) {
		super(tier);
	}
	
	public int getIlvl() {
		return super.getIlvl() + 25;
	}
	
	public String getPartes(){
		return super.getPartes() + separador + "helmet";
	}

}
