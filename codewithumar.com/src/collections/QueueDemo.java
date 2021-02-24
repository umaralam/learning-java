package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
	public static void show(){
		Queue<String> queue = new ArrayDeque<String>();
		queue.add("c");
		queue.add("b");
		queue.add("a");
		String front = queue.remove();
		System.out.println(front);
	}

}
