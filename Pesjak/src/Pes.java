/**
 * Javni razred Pes
 * @author Rok Pirh
 *
 */
public class Pes {

	// lastnosti
	private int briketi;
	private double dlaka;
	private String barvaDlake;
	
	/**
	 * Javni konstruktor
	 * ustvari nov objekt tipa Pes
	 */
	public Pes() {
		briketi = 0;
		dlaka = 0;
		barvaDlake = "";
	}
				
	/**
	 * Javna metoda za psa ki je brikete
	 * ter izpiše koliko briketov je pes pojedel
	 * @param briketi2 število briketov
	 */
	public void pojej(int briketi2) {
		briketi += briketi2;
		System.out.println("Pes je pojedel " + briketi + " briketov.");
	}

	/**
	 * Javna metoda za psa
	 * izpiše dolžino dlake psa
	 * @param dlaka2 dolžina dlake
	 */
	public void preveriDolzinoDlake(double dlaka2) {
		dlaka += dlaka2;
		System.out.println("Zima še traja in pes ima dlako še vedno dolgo " + dlaka + " cm.");
	}
	
	/**
	 * Javna metoda za psa
	 * izpiše barvo dlake
	 * @param b barva dlake
	 */
	public void preveriBarvoDlake(String b) {
		barvaDlake += b;
		System.out.println("Barva dlake tega psa je " + barvaDlake);
	}	
}
