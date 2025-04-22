package com.java8Features;

interface interf5 {
	int multplication(int a, int b);

}

public class Feature5 {

	public static void main(String[] args) {
//		interf5 i5 = (int a,int  b) -> {
//			int mul=a*b;
//		System.out.println(mul);
//		return a*b;
//		};
//		 //i5.multplication(10, 20);
		
//		interf5 i5=( a , b)->{
//		return a*b;
//		};
		
		interf5 i5 = (a,b)->a*b;
		int mul =i5.multplication(10, 200);
		System.out.println("muliplicatuion"+mul);
		
		

	}

}
