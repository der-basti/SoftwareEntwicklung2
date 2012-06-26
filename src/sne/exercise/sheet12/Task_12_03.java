package sne.exercise.sheet12;

/**
 * FIXME [sne] Exercise sheet: 0x task: 0x <br />
 * Description:<br />
 * ...
 */
public class Task_12_03 {

	public static void main(String[] args) {

		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(new Integer(42));
		queue.enqueue(new Integer(9));
		queue.enqueue(new Integer(3));
		queue.enqueue(new Integer(6));
		queue.enqueue(new Integer(1));

		System.out.println("length: " + queue.length());
		System.out.println("max: " + queue.max() + " - should be 42");
		queue.dequeue();
		System.out.println("max (after frist dequeue): " + queue.max() + " - should be 9");
		
		System.out.println("max recursion: " + queue.maxRecursion() + " - should be 9");
	}
}
