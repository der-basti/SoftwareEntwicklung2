package sne.exercise.sheet4;

import java.awt.Point;

class Rectangle {

	private Point upLeft, upRight, downLeft, downRight;

	/**
	 * a) Definieren Sie das Rechteck über zwei Eckpunkte.
	 * 
	 * @param point
	 *            corner
	 * @param diagonalPoint
	 *            corner
	 */
	public Rectangle(Point point, Point diagonalPoint) {

		// TODO [sne] implement
		if (point.x > diagonalPoint.x) {

		} else if (point.x < diagonalPoint.x) {

		}
	}

	/**
	 * b) Definieren Sie das Rechteck über den unteren rechten Punkt in
	 * Verbindung mit Höhe und Breite.
	 * 
	 * @param point
	 *            corner
	 * @param height
	 * @param width
	 */
	public Rectangle(int height, int width, Point downRightPoint) {

		this.downRight = new Point(downRightPoint);
		this.downLeft = new Point(this.downRight.x + width, this.downRight.y);
		this.upRight = new Point(this.downRight.x, this.downRight.y + height);
		this.upLeft = new Point(this.downRight.x + width, this.downRight.y + height);
	}

	/**
	 * c) Definieren Sie das Rechteck über den Mittelpunkt in Verbindung mit
	 * Höhe und Breite.
	 * 
	 * @param height
	 * @param width
	 * @param midddlePoint
	 */
	public Rectangle(Point midddlePoint, int height, int width) {

		int haltWidth = Math.abs(width / 2);
		int halfHeight = Math.abs(height / 2);
		this.downRight = new Point(midddlePoint.x - haltWidth, midddlePoint.y
				- halfHeight);
		this.downLeft = new Point(midddlePoint.x + haltWidth, midddlePoint.y
				- halfHeight);
		this.upRight = new Point(midddlePoint.x - haltWidth, midddlePoint.y
				+ halfHeight);
		this.upLeft = new Point(midddlePoint.x + haltWidth, midddlePoint.y
				+ halfHeight);
	}

	public double size() {
		return Math.abs(this.downRight.x - this.downLeft.x)
				* Math.abs(this.downRight.y - this.upRight.y);
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder("Rectangle [");
		sb.append("downRight=x:").append(this.downRight.x);
		sb.append(" y:").append(this.downRight.y);
		sb.append(", downLeft=x:").append(this.downLeft.x);
		sb.append(" y:").append(this.downLeft.y);
		sb.append(", upRight=x:").append(this.upRight.x);
		sb.append(" y:").append(this.upRight.y);
		sb.append(", upLeft=x:").append(this.upLeft.x);
		sb.append(" y:").append(this.upLeft.y);
		return sb.append("]").toString();
	}

	public Point getUpLeft() {
		return (Point) this.upLeft.clone();
	}

	public void setUpLeft(Point upLeft) {
		this.upLeft = upLeft;
	}

	public Point getUpRight() {
		return (Point) this.upRight.clone();
	}

	public void setUpRight(Point upRight) {
		this.upRight = upRight;
	}

	public Point getDownLeft() {
		return (Point) this.downLeft.clone();
	}

	public void setDownLeft(Point downLeft) {
		this.downLeft = downLeft;
	}

	public Point getDownRight() {
		return (Point) this.downRight.clone();
	}

	public void setDownRight(Point downRight) {
		this.downRight = downRight;
	}
}
