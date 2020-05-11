package Chop4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Sample_7 {
	

	public static void main(String[] args) {
		//ramda expression
		Comparator<Integer> comp= (x,y)-> Integer.compare(x,y);
		
		//stastic method 
		Comparator<Integer> comp2= Integer::compare;
		System.out.println(comp.compare(1, 2));
		System.out.println(comp2.compare(2, 1));
	}
}