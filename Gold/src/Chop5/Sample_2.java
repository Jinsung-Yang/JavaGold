package Chop5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample_2 {

	public static void main(String[] args) {

		List<String> data1 = Arrays.asList("mana","naoki","ryo");
		boolean result1 = data1.stream().allMatch(s -> s.length()>=3);
		boolean result2 = data1.stream().anyMatch(s -> s.length()==4);
		boolean result3 = data1.stream().noneMatch(s -> s.length()==4);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		Stream<String> stream1 = data1.stream();
		boolean result4 = stream1.allMatch(s -> s.length() >=3);
		System.out.println(result4);
	}

}
