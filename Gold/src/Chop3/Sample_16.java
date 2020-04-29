package Chop3;

class Gen2<T extends Number>{
	private T var;
	public Gen2(T var) {
		this.var= var;
	}
	public void display() {
		System.out.println(var);
	}
}
public class Sample_16 {
	public static void main(String[] args) {
		Gen2<Integer> g1= new Gen2<>(100);
		g1.display();
		Gen2<Double> g2= new Gen2<>(2.2);
		g2.display();  s
	}
}
