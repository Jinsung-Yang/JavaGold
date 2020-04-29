package Chop3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Sample_12 {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10,"A");
		List<String> list1= new ArrayList<String>();
		list1.add("B");
		methodA(new ArrayList<>());
		List<String> list2= methodB();
		
	}
	static void methodA(List<String> list) {
		System.out.println("methodA()");
	}
	static ArrayList<String> methodB(){
		System.out.println("methodB()");
		return new ArrayList<>();
	}
}
