package Chop4;

import java.util.function.IntFunction;

public class Sample_13 {

	public static void main(String[] args) {
	IntFunction<String[]> obj1 = length -> new String[length];
	IntFunction<String[]> obj2 = String[]:: new;
	System.out.println(obj1.apply(5).length);
	System.out.println(obj2.apply(5).length);
	}
}
