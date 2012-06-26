package sne.exercise.sheet05;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>Aufgabe 1</b><br />
 * Übungen zur VL Softwareentwicklung 2 Blatt 5<br />
 * (nach Heinrich Gailer)<br />
 * Erstellen Sie eine Klasse Artikel mit den Instanzvariablen artikelNr,
 * bezeichnung, einkaufspreis und lagerzeit (Monate).<br />
 * Deklarieren Sie zwei Konstanten:<br />
 * final double HANDELSSPANNE = 0.6 ; // 60 Prozent des Einkaufspreises final
 * double MWST = 0.19 ; // 19 Prozent<br />
 * Erstellen Sie einen Konstruktor, der die Artikelobjekte initialisiert (alle
 * Instanz- variablen).<br />
 * Schreiben Sie eine öffentliche anzeigen() Methode, die die
 * Artikelinformationen ausgibt und eine öffentliche Methode zum Berechnen des
 * Verkaufspreises:<br />
 * public int berechneVerkaufspreis()<br />
 * Der Verkaufspreis ergibt sich aus der Summe von Einkaufspreis und
 * Handelsspanne zuzüglich Mehrwertsteuer. Das Ergebnis wird auf eine ganze
 * Zahl abgerundet.<br />
 * Erzeugen Sie in der Klasse ArtikelTester drei Artikelobjekte und testen Sie
 * die Methoden.<br />
 * Die Ausgabe des Programms sieht dann z.B. folgendermaßen aus:<br />
 * SC120-C "BALLANTINES" EK: 8.0 VK: 14 Euro Lagerzeit: 2 Monate<br />
 * SC123-F "DUFFY MALT Whisky" EK: 10.0 VK: 19 Euro Lagerzeit: 6 Monate SC347-A
 * "GLEN MORANGIE MALT Whisky" EK: 55.0 VK: 104 Euro Lagerzeit: 15 Monate<br />
 * <br />
 * <b>Aufgabe 2 — Sonderposten</b><br />
 * Leiten Sie eine Klasse Sonderposten von der Klasse Artikel ab. Die Subklasse<br />
 * erweitert die Superklasse, um die Instanzvariable rabatt.<br />
 * Erstellen Sie unter Verwendung des Konstruktors der Superklasse einen
 * Konstruktor, der die Objekte der Subklasse initialisiert. Die Initialisierung
 * der Instanzvariablen rabatt wird vom Konstruktor je nach Lagerzeit
 * übernommen. Bei einer Lagerzeit größer 12 Monate wird ein Rabatt auf dem
 * Verkaufspreis von 30 Prozent gewährt. Andernfalls beträgt der Rabatt 10
 * Prozent.<br />
 * Schreiben Sie eine Methode anzeigen() für die Subklasse, die die anzeigen()
 * Methode der Superklasse überschreibt. Schreiben Sie eine Methode
 * berechneVerkaufspreis(), die ebenfalls die Methode der Superklasse
 * überschreibt.<br />
 * Die Ausgabe des Programms sieht dann z.B. ungefähr wie folgt aus:<br />
 * Sonderposten:<br />
 * SC120-C "BALLANTINES" EK: 8.0 VK: 12 Euro Lagerzeit: 2 Monate (VK <alt>: 14
 * Euro; Rabatt: 10%)<br />
 * Sonderposten:<br />
 * SC123-F "DUFFY MALT Whisky" EK: 10.0 VK: 17 Euro Lagerzeit: 6 Monate (VK
 * <alt>: 19 Euro; Rabatt: 10%)<br />
 * Sonderposten:<br />
 * SC347-A "GLEN MORANGIE MALT Whiskey" EK: 55.0 VK: 72 Euro Lagerzeit: 15
 * Monate (VK <alt>: 104 Euro; Rabatt: 30%)<br />
 * 
 * @author sne
 * 
 */
public class ProductTest {

	@Test
	public void testProducts() {

		Product p1 = new Product("SC120-C", "BALLANTINES", 8.0, 2);
		Assert.assertEquals(
				"SC120-C \"BALLANTINES\" cost:8.0€ retail price:15€ storage time:2 months",
				p1.toString());

		Product p2 = new Product("SC123-F", "DUFFY MALT Whisky", 10.0, 6);
		Assert.assertEquals(
				"SC123-F \"DUFFY MALT Whisky\" cost:10.0€ retail price:19€ storage time:6 months",
				p2.toString());

		Product p3 = new Product("SC347-A", "GLEN MORANGIE MALT Whisky", 55.0,
				15);
		Assert.assertEquals(
				"SC347-A \"GLEN MORANGIE MALT Whisky\" cost:55.0€ retail price:104€ storage time:15 months",
				p3.toString());
	}
}
