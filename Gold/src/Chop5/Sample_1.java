package Chop5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample_1 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("bb","aa","cc");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i).toUpperCase();
			list.set(i, str);
		}
		Collections.sort(list);
		for (String s : list) {
			System.out.println(s+" ");
		}
		System.out.println();
		
		list = Arrays.asList("bb","aa","cc");
		list.stream().sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s + " "));
	}

}
