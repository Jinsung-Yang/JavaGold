package Chop3;

import java.util.Arrays;

public class Sample_20 {
	public static void main(String[] args) {
		int[] ary1= {3,1,2};
		print(ary1); System.out.println();
		Arrays.sort(ary1);
		print(ary1);
		System.out.println();
		Object[] ary2= {new String("aa"), new Integer(1)};
		//Array.sort(ary2);
		
		
		
	}
	public static void print(int[] ary) {
		for (int i : ary) {
			System.out.println(i + " ");
		}
	}
}
