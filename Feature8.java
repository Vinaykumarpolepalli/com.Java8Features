package com.java8Features;

//class Thread1 implements Runnable {
//
//	@Override
//	public void run() {
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("T1:"+i);
//		}
//	}
//
//}

public class Feature8 {

	public static void main(String[] args) {
		Runnable r =()->{
			for(int i =0;i<=10;i++) {
				System.out.println("T1:"+i);
			}
		};
		//Thread1 t1 = new Thread1();
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main:"+i);
		}
	}

}
