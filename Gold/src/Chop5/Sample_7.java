package Chop5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample_7 {

	public static void main(String[] args) {

	int [] ary1 = IntStream.range(1, 10).toArray();
	System.out.println(ary1.length);
	int [] ary2 = IntStream.rangeClosed(1, 10).toArray();
	System.out.println(ary2.length);
	
	Object[] ary3 = Stream.of("a","b").toArray();
	Object[] ary4 = Stream.of("a","b").toArray(String[]::new);
	System.out.println(ary3.getClass());
	System.out.println(ary4.getClass());
	System.out.println(ary4.length);
	}

}
