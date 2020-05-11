package Chop4;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Sample_1 {

	public static void main(String[] args) {

		List<String> words= Arrays.asList("Tanaka","Sato");
		/*
		 * words.replaceAll(new UnaryOperator<String>() {
		 * 
		 * @Override public String apply(String t) { // TODO Auto-generated method stub
		 * return t.toUpperCase() ; } });
		 */		words.replaceAll((String str) -> {return str.toUpperCase();});
		System.out.println(words);
	}
	

}
