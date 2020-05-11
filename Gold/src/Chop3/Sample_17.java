package Chop3;

import java.util.ArrayList;
import java.util.List;

class X{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "X";
	}
}
class Y extends X {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Y";
	}
}
public class Sample_17 {
	public static void method1(List <? extends X> list) {
		System.out.println(list.get(0)+ " ");
	}
	
	public static void method2(List <? super Y> list) {
		list.add(new Y());
		System.out.println(list.get(0)+ " ");
	}
	public static void main(String[] args) {
		List<X> l1= new ArrayList<>(); l1.add(new X());
		List<Y> l2= new ArrayList<>(); l2.add(new Y());
		
		method1(l1);
		method1(l2);
		method2(l1);
		method2(l2);
		
		
	}
}
