package Chop3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
class Fooo{
	private String str;
	public Fooo(String str) {this.str =str;}
	public String toString() {
		return str+" ";
	}
	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((str == null) ? 0 : str.hashCode()); return
	 * result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Fooo other = (Fooo) obj; if (str == null) { if (other.str != null)
	 * return false; } else if (!str.equals(other.str)) return false; return true; }
	 */
	
	
	 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return str.hashCode();
	}
	  
	  @Override public boolean equals(Object obj) { // TODO Auto-generated method
	  return this.hashCode()==obj.hashCode(); }
	 
}
public class Sample_4 {
	public static void main(String[] args) {
		HashSet<Fooo> set =new HashSet<Fooo>();
		Fooo f1= new Fooo("BBB"); set.add(f1);
		Fooo f2= new Fooo("AAA"); set.add(f2);
		Fooo f3= new Fooo("CCC"); set.add(f3);
		Fooo f4= new Fooo("AAA"); set.add(f4);
		System.out.println("size:"+ set.size());
		for (Fooo foo : set) {
			System.out.println(foo);
		}
		
	}
}
