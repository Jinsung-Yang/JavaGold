package Chop3;

import java.util.Iterator;
import java.util.TreeSet;

public class Sample_5 {
	public static void main(String[] args) {
		TreeSet<String> set= new TreeSet<String>();
		set.add("C");
		set.add("A");
		set.add("B");
		Iterator<String> iter= set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
