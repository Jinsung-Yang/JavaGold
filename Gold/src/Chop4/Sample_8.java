package Chop4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Sample_8 {
	

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,1,2);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		list.forEach(a->System.out.println(a));
		
		list.forEach(System.out::print);
	}
}