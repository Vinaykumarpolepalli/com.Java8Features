package com.java8Features;

import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {
    Function<Integer,Integer> f1 = (i)-> i*10;
    System.out.println(f1.apply(9));
    
    
    Function<String,Integer> f2= (s)->s.length();
    System.out.println(f2.apply("vinay"));
    
    
    Function<String,String> f3= (s)->s.toUpperCase();
    System.out.println(f3.apply("vinay"));
    
	}

}
