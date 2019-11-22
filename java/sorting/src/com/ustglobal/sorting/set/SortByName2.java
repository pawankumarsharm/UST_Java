package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByName2 implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		 return o1.name.compareTo(o2.name);
	}

}
