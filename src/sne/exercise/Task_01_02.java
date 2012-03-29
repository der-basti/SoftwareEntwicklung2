package sne.exercise;

import java.awt.Color;

import StdLib.Picture;

/**
 * Exercise sheet: 01 task: 02 <br />
 * Description:<br />
 * Schreiben Sie ein Programm, welches den Inhalt einer per Kommandozeilen-
 * argument angegebenen Bilddatei auf dem Bildschirm anzeigt, anschließend
 * vertikal spiegelt und das Ergebnis ebenfalls darstellt.
 */
public class Task_01_02 {

	public static void main(String[] args) {

		// XXX [sne] set image source "args[0]"
		String imgSource = "files/flip.jpg";

		Picture pic = new Picture(imgSource);

		//flipCase1(pic);
		//flipCase2(pic);
		flipCase2optimized(pic);
		
		pic.show();
	}

	@SuppressWarnings("unused")
	private static void flipCase1(Picture picture) {

		Picture flip = new Picture(picture.width(), picture.height());
		int width = picture.width();
		for (int y = picture.height() - 1; 0 <= y; y--) {
			for (int x = width - 1; 0 <= x; x--) {
				flip.set(width - x - 1, y, picture.get(x, y));
			}
		}
		flip.show();
	}

	@SuppressWarnings("unused")
	private static void flipCase2(Picture picture) {

		int height = picture.height();
		int width = picture.width();
		int halfWidth = width / 2;
		Color c1, c2;
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < halfWidth; x++) {
				c1 = picture.get(x, y);
				c2 = picture.get(width - x - 1, y);
				picture.set(width - x - 1, y, c1);
				picture.set(x, y, c2);
			}
		}
	}

	private static void flipCase2optimized(Picture picture) {

		int width = picture.width() - 1;
		Color c1;
		for (int height = picture.height() - 1; 0 <= height; height--) {
			for (int halfWidth = picture.width() / 2; 0 <= halfWidth; halfWidth--) {
				c1 = picture.get(width - halfWidth, height);
				picture.set(width - halfWidth, height,
						picture.get(halfWidth, height));
				picture.set(halfWidth, height, c1);
			}
		}
	}
}
