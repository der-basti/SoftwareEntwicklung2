package dsc.sheet1;

import StdLib.*;

public class exercise3 {

	/**
	 * 
	 * Erstellen Sie ein Programm, welches einen Text (z.B. TomSawyer.txt) von
	 * der Standardeingabe einliest, den prozentualen Anteil des Auftauchens der
	 * einzelnen Kleinbuchstaben im Text berechnet und auf dem Bildschirm
	 * anzeigt.
	 * 
	 * Ignorieren Sie Gro§buchstaben, Satzzeichen, Leerzeichen usw. in Ihrer
	 * Analyse.
	 * 
	 * @param args
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int[] counter = new int[alphabet.length];
		
		String text = StdIn.readAll();
		
		for(int i = 0; i < text.length(); i++) {
			for(int j = 0; j < alphabet.length; j++) {
				if (text.charAt(i) == alphabet[j]) {
					counter[j]++;
				}
			}
		}
		
		for(int i = 0; i < alphabet.length; i++) {
			StdOut.println(alphabet[i] + " = " + counter[i]);
		}
	}
}
