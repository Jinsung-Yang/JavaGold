package Chop5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample_5 {

	public static void main(String[] args) {

	IntStream stream = IntStream.of(10,20,30);
	int result = stream.reduce(0,(a,b) -> a + b);
	System.out.println(result);
	
	
	}

}
