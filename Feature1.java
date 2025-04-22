package com.java8Features;

interface interf1 {
	public abstract void method();

	public default void show() {
		System.out.println("Show Method called");
	}

	public static void display() {
		System.out.println("Display method called");
	}
}

class Test1 implements interf1 {

	@Override
	public void method() {
		System.out.println("Hello Method1 from Test1");
	}

	@Override // must be public default method we can override but we must keep public for the
				// method
	public void show() {
		System.out.println("Show Method called from Test1");
	}
//	@Override  static method we can't override
//	public static void display() {
//		System.out.println("Display method called");
//	}

}

class Test2 implements interf1 {

	@Override
	public void method() {
		System.out.println("Hello Method1  from Test2");

	}

}

public class Feature1 {

	public static void main(String[] args) {
		System.out.println("Main Method is Started");
		// Test1 t1= new Test1();
		// t1.method();
		interf1 i1 = new Test1();
		i1.method();
		i1.show();
		interf1.display();

		interf1 i2 = new Test2();
		i2.method();
		i2.show();
		interf1.display();
	}

}
