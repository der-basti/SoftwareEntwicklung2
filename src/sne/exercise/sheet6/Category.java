package sne.exercise.sheet6;

enum Category {

	SMALL_DOG("Kleiner Hund"), MIDDLE_DOG("Mittelgroßer Hund"), BIG_DOG("Großer Hund");

	private String display;

	private Category(String display) {
		this.display = display;
	}

	public String getDisplay() {
		return display;
	}
}
