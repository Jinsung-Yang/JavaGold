package Chop4;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class Sample_14 {

	public static void main(String[] args) {
	
		ToIntFunction<String> obj1 = s ->s.length();
		System.out.println(obj1.applyAsInt("java"));
		
		ToIntFunction<String> obj2= (String s) ->{return s.length();};
		System.out.println(obj2.applyAsInt("java"));
		
		IntToDoubleFunction obj3 = i -> i+Math.random();
		System.out.println(obj3.applyAsDouble(5));
	}
}
