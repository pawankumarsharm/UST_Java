package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByMicr implements Comparator<Bank> {
	@Override
	public int compare(Bank o1, Bank o2) {
		 Long i=o1.micr;
		 Long f=o2.micr;
		 return i.compareTo(f);
	}

}
