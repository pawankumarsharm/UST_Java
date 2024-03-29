package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestM {

	public static void main(String[] args) {
		
		Comparator<Employee1> comp=(e1,e2) -> {
			return e1.name.compareTo(e2.name);
		};
		
		TreeSet<Employee1> ts=new TreeSet<Employee1>(comp);
		
		Employee1 e1=new Employee1(4,"niki",5.6);
		Employee1 e2=new Employee1(1,"baskar",5.2);
		Employee1 e3=new Employee1(5,"suresh",5.1);
		Employee1 e4=new Employee1(2,"dinesh",4.5);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println("***using Iterator****");
		Iterator<Employee1> it=ts.iterator();
		while(it.hasNext()) {
			Employee1 e=it.next();
			System.out.println("name is"+e.name);
			System.out.println("id is"+e.id);
			System.out.println("height is"+e.height);
			System.out.println("===============");
		}
	}

}
