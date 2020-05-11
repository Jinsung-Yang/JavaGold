package Chop4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Sample_12 {

	public static void main(String[] args) {
	Function<Integer, String[]>	obj1 = length -> new String[length];
	System.out.println(obj1.apply(5).length);
	
	Function<Integer, String[]>	obj2 = String[]::new;
	System.out.println(obj2.apply(5).length );
	}
}
