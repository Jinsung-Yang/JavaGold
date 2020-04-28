package Chop3;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.TreeSet;

public class Sample_7 {
	public static void main(String[] args) {
		Queue<String> queue= new ArrayDeque<String>();
		queue.offer("1");
		queue.offer("2");
		for (; 0 < queue.size(); ) {
			queue.poll();
			
		}
		System.out.println(queue.peek());
		System.out.println(queue.element());
	}
}
