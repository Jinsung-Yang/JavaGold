package Chop5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample_3 {

	public static void main(String[] args) {

		List<String> data1= Arrays.asList("a","c","b");
		Stream<String> stream1 = data1.stream();
		
		int[] data2 = {1,2,3};
		IntStream stream2 = Arrays.stream(data2);
		
		Stream<String> stream3 = Stream.of("abc");
	}

}
