package dsc.sheet1;

import java.awt.Color;
import StdLib.Picture;

public class exercise2 {

	/**
	 * @param args
	 * 
	 * 
	 *            Schreiben Sie ein Programm, welches den Inhalt einer per
	 *            Kommandozeilen- argument angegebenen Bilddatei auf dem
	 *            Bildschirm anzeigt, anschlie§end vertikal spiegelt und das
	 *            Ergebnis ebenfalls darstellt.
	 * 
	 */

	public static void main(String[] args) {

		Picture pic = new Picture(args[0]);
		pic.show();

		int width = pic.width();
		int height = pic.height();
		
		Picture mirror = new Picture(width, height);
		
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				
				mirror.set(width - x - 1, y, pic.get(x, y));
			}
		}
		mirror.show();
	}
}
