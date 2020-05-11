package Chop5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample_6 {

	public static void main(String[] args) {

	BinaryOperator<Integer> operator = (a,b) -> a + b;
	Stream<Integer> stream1 = Stream.of(10,20,30);
	
	//int result = stream1.reduce(operator);
	//System.out.println(result);
	Optional<Integer> result = stream1.reduce(operator);
	 System.out.println(result);
	result.ifPresent(System.out::println);
	
	Stream<Integer> stream2 = Stream.empty();
	Optional<Integer> result2 = stream2.reduce(operator);
	System.out.println(result2);
	result2.ifPresent(System.out::print);
	
	}

}
