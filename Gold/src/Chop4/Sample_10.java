package Chop4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Sample_10 {

	public static void main(String[] args) {
		//ramda
		BiFunction<String, Integer, Character> obj = (s,i) ->
		s.charAt(i);
		System.out.println(obj.apply("java", 2));
		
		//ramda
		BiFunction<Integer, String, Character> obj1 = (i,s) ->
		s.charAt(i);
		System.out.println(obj1.apply(2, "java"));
		
		//instance method reference
		BiFunction<String, Integer, Character> obj3 = String::charAt;
		System.out.println(obj3.apply("java",2));
		
		//instance method reference -> NG
		//BiFunction<Integer, String, Character> obj4 = String::charAt;
		//System.out.println(obh4,apply(2,"java"));

		
	}
}