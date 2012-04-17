package dsc.sheet4;

import java.util.Random;

public class Location {

	private double latitude;
	private double longitude;
	private String northOrSouth, eastOrWest;

	public Location(double latitude, double longitude) {
		if ((latitude < -90) || (latitude > 90))
			throw new IllegalArgumentException(
					"This place is not part of planet earth. Please choose a value between ±90.");
		else
			this.latitude = latitude;
		if ((longitude < -180) || longitude > 180)
			throw new IllegalArgumentException(
					"This place is not part of planet earth. Please choose a value between ±180.");
		else
			this.longitude = longitude;
	}

	// public Location() {
	// }

	public static Location setRandomLocation() {
		Random r = new Random();
		double latitude = (r.nextDouble() * 180) - 90;
		double longitude = (r.nextDouble() * 360) - 180;
		return new Location(latitude, longitude);
	}

	public static Location parseLocation(String location) {
		String[] locationArray = location.split(" ");
		double latitude, longitude;

		if (locationArray[1] == "S")
			latitude = -Double.parseDouble(locationArray[0]);
		else
			latitude = Double.parseDouble(locationArray[0]);
		if (locationArray[3] == "W")
			longitude = -Double.parseDouble(locationArray[2]);
		else
			longitude = Double.parseDouble(locationArray[2]);

		return new Location(latitude, longitude);
	}

	public double distanceFrom(Location destination) {
		latitude = Math.toRadians(latitude);
		destination.latitude = Math.toRadians(destination.latitude);
		longitude = Math.toRadians(longitude);
		destination.longitude = Math.toRadians(destination.longitude);

		double zeta = Math.acos(Math.sin(latitude) * Math.sin(destination.latitude)
				+ Math.cos(latitude) * Math.cos(destination.latitude)
				* Math.cos(destination.longitude - longitude));
		return zeta * 6370;
	}

	@Override
	public String toString() {
		identifyCardinalDirections();
		return ("You're at: " + Math.abs(latitude) + " " + northOrSouth + " "
				+ Math.abs(longitude) + " " + eastOrWest);
	}

	public void identifyCardinalDirections() {
		if (latitude < 0)
			northOrSouth = "S";
		else
			northOrSouth = "N";
		if (longitude < 0)
			eastOrWest = "W";
		else
			eastOrWest = "E";
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
}
