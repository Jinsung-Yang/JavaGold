package Chop4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Sample_5 {
	

	public static void main(String[] args) {
	
		Function<String, Integer> f1= str-> Integer.parseInt(str);
		int num1= f1.apply("100");
		System.out.println(num1);
		
		Function<String, Integer> f2= Integer::parseInt;
		int num2 = f2.apply("200");
		System.out.println(num2);
}
}