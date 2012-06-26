package sne.exercise.sheet12;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;


public class CircularBuffer<T> {

	private final int maxSize;
	@Deprecated
	private T[] queue;
	private Queue<T> q;
	private int first = 0;
	private int last = 0;
	private int currentSize = 0;

	public CircularBuffer(int size) {

		this.maxSize = size;
		this.first = 0;
		this.last = 0;
		this.currentSize = 0;
		// this.queue = new T[this.maxSize];
		this.q = new LinkedBlockingQueue<T>(this.maxSize);
		;
	}

	public boolean isEmpty() {

		return this.currentSize == 0;
	}

	public boolean isFull() {

		return this.currentSize == this.maxSize;
	}

	public void insert(T c) {

		if (!isFull()) {
			this.currentSize++;
			this.last = (this.last + 1) % this.maxSize;
			// this.queue[last] = c;
			this.q.add(c);
		} else {
			throw new IllegalStateException("Overflow");
		}
	}

	public T delete() {

		if (!isEmpty()) {
			currentSize--;
			first = (first + 1) % maxSize;
			// return queue[first];
			return q.peek();
		} else {
			throw new IllegalStateException("Underflow");
		}
	}

	public void print() {

		// System.out.print("Size: " + currentSize + ", last: " + last
		// + ", first: " + first + ", queue: ");
		for (int i = 0; i < maxSize; i++)
			System.out.print("queue[" + i + "]=" + queue[i] + "; ");
		System.out.println();
	}
}
