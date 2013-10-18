public class Main {
	public static void main(String[] args) {
		Tier t = new Hero();
		System.out.println("Ilvl: " + t.getIlvl() + " Partes: " + t.getPartes());
		
		t = new Legs(t);
		System.out.println("Ilvl: " + t.getIlvl() + " Partes: " + t.getPartes());

		t = new Chest(t);
		System.out.println("Ilvl: " + t.getIlvl() + " Partes: " + t.getPartes());
		
		t = new Helmet(t);
		System.out.println("Ilvl: " + t.getIlvl() + " Partes: " + t.getPartes());
	}
}
