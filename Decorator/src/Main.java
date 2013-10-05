public class Main {
	public static void main(String[] args) {
		Tier t = new Nu();
		System.out.println("Ilvl: " + t.getIlvl() + " Partes: " + t.getPartes());
		
		t = new Legs(t);
		System.out.println("Ilvl: " + t.getIlvl() + " Partes: " + t.getPartes());

		t = new Chest(t);
		System.out.println("Ilvl: " + t.getIlvl() + " Partes: " + t.getPartes());
		
		t = new Helmet(t);
		System.out.println("Ilvl: " + t.getIlvl() + " Partes: " + t.getPartes());
	}
}
