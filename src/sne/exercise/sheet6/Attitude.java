package sne.exercise.sheet6;

public enum Attitude {

	FLAT("Wohnung"), APPROPRIATE("Artgerecht");
	
	private String display;
	
	private Attitude(String display) {
		this.display = display;
	}

	public String getDisplay() {
		return display;
	}
}
