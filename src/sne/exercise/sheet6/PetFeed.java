package sne.exercise.sheet6;

import java.util.Arrays;
import java.util.Random;

class PetFeed {

	/**
	 * <b>Aufgabe 1</b><br />
	 * Erstellen Sie eine abstrakte Klasse Haustiere. Die Klasse besteht aus 
	 * den Instanzvariablen String name; double futtervorrat; int anzahlTage; //
	 * gibt die Anzahl Tage aus, die der Futtervorat reicht  einem Konstruktor,
	 * der die beiden Instanzvariablen name und futtervorrat initialisiert (
	 * Dieser Kontruktor kann zwar nicht direkt genutzt werden, da die abstrakte
	 * Klasse Haustiere nicht instanziiert werden kann, aber er kann von den
	 * Subklassen Katze und Hund verwendet werden.)  der Methode public void
	 * fuettern() { // Hier erfolgt zuerst der Aufruf der Methode sprich(). //
	 * Solange der Futtervorat reicht, wird dann die Methode friss() //
	 * aufgerufen und die Anzahl der Tage hochgezählt, die der Vorrat //
	 * reicht. // Implementiert werden die abstrakten Methoden sprich() und //
	 * friss() erst in den Subklassen. }  der Methode public void anzeigen() {
	 * // zeigt den Namen des Haustiers an und wie viele Tage der //
	 * Futtervorrat reicht }  und den abstrakten Methoden public abstract void
	 * friss(); public abstract void sprich(); Leiten Sie von der abstrakten
	 * Klasse Haustiere die Klassen Hund und Katze ab. Schreiben Sie für beide
	 * Subklassen einen Konstruktor, der den Konstruktor der Superklasse
	 * aufruft. Implementieren Sie anschließend in den Subklassen die abstrakten
	 * Methoden:  Die Methode sprich() gibt "Wuff!" bzw "Miau!" aus.  Die
	 * Methode friss() verringert den Wert der Instanzvariablen futtervorrat um
	 * 1.0 (Hund) bzw. um 0.5 (Katze) und gibt den Namen des Haustiers mit dem
	 * jeweiligen Stand des Futtervorrats aus. Testen Sie das Programm in einer
	 * Klasse HaustierFuettern. Die Ausgabe sieht dann ungefähr wie folgt aus:
	 * Miau! Minka: 5.0 Minka: 4.5 Minka: 4.0 Minka: 3.5 Minka: 3.0 Minka: 2.5
	 * Minka: 2.0 Minka: 1.5 Minka: 1.0 Minka: 0.5 Der Vorrat fuer Minka reicht
	 * 10 Tage. Wuff! Strolchie: 5.0 Strolchie: 4.0 Strolchie: 3.0 Strolchie:
	 * 2.0 Strolchie: 1.0 Der Vorrat fuer Strolchie reicht 5 Tage.<br />
	 * <b>Aufgabe 2</b><br />
	 * Die Subklassen der Aufgabe 1 (Haustiere) des vorherigen Kapitels sollen
	 * erweitert werden. Die Klasse Hund bekommt zusätzlich eine
	 * Instanzvariable kategorie (Typ String). Es wird 3 Kategorien geben:  1 -
	 * Kleinhunde  2 - Mittelgroße Hunde  3 - Große Hunde Die Klasse Katze
	 * bekommt eine Instanzvariable haltung (Typ String). Es wird zwei Typen
	 * geben:  1 - Wohnung  2 - Artgerecht Erweitern Sie die Konstruktoren der
	 * Subklassen um eine int-Variable, über die die Instanzvariablen kategorie
	 * bzw. haltung entsprechend initialisiert werden. Überschreiben Sie in den
	 * Subklassen die Methode anzeigen() der Superklasse. Sie soll zusätzlich
	 * die Kategorie bzw. den Typ der Haltung ausgeben. Testen Sie das Programm
	 * in einer Klasse HaustierFuettern. Die Ausgabe sieht dann ungefähr wie
	 * diese aus: Miau! Minka: 3.0 Minka: 2.5 Minka: 2.0 Minka: 1.5 Minka: 1.0
	 * Minka: 0.5 (Haltung: Wohnung) Der Vorrat fuer Minka reicht 6 Tage. Wuff!
	 * Strolchie: 5.0 Strolchie: 4.0 Strolchie: 3.0 Strolchie: 2.0 Strolchie:
	 * 1.0 (Kategorie: Kleinhunde) Der Vorrat fuer Strolchie reicht 5 Tage.<br />
	 * <b>Aufgabe 3</b><br />
	 * Die folgenden zwei Aufgaben bauen auf den Ergebnissen der beiden
	 * vorherigen Aufgaben auf. Erstellen Sie ein Array vom Typ Haustiere, das
	 * fünf Elemente aufnehmen kann. Erzeugen Sie dann 5 Objekte vom Typ Hund
	 * und Katze und weisen Sie diese den Positionen des Arrays zu. Rufen Sie
	 * dann in einer for-Schleife die fuettern() und anzeigen() Methode für die
	 * Haustiere auf. Ändern Sie die friss() Methode der Klasse Hund. Kleine
	 * Hunde fressen weiterhin 1 Einheit des Futtervorrats, mittelgroße Hunde
	 * 1.5 Einheiten und große Hunde fressen 2.0 Einheiten. Testen Sie das
	 * Programm in einer Klasse HaustierFuettern. Die Ausgabe sieht dann
	 * ungefähr wie diese aus: Miau! 1.0 0.5 (Haltung: Wohnungskatze) Der
	 * Vorrat fuer Minka reicht 2 Tage. Wuff! 9.0 7.0 5.0 3.0 1.0 (Kategorie:
	 * Wuff! 4.0 2.5 1.0 (Kategorie: Miau! Grosse Hunde) Der Vorrat fuer Rambo
	 * reicht 5 Tage. Mittelgrosse Hunde) Der Vorrat fuer Isi reicht 3 Tage. 1.5
	 * 1.0 0.5 (Haltung: Artgerecht) Der Vorrat fuer Morle reicht 3 Tage. Wuff!
	 * 3.0 2.0 1.0 (Kategorie: Kleinhunde) Der Vorrat fuer Strolchie reicht 3
	 * Tage.<br />
	 * <b>Aufgabe 4</b><br />
	 * Das Programm wird um die Möglichkeit erweitert, ein Array von
	 * Haustier-Objekten sortiert nach Gewicht auszugeben. Fügen Sie der
	 * abstrakten Klasse Haustiere die private Variable gewicht hinzu und passen
	 * Sie die Konstruktoren der drei Klassen entsprechend an. Ändern Sie in
	 * der abstrakten Klasse Haustiere die öffentliche Methode anzeigen(), so
	 * dass sie den Namen und das Gewicht der Haustiere ausgibt. Implementieren
	 * Sie das Interface Comparable in der abstrakten Klasse Haustiere. Weitere
	 * Informationen dazu finden Sie im nachfolgenden Hinweis. Verwenden Sie
	 * jetzt für die Ausgabe innerhalb der for-Schleife die anzeigen() Methode.
	 * Um die Methode sort() der Klasse Arrays nutzen zu können, müssen Sie
	 * das Paket java.util importieren. import java.util.* ; Testen Sie das
	 * Programm in einer Klasse HaustierFuettern. Die Ausgabe sieht dann
	 * ungefähr wie diese aus: Unsortiertes Array [Gewicht [Gewicht [Gewicht
	 * [Gewicht [Gewicht 3.5] Der Vorrat fuer Minka reicht 2 Tage. 75.0] Der
	 * Vorrat fuer Rambo reicht 5 Tage. 25.5] Der Vorrat fuer Isi reicht 3 Tage.
	 * 4.0] Der Vorrat fuer Morle reicht 3 Tage. 6.5] Der Vorrat fuer Strolchie
	 * reicht 3 Tage. Sortiertes Array (nach Gewicht) [Gewicht [Gewicht [Gewicht
	 * [Gewicht [Gewicht 3.5] Der Vorrat fuer Minka reicht 2 Tage. 4.0] Der
	 * Vorrat fuer Morle reicht 3 Tage. 6.5] Der Vorrat fuer Strolchie reicht 3
	 * Tage. 25.5] Der Vorrat fuer Isi reicht 3 Tage. 75.0] Der Vorrat fuer
	 * Rambo reicht 5 Tage.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Pet dog = new Dog("Elton", 12, 15, Category.MIDDLE_DOG);
		dog.feed();

		System.out.println("==========");

		Pet cat = new Cat("Urmel", 8, 5, Attitude.FLAT);
		cat.feed();

		System.out.println("==========");

		Pet[] pets = new Pet[5];
		for (int i = 0; i < 5; i++) {
			if (new Random().nextBoolean()) {
				pets[i] = new Dog("dog " + i, new Random().nextInt(60), i,
						Category.BIG_DOG);
			} else {
				pets[i] = new Cat("cat " + i, new Random().nextDouble() * 10,
						i, Attitude.FLAT);
			}
		}

		System.out.println("== unsortiert");
		for (int i = 0; i < 5; i++)
			pets[i].display();

		Arrays.sort(pets);

		System.out.println("== sortiert");
		for (int i = 0; i < 5; i++)
			pets[i].display();
	}

}
