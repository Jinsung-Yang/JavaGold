package Chop3;

interface MyIn<T>{void method(T t);}

class Foooo implements MyIn<String>{
	@Override
	public void method(String s) {System.out.println(s);	}
	
}
class Bar implements MyIn<Integer>{
	@Override
	public void method(Integer s) {System.out.println(s);	}
}
public class Sample_15 {
	public static void main(String[] args) {
	new Foooo().method("ABC");
	new Bar().method(10);
	}
}
