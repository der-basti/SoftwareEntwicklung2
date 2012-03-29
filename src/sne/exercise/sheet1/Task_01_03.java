package sne.exercise.sheet1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Exercise sheet: 01 task: 03 <br />
 * Description:<br />
 * Erstellen Sie ein Programm, welches einen Text (z.B. TomSawyer.txt) von der
 * Standardeingabe einliest, den prozentualen Anteil des Auftauchens der
 * einzelnen Kleinbuchstaben im Text berechnet und auf dem Bildschirm anzeigt.
 * Ignorieren Sie Großbuchstaben, Satzzeichen, Leerzeichen usw. in Ihrer
 * Analyse.
 */
public class Task_01_03 {

	public static void main(String[] args) {

		// XXX [sne] set source "args[0]"
		String source = "files/TomSawyer.txt";

		// read file
		StringBuilder sb = readFile(source);

		// process input
		BigDecimal allChars = new BigDecimal(sb.length());
		BigDecimal smallChars = new BigDecimal(sb.toString()
				.replaceAll("[^a-z]", "").length());

		// result = smallChars / allChars * 100
		BigDecimal result = smallChars
				.divide(allChars, 5, RoundingMode.HALF_UP).multiply(
						new BigDecimal(100));
		System.out.println("Result = " + result.toPlainString() + " %");
		
		// String.format("%5.2f%%", double value);
	}
	
	
	// FIXME [sne]
	private int[] part2(String text) {
		int[] chars = null;
		for (int i = 0; i < text.length(); i++) {
			for (int j = 97; j <= 122; j++) {
				if (text.charAt(i) >= 97 && text.charAt(i) <= 122) {
					chars[i] += 1;
				}
			}
		}
		return chars;
	}

	private static StringBuilder readFile(String source) {

		StringBuilder sb = new StringBuilder();
		Scanner scanner = null;
		try {
			scanner = new Scanner(new FileInputStream(source));
			while (scanner.hasNextLine()) {
				// without line separator's
				sb.append(scanner.nextLine());
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} finally {
			scanner.close();
		}
		return sb;
	}
}
