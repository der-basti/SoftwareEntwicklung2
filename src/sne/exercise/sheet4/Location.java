package sne.exercise.sheet4;

import java.util.Random;

class Location {

	private double latitude;
	private double longitude;

	public Location(double latitude, double longitude) {

		checkLatitude(latitude);
		checkLongitute(longitude);
		this.latitude = latitude;
		this.longitude = longitude;
	}

	private void checkLatitude(double latitude) {
		if (latitude > 90 || latitude < -90)
			throw new IllegalArgumentException(
					"Latitude must between ±90°. But it is " + latitude);
	}

	private void checkLongitute(double longitude) {
		if (longitude > 180 || longitude < -180)
			throw new IllegalArgumentException(
					"Longitute must between ±180°. But it is " + longitude);
	}

	public static Location generateRandomLocation() {

		return new Location(randomDouble(-180, 180, 3),
				randomDouble(-90, 90, 3));
	}

	private static double randomDouble(int min, int max, int digits) {

		// return ((Math.random() * 9000) + 1000) / 1000.0;
		Random random = new Random();
		double d = ((random == null ? new Random() : random).nextDouble() //
				* (max - min))
				+ min;
		return Double.parseDouble(String.format("%." + digits + "f", d));
	}

	public static Location parse(String input) {

		String[] split = input.split(" ");
		double lat = Double.parseDouble(split[0]);
		double lon = Double.parseDouble(split[2]);

		if (TraditionalLocation.SOUTH.name().startsWith(split[1])) {
			lat *= -1;
		} else if (TraditionalLocation.WEST.name().startsWith(split[3])) {
			lon *= -1;
		}

		return new Location(lat, lon);
	}

	/**
	 * Orthodrome.
	 * 
	 * @param location
	 * @return
	 */
	public double distance(Location location) {

		double x = Math.acos(radSin(this.latitude) * radSin(location.latitude)
				+ radCos(this.latitude) * radCos(location.getLatitude())
				* radCos(location.getLongitude() - this.longitude));
		return (x * 6370);

	}

	private double radSin(double value) {
		return Math.sin(Math.toRadians(value));
	}

	private double radCos(double value) {
		return Math.cos(Math.toRadians(value));
	}

	public TraditionalLocation getTraditionalLatitude() {
		// +Nord, −Süd ±90
		if (this.latitude > 0)
			return TraditionalLocation.NORTH;
		return TraditionalLocation.SOUTH;
	}

	public TraditionalLocation getTraditionalLongitude() {
		// +Ost, −West ±180
		if (this.longitude > 0)
			return TraditionalLocation.EAST;
		return TraditionalLocation.WEST;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		checkLatitude(latitude);
		this.latitude = latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		checkLongitute(longitude);
		this.longitude = longitude;
	}
}
