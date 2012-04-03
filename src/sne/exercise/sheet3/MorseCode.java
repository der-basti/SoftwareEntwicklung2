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
			this.mapping.put(tmp[0], tmp[1]);
		}

		remapping();
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

	public String encrypt(String text) {

		return foo(this.mapping, text);
	}

	public String decrypt(String text) {

		return foo(this.remapping, text);
	}

	private final String foo(Map<String, String> x_mapping, String text) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			sb.append(x_mapping.get(text.charAt(i)));
		}
		return sb.toString();
	}

	public char getSplitter() {
		return this.splitter;
	}

	public void setSplitter(char splitter) {
		this.splitter = splitter;
	}
}
