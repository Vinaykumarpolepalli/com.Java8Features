package com.java8Features;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
		Predicate<Integer> p = (i)->i%2==0;
		System.out.println(p.test(10));
		System.out.println(p.test(5));
		
		Predicate<String> p2 =(name)->name.contains("Java");
		System.out.println(p2.test("Java is simple "));
		
		Predicate<Double> p3 = (sal)->sal>100000.00;
		System.out.println(p3.test(1100000.00));
		
		System.out.println();
		
		Predicate<String> p4 = (s) ->s.length()>5;
		String[] names = {"Vinay" ,"Guru", "Rakesh", "Sai","Ravi", "Rsju", "vinaykumar"};
		for(String name :names) {
			if(p4.test(name)) {
				System.out.println(name);
				
				
			}
			
			
		}
		
	}

}
