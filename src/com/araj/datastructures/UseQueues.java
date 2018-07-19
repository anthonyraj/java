
import java.util.Queue;
import java.util.LinkedList;

class UseQueues {

	public static void main(String[] args) { 

		Queue<String> queue = new LinkedList<String>();
		queue.add("Anthony");
		queue.add("Jennifer");
		queue.add("Joanne");
		System.out.println(queue);

		String next = queue.peek();
		System.out.println(next);

		queue.remove(next);
		System.out.println(queue);

	}

}
