package Thirdclass;

import java.util.Scanner;

public class Constructormethod {   
	  int b;
	  int a; 
	  void first()
	  { 
		  System.out.println(b); 
		  System.out.println(a);
	  }  
	  void show(String b) {
	        String localVar=b; // Local variable
	        System.out.println("Local Variable: " + localVar);
	    } 
	void b123()
	{
		 b=12;
		 a=1234;
		 System.out.println(b); 
		 System.out.println(a);
	} 
	void b1234()
	{
		 b=12;
		 a=1234678;
		 System.out.println(b); 
		 System.out.println(a); 
		 
	}
	  
	
	
	public static void main(String[] args) {  
		Constructormethod k1=new Constructormethod();
//		k1.add();	 
		 k1.show("Ardhendu");  
//		 k1.first(); 
//		 k1.b123();
		 //System.out.print(b);
//		 k1.b1234();
		
	} 
}
