package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
public static void main(String[] args) {
	
	LinkedHashSet<Double> ls=new LinkedHashSet<Double>();
	ls.add(12.3);
	ls.add(25.6);
	ls.add(1.5);
	ls.add(67.5);
	ls.add(34.8);
	
	System.out.println("************using for each*******");
	for (Double s : ls) {
		System.out.println(s);
	}
	
	System.out.println("******using iterator******");
	Iterator<Double> it=ls.iterator();
	while(it.hasNext()) {
		Double p=it.next();
		System.out.println(p);
	}

}
}
