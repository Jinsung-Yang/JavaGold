package Chop5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample_4 {

	public static void main(String[] args) {

	long result1 = Stream.of("a","b","c").count();
	System.out.println(result1);
	Stream<String> stream1 = Stream.of("a","b","c");
	stream1.forEach(System.out::print);
	
	
	}

}
