package Chop3;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sample_18 {
	public static void main(String[] args) {
		HashSet<Integer> hSet = new HashSet<Integer>();
		hSet.add(300);
		hSet.add(20);
		hSet.add(500);
		System.out.println("HshSet:"+hSet);
		TreeSet<Integer> tSet1 = new TreeSet<Integer>();
		tSet1.add(300);
		tSet1.add(20);
		tSet1.add(500);
		System.out.println("TreesSet2"+tSet1);
		TreeSet<String> tSet2 = new TreeSet<>();
		tSet2.add("nao");
		tSet2.add("Nao");
		tSet2.add("100"
				+ "");
		System.out.println("TreeSet2"+ tSet2);
		TreeMap<String, Integer> tMap= new TreeMap<String, Integer>();
		tMap.put("2",300);
		tMap.put("3",20);
		tMap.put("1",500);
		System.out.println("TreeMap:"+tMap);
		
		
	}
}
