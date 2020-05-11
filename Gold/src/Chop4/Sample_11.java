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

public class Sample_11 {

	public static void main(String[] args) {
		Supplier<Foo> obj1 = ()-> new Foo();
		System.out.println(obj1.get().a);
		
		Supplier<Foo> obj2 = Foo::new;
		System.out.println(obj2.get().a);
		
		Function<Integer, Foo> obj3 = i->new Foo(i);
		System.out.println(obj3.apply(10).a);
		
		Function<Integer, Foo> obj4= Foo::new;
		System.out.println(obj4.apply(10).a);
		
		Supplier<List<Foo>> obj5 = () -> new ArrayList<Foo>();
		System.out.println(obj5.get().size());
		
		Supplier<List<Foo>> obj6 = ArrayList<Foo>::new;
		System.out.println(obj6.get().size());
		
	}
}
class Foo{
	int a = 0;
	Foo(){}
	Foo(int a){
		this.a = a;
	}
}