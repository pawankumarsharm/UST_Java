package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByPrice implements Comparator<Marker> {
	private void compare() {

	}

	@Override
	public int compare(Marker m1, Marker m2) {
if(m1.price>m2.price) {
	return 1;
}
else if(m1.price<m2.price) {
	return -1;
}
else {
		return 0;
	}
}
}
