// Uvozimo pakete za GUI
import javax.swing.*;

// Uvozimo paket za delo z dogodki
import java.awt.event.*;

/**
 * Javni razred Pesjak
 * dedovan od JFrame in implementiran ActionListener
 * @author Rok Pirh
 *
 */
public class Pesjak extends JFrame implements ActionListener {
	
	/**
	 * Deklarirana površina prikaznega okna
	 */
	private JPanel povrsina;
	
	/**
	 * Deklariran gumb prikaznega okna
	 */
	private JButton dodajJButton;
	
	/**
	 * Deklarirani tekstovni polji prikaznega okna
	 */
	private JTextField tezaPolje, velikostPolje;
	
	/**
	 * Deklarirana tabela v prikaznem oknu
	 */
	private JTable tabela;
	
	/**
	 * Deklariran vmesnik med logiko kode in GUI
	 */
	private PsiTableModel modelTabele;
	
	/**
	 * Javna statična metoda
	 * se izvede ob zagonu programa
	 * @param args /
	 */
	public static void main(String[] args) {
		
		// inicializacija objekta, kamor se bodo namestili grafični objekti
		Pesjak pesjak = new Pesjak("Pesjak labradorcev");
	}

		/**
		 * Javni konstruktor
		 * vrne objekt tipa Pesjak
		 * @param n naslov okna
		 */
		public Pesjak(String n) {
		
			// Kličemo konstruktor nadrazreda
			super(n);
			// Inicializiramo zasebne lastnosti
			povrsina = new JPanel();	// površina pojavnega okna
			dodajJButton = new JButton("Dodaj labradorca na seznam");	// gumb
			tezaPolje = new JTextField(10);		// tekstovno polje za težo
			velikostPolje = new JTextField(10);	// tekstovno polje za velikost
			modelTabele = new PsiTableModel();	// inicializacija objekta za delo s tabelami
			tabela = new JTable(modelTabele);	// inicializacija tabele
	
			// Površino dodamo na mizo
			add(povrsina);
	
			// Gumbu za dodajanje dodamo action listener; "this" se nanaša na objekt "pesjak"
			dodajJButton.addActionListener(this);
	
			// Dodamo gumb, vnosna polja in oznake vnosnih polj ter tabelo na površino
			povrsina.add(new JLabel("Teža (decimalke): "));
			povrsina.add(tezaPolje);
			povrsina.add(new JLabel("Velikost (celo št.): "));
			povrsina.add(velikostPolje);
			povrsina.add(dodajJButton);
			povrsina.add(tabela);
			
			// Pokažemo okno
			setVisible(true);		
			// Nastavimo velikost okna
			setSize(800, 600);
			
			// Nastavimo obnašanje križca X, da konča aplikacijo
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		/**
		 * Metoda vmesnika ActionListener
		 * doda psa v tabelo
		 */
		public void actionPerformed(ActionEvent ae) {
			modelTabele.addPes(new Labradorec(Double.parseDouble(tezaPolje.getText()), Integer.parseInt(velikostPolje.getText())));
		}
}
