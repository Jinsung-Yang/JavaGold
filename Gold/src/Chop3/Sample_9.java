package Chop3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import java.util.TreeSet;

public class Sample_9 {
	public static void main(String[] args) {
		
		Deque<String> deq= new ArrayDeque<String>();
		deq.push("1");
		deq.push("2");
		deq.push("3");
		System.out.println(deq);
		System.out.println("pop():"+deq.pop());
		System.out.println(deq);
	}
}
