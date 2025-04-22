package com.java8Features;

@FunctionalInterface
interface interf4 {
	void method1(int a, int b);

}
//@FunctionalInterface
//interface interf5 extends interf4 {
//	void method2();
//}

public class Feature4 {

	public static void main(String[] args) {
         interf4 i4= (x,y)-> System.out.println(x+y);
         i4.method1(10, 20);
         i4.method1(10, 200);
         i4.method1(10, 2000);
	}

}
