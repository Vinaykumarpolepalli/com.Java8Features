package com.java8Features;

interface interf3 {
	void method1();
	default void method2(){
		System.out.println("default method2");
	}
	static void method3() {
		System.out.println("Static method3");
	}
}



public class Feature3 {

	public static void main(String[] args) {
		System.out.println("Main method");
//		interf3 i3=()->{
//		System.out.println("Hello method1");	
//		};
		
		 interf3 i3=()-> System.out.println("Hello method1");
		i3.method1();
		i3.method2();
		interf3.method3();
	}

}
