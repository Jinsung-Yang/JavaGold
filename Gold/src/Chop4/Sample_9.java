package Chop4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Sample_9 {
	

	public static void main(String[] args) {
	UnaryOperator<String> obj= s->s.toUpperCase();
	UnaryOperator<String> obj1= String::toUpperCase;
	System.out.println(obj.apply("naoki"));
	System.out.println(obj1.apply("naoki"));
	//Collections.sort(list);
	//Comparator<Integer> comp = Integer::compare;
	}
}