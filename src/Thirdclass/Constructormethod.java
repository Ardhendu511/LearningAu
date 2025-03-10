package Thirdclass;

import java.util.Scanner;

public class Constructormethod {   
//	  String b;
//	  String  a; 
	  Constructormethod()
	  {  
		  this(10);
		 System.out.println(" hello world");
	  }   
	  Constructormethod(int b) {  
		  this(10,20);
		  System.out.println("hello world in second method "); 
	  }
 Constructormethod(int i, int j) {
		System.out.println("third Constructor method is callingint h");
	}
//	  void results()
//	  {
//		   System.out.println(b); 
//		   System.out.println(a);
//	  }
	  
	public static void main(String[] args) {  
		Constructormethod k1=new Constructormethod();  
		
		
             
             
		
	} 
}
