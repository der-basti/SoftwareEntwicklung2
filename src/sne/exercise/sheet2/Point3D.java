package sne.exercise.sheet2;

public class Point3D {

	private int x, y, z;

	public Point3D() {
		// the default constructor
	}

	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * @see #distanceEuklidisch(int, int, int)
	 * @param point
	 * @return
	 */
	public double distanceEuklidisch(Point3D point) {
		return distanceEuklidisch(point.getX(), point.getY(), point.getZ());
	}

	/**
	 * TODO [sne]
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public double distanceEuklidisch(int x, int y, int z) {

		// siehe wikipedia
		return 0;
	}
	
	/**
	 * TODO [sne]
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public double distanceEuklidischQuad(int x, int y, int z) {

		// siehe wikipedia
		return 0;
	}
	
	/**
	 * TODO [sne]
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public double distanceManhattanMetrik(int x, int y, int z) {

		// siehe wikipedia
		return 0;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder("3D point");
		sb.append(" x:").append(this.x);
		sb.append(" y:").append(this.y);
		sb.append(" z:").append(this.z);
		sb.append(" euklid:").append(this.z);
		return sb.toString();
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return this.z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}
