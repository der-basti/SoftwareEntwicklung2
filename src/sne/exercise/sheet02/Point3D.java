package sne.exercise.sheet02;

/**
 * 3D mapping.
 */
class Point3D {

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
	 * sqrt ( (x1 - x0)2 + (y1 - y0)2 + (z1 - z0)2 )
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return d
	 */
	public double distanceEuklidisch(int x, int y, int z) {

		return Math.sqrt(distanceEuklidischQuad(x, y, z));
	}

	/**
	 * @see #distanceEuklidischQuad(int, int, int)
	 * @param point
	 * @return d
	 */
	public double distanceEuklidischQuad(Point3D point) {
		return this.distanceEuklidischQuad(point.getX(), point.getY(),
				point.getZ());
	}

	/**
	 * ∑(xi − yi )2 -> sqrt( (x1 x0)2 + (y1 y0)2 + (z1 z0)2 )
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return d
	 */
	public double distanceEuklidischQuad(int x, int y, int z) {

		int dx = x - this.x;
		int dy = y - this.y;
		int dz = z - this.z;
		return Math.pow(dx, 2) + Math.pow(dy, 2) + Math.pow(dz, 2);
	}

	/**
	 * @see #distanceManhattanMetrik(int, int, int)
	 * @param point
	 * @return d
	 */
	public double distanceManhattanMetrik(Point3D point) {
		return this.distanceManhattanMetrik(point.getX(), point.getY(),
				point.getZ());
	}

	/**
	 * {@link http://en.wikipedia.org/wiki/Taxicab_geometry}
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return d
	 */
	public double distanceManhattanMetrik(int x, int y, int z) {

		int dx = this.x - x;
		int dy = this.y - y;
		int dz = this.z - z;
		return (Math.abs(dx) + Math.abs(dy) + Math.abs(dz));
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder("3D point [");
		sb.append("x:").append(this.x);
		sb.append(", y:").append(this.y);
		sb.append(", z:").append(this.z);
		sb.append("]");
		return sb.toString();
	}

	/**
	 * @see #toString()
	 * @param point
	 * @return all informations of {@link Point3D}
	 */
	public String toString(Point3D point) {

		StringBuilder sb = new StringBuilder("3D point [");
		sb.append("x1:").append(this.x);
		sb.append(", y1:").append(this.y);
		sb.append(", z1:").append(this.z);
		sb.append("; x2:").append(point.getX());
		sb.append(", y2:").append(point.getY());
		sb.append(", z2:").append(point.getZ());
		sb.append("; euklid:").append(distanceEuklidisch(point));
		sb.append("; quadrierten euklid:")
				.append(distanceEuklidischQuad(point));
		sb.append("; Manhattan-Metrik:").append(distanceManhattanMetrik(point));
		sb.append("]");
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
