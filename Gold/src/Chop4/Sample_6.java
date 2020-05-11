package Chop4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Sample_6 {
	

	public static void main(String[] args) {
	
		List<Integer> list= Arrays.asList(3,1,2);
		/*
		 * Consumer<List<Integer>> con1= new Consumer<List<Integer>>() {
		 * 
		 * @Override public void accept(List<Integer> t) { // TODO Auto-generated method
		 * stub Collections.sort(list); } };
		 */
		
		/*
		 * Consumer<List<Integer>> con1= lamdaList -> Collections.sort(lamdaList);
		 */
		
		Consumer<List<Integer>> con1 =Collections::sort;
		
		
		con1.accept(list);
		
		System.out.println(list);
}
}