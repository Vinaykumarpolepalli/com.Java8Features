package com.java8Features;

interface interf6 {
	int sqrt(int a);
}

public class Feature6 {

	public static void  main(String[] args) {
      interf6 i6= (a)->{ 
    	  return a* a ;
    	  };
    	System.out.println(i6.sqrt(10));  
       
	}

}
