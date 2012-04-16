package sne.exercise.sheet3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import StdLib.In;

class MorseCode {

	private Map<String, String> mapping;
	private Map<String, String> remapping;
	private char splitter;

	public MorseCode(String sourceMapping, char splitter) {

		this.mapping = new HashMap<String, String>();
		this.remapping = new HashMap<String, String>();
		this.splitter = splitter;
		updateSourceMapping(sourceMapping);
	}

	public MorseCode(String sourceMapping) {

		this(sourceMapping, ',');
	}

	/**
	 * Update the morse code mapping.
	 * 
	 * @param sourceMapping
	 */
	public void updateSourceMapping(String sourceMapping) {

		this.mapping.clear();
		String[] input = In.readStrings(sourceMapping);
		String[] tmp;

		for (int i = 0; i < input.length; i++) {
			tmp = input[i].split(String.valueOf(this.splitter));
			if (!specialChar(tmp[0], tmp[1])) {
				this.mapping.put(tmp[0], tmp[1]);
			}
		}

		remapping();
	}

	private boolean specialChar(String str, String code) {

		if (str.equals("Period") || str.equals(".")) {
			this.mapping.put("Perios", code);
			this.mapping.put(".", code);
			return true;
		} else if (str.equals("Comma") || str.equals(",")) {
			this.mapping.put("Comma", code);
			this.mapping.put(",", code);
			return true;
		} else if (str.equals("Space") || str.equals(" ")) {
			this.mapping.put("Space", code);
			this.mapping.put(" ", code);
			return true;
		} else if (str.equals("End")) {
			this.mapping.put("End", code);
			this.mapping.put(System.getProperty("line.separator"), code);
			return true;
		}
		return false;

	}

	/**
	 * Revert the mapping char - morse code for decryption.
	 */
	private final void remapping() {
		this.remapping.clear();
		for (Entry<String, String> e : this.mapping.entrySet()) {
			this.remapping.put(e.getValue(), e.getKey());
		}
	}

	/**
	 * Text 2 morse.
	 * 
	 * @param morse
	 *            code
	 * @return text
	 */
	public String encrypt(String text) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			sb.append(this.mapping.get(String.valueOf(text.charAt(i))));
		}
		return sb.toString();
	}

	/*
	 * Morse 2 text.
	 * 
	 * @param text
	 * @return morse code
	 */
	/*
	 * public String decrypt(String text) {
	 * 
	 * // XXX [sne] implement }
	 */

	public char getSplitter() {
		return this.splitter;
	}

	public void setSplitter(char splitter) {
		this.splitter = splitter;
	}
}
