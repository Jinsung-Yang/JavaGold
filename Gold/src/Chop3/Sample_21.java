package Chop3;

import java.util.Arrays;
import java.util.List;

public class Sample_21 {
	public static void main(String[] args) {
	String[] ary= {"A","B","C"};
	List<String> list= Arrays.asList(ary);
	list.set(2, "0");
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i)+" 		");
	}
		
	}
}
