package sne.exercise.sheet3;

/**
 * Exercise sheet: 03 task: 02 <br />
 * Description:<br />
 * Erstellen Sie einen Datentyp „MorseCode“ für die Repräsentation von Zeichen
 * mittels Morsecode. Die Codes der wichtigsten Zeichen finden Sie in der Datei
 * morse.csv.
 * 
 * Lesen Sie diese Datei programmatisch ein und schreiben Sie eine kleine
 * Anwendung, welche vom Benutzer eingegeben Text in den entsprechenden
 * Morsecode umwandelt und beides auf dem Bildschirm ausgibt.
 */
public class Task_03_02 {

	public static void main(String[] args) {

		MorseCode morseCode = new MorseCode("files/morse.csv");

		// FIXME [sne] TEST IT

		String encrypt = morseCode.encrypt("hallo".toUpperCase());
		System.out.println(encrypt);

		String decrypt = morseCode.decrypt(".....-.-...-..---");
		System.out.println(decrypt);
	}
}
