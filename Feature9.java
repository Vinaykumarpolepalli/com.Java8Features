package com.java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class TestComparator implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		if(o1 < o2) {
//		return -1;
//	}else if(o1>o2) {
//		return +1;
//	}else {
//		return 0;
//	}
//	
//	}
//}
class Feature9 {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(20);
		a1.add(40);
		a1.add(30);
		a1.add(50);
		a1.add(20);

		System.out.println("Before" + a1);
		// Collections.sort(a1,new TestComparator());
		Comparator<Integer> c1 = (o1, o2) -> (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0;
		Collections.sort(a1,c1);
		System.out.println("After:" + a1);
	}

}
