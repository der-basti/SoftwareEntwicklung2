package dsc.sheet2;

public class Point3D {
	
	private final int x, y, z;
	
	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double euclideanDistance(Point3D A) {
		return Math.sqrt(quadraticEuclideanDistance(A));
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
