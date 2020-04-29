package Chop3;

class Gen1{
	private String var1= "aaa";
	public <T> T method(T value) {
		return value;
	}
	public String getVar1() {
		return var1;
	}
}
public class Sample_14 {
	public static void main(String[] args) {
		Gen1 g= new Gen1();
		Integer i = g.method(1);
		System.out.println(i);
		String s1= g.method("ABC");
		System.out.println(s1);
		String s2= g.<String>method("abc");
		System.out.println(s1+s2);
		g.getVar1();
	}
}
