package com.java8Features;

@FunctionalInterface
interface interf2 {
	void Addition();

	// void subtraction();

	default void hello() {
		System.out.println("Hello");
	}

	default void hello1() {
		System.out.println("Hello");
	}

	static void welcome() {
		System.out.println("Welcome");
	}

	static void welcome1() {
		System.out.println("Welcome");
	}

	private void method2() {
		System.out.println("private method2");
	}

	private void method3() {
		System.out.println("private method3 ");
	}
}
class Test3 implements interf2{

	@Override
	public void Addition() {
System.out.println("Addition :"+ (10+20));		
	}
	
}

public class Feature2 {

	public static void main(String[] args) {
		System.out.println("Main method is started");
		interf2 i2 = new Test3();
		i2.Addition();

	}

}
