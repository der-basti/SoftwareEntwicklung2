package sne.exercise.lecture;

public class PointCharge {

	private final double x0, y0, q0;

	public PointCharge(double x0, double y0, double q0) {

		this.x0 = x0;
		this.y0 = y0;
		this.q0 = q0;
	}

	public double potentialAt(double x, double y) {

		double k = 8.99e9;
		double dx = x - this.x0;
		double dy = y - this.y0;
		return k * this.q0 / Math.sqrt(dx * dx + dy * dy);
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.q0);
		sb.append(" at (");
		sb.append(this.x0).append("; ").append(this.y0);
		sb.append(")");
		return sb.toString();
	}
}
