/*
	Ime datoteke: 	PsiTableModel.java
	Avtor:			Rok Pirh
	
*/

// Uvozi pakete za GUI
import javax.swing.table.*;

/**
 * Javni razred PsiTableModel
 * dedovan od objekta DefaultTableModel
 * @author Rok Pirh
 *
 */
public class PsiTableModel extends DefaultTableModel {
	
	// konstruktor
	
	/**
	 * Konstruktor za kreiranje tabele
	 */
	public PsiTableModel() {
		// Kliče konstruktor nadrazreda
		super();
		
		// Definiramo imena stolpcev (interno), se ne prikaže v GUI
		addColumn("velikost");
		addColumn("teža");
			
		// Dodamo naslovno vrstico
		// Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {"Teža psa", "Velikost psa"};
		// Dodamo vrstico v tabelo
		addRow(vrstica);
	}
	
	/**
	 * Metoda doda psa na seznam v tabelo
	 * @param l prejme podatke od objekta Labradorec
	 */
	public void addPes(Labradorec l) {
		// Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {l.getTezaPsa(), l.preveriVelikost()};
			
		// Dodamo vrstico v tabelo
		addRow(vrstica);
	}
}