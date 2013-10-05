
public class Chest extends TierDecorator {

	public Chest(Tier tier) {
		super(tier);
	}
	
	public int getIlvl() {
		return super.getIlvl() + 40;
	}
	
	public String getPartes(){
		return super.getPartes() + separador + "Chest";
	}

}
