package dsc.sheet2;

public class Point3D {
	
	private final int x, y, z;
	
	public Point3D(int xCoord, int yCoord, int zCoord) {
		x = xCoord;
		y = yCoord;
		z = zCoord;
	}
	
	public double euclideanDistance(Point3D A) {
		return Math.sqrt((A.x - x) * (A.x - x) + (A.y - y) * (A.y - y) + (A.z - z) * (A.z - z));
	}
	
	public double quadraticEuclideanDistance(Point3D A) {
		return (A.x - x) * (A.x - x) + (A.y - y) * (A.y - y) + (A.z - z) * (A.z - z);
	}
	
	public double taxicabDistance(Point3D A) {
		return Math.abs(A.x - x) + Math.abs(A.y - y) + Math.abs(A.z - z);
	}
	
	@Override 
	public String toString() {
		return " at " + "(" + x + ", " + y + ", " + z + ")";
	}
}
