package sne.exercise.sheet12;

import java.awt.IllegalComponentStateException;

class Queue<T extends Comparable<? super T>> {

	private int length;

	private Node first, last;

	protected class Node {
		T item;
		Node next;
	}

	public boolean isEmpty() {
		return this.first == null;
	}

	public void enqueue(T item) {
		Node oldlast = this.last;
		this.last = new Node();
		this.last.item = item;
		this.last.next = null;
		length++;
		if (isEmpty())
			this.first = this.last;
		else
			oldlast.next = this.last;
	}

	public T dequeue() {
		if (isEmpty())
			return null;
		T item = this.first.item;
		this.first = this.first.next;
		if (isEmpty())
			this.last = null;
		length--;
		return item;
	}

	/**
	 * Queue length with constant runtime.
	 * 
	 * @return queue length
	 */
	public int length() {

		return length;
	}

	/**
	 * @see #max(Node)
	 * @return max
	 */
	public T max() {
		return max(this.first);
	}

	/**
	 * Node item must be a instance of {@link Number} else throws a
	 * {@link IllegalComponentStateException}. If the queue empty returns
	 * <b>null</b> else find the max number from the firstNode element.
	 * 
	 * @param firstNode
	 * @return max {@link T}
	 * @throws IllegalComponentStateException
	 */
	public T max(Node firstNode) throws IllegalComponentStateException {

		if (firstNode == null)
			return null;

		if (!(firstNode.item instanceof Number)) {
			throw new IllegalComponentStateException(firstNode.item.getClass()
					.getName() + " must by a number.");
		}

		Node tmp;
		T max = firstNode.item;
		NumberComparator nc = new NumberComparator();
		while ((tmp = firstNode.next) != null) {
			// first init
			if (max == null)
				max = tmp.item;
			// compare
			if (nc.compare((Number) tmp.item, (Number) max) > 0)
				max = tmp.item;
			// next node
			firstNode = firstNode.next;
		}
		return max;
	}

	public T maxRecursion() {

		if (isEmpty())
			return null;
		
		return maxRecursionCore(this.first, this.first.item);
	}

	private T maxRecursionCore(Node node, T max) {

		if (node == null)
			return max;

		if (new NumberComparator().compare((Number) node.item, (Number) max) > 0) {
			max = node.item;
		}
		return maxRecursionCore(node.next, max);
	}
}
