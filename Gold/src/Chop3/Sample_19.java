package Chop3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

class Employee{
	private String name;
	private Integer id;
	public Employee(String name, Integer id) {
		this.name= name;
		this.id= id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
class MyRule implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}
}
public class Sample_19 {
	public static void main(String[] args) {
			Employee e1= new Employee("taro", 20);
			Employee e2= new Employee("tomoko", 10);
			Employee e3= new Employee("hiromi", 50);
			ArrayList<Employee> ary= new ArrayList<Employee>();
			ary.add(e1);
			ary.add(e2);
			ary.add(e3);
			System.out.println("sort as ArraylList order");
			print(ary);
			System.out.println("show as myRule that definates id sort");
			Collections.sort(ary,new MyRule());
			print(ary);
	}
	public static void print(ArrayList<Employee> ary) {
		for (Employee employee : ary) {
			System.out.println(employee.getId()+" "+employee.getName());
		}
	}
}
