package sne.exercise.sheet3;

import java.awt.Point;
import java.util.Random;

class RandomWalker {

	enum Direction {
		UP, RIGHT, DOWN, LEFT;
	}

	private final int initX;
	private final int initY;
	private int x;
	private int y;

	public RandomWalker(int x, int y) {
		this.initX = x;
		this.initY = y;
	}

	/**
	 * Take a random step (change internal position).
	 */
	public void step() {
		Point point = calcNewPosition(randomDirection());
		this.x = point.x;
		this.y = point.y;
	}

	protected Direction randomDirection() {
		switch (new Random().nextInt(4)) {
		case 0:
			return Direction.UP;
		case 1:
			return Direction.RIGHT;
		case 2:
			return Direction.DOWN;
		case 3:
			return Direction.LEFT;
		}
		return null;
	}

	protected Point calcNewPosition(Direction direction) {

		switch (direction) {
		case UP:
			return new Point(this.x, this.y + 1);
		case RIGHT:
			return new Point(this.x + 1, this.y);
		case DOWN:
			return new Point(this.x, this.y - 1);
		case LEFT:
			return new Point(this.x - 1, this.y);
		default:
			throw new IllegalStateException("Direction error!");
		}
	}

	public int distance() {

		int dx = this.x - this.initX;
		int dy = this.y - this.initY;
		return (Math.abs(dx) + Math.abs(dy));
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("RandomWalker [");
		sb.append("initX=").append(this.initX);
		sb.append(", initY=").append(this.initY);
		sb.append(", x=").append(this.x);
		sb.append(", y=").append(this.y);
		sb.append(", distance=").append(distance());
		sb.append("]");
		return sb.toString();
	}

	public final int getInitX() {
		return this.initX;
	}

	public final int getInitY() {
		return this.initY;
	}

	public final int getX() {
		return this.x;
	}

	public final int getY() {
		return this.y;
	}
}
