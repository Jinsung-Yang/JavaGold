package Chop3;

import java.util.ArrayList;

public class Sample_1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Integer i1= new Integer(1);
		int i2= 2;
		Integer i3 = i1;
		list.add(i1);
		list.add(i2);
		list.add(i3);//중복요소
		list.add(1,5);
		System.out.println("size"+ list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+" ");
		}
		for (Integer i : list) {
			System.out.println(i+"");
			
		}
		
	}
}
