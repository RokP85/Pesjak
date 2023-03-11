/**
 * Javni razred pasma psa labradorec
 * dedovan iz Psa ter implementiran vmesnik TezaPsa
 * @author Rok Pirh
 *
 */
public class Labradorec extends Pes implements TezaPsa {
	// Deklariramo dodatno lastnost
	private int visina;
	private double teza;	// lastnost dodana zaradi vmesnika TezaPsa
		
	/**
	 * Javni konstruktor
	 * ustvari nov objekt tipa Pes
	 * @param t teža psa
	 * @param v višina psa
	 */
	public Labradorec(double t, int v) {
		// Kliče konstruktor nadrazreda
		super();
		// Inicializiramo dodatno lastnost
		visina = v; // v cm
		teza = t;	// v kg
	}
	
	/**
	 * Javna metoda za psa pasme labradorec
	 * izpiše višino labradorca v cm in težo v kg
	 */
	public void preveriVelikostTeza() {
		System.out.println("Pes pasme labradorec je velik " + visina + " cm, težak pa " + getTezaPsa() + " kg");
	}
	
	/**
	 * Javna metoda za psa pasme labradorec 
	 * @return višino labradorca v cm
	 */
	public int preveriVelikost() {
		return visina;
	}
	
	/**
	 * Javna metoda za psa pasme labradorec
	 * @return težo labradorca
	 */
	public double getTezaPsa() {
		return teza;
	}
}	
