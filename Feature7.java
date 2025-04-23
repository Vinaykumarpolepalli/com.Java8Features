package com.java8Features;

interface interf7 {
	//String method1(String s1, String s2);
	int  method1(String s1, String s2);
}

public class Feature7 {

	public static void main(String[] args) {
//  interf7 i7=(a,b)->
//	  a.concat(b);
//	  System.out.println(i7.method1("vinay ", "java"));
	  
		interf7 i7 =(a,b)->
		a.concat(b).length();
		System.out.println(i7.method1("Vinay", "Java"));
 
	}

}
