package Chop3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Sample_2 {
	public static void main(String[] args) {
		String[] ary= {"CCC","AAA","BBB"};
		HashSet<String> hashset= new HashSet<String>();
		hashset.add(ary[0]);
		hashset.add(ary[1]);
		hashset.add(ary[2]);
		hashset.add(ary[0]);
		
		System.out.println("Hash size:"+hashset.size());
		for (String string : hashset) {
			System.out.print(string+"");
		}
		System.out.println();
		TreeSet<String> treeSet= new TreeSet<String>();
		treeSet.add(ary[0]);
		treeSet.add(ary[1]);
		treeSet.add(ary[2]);
		treeSet.add(ary[0]);
		
		System.out.println("treeSize"+ treeSet.size());
		for (String string : treeSet) {
			System.out.print(string+"");
		}
	}
}
