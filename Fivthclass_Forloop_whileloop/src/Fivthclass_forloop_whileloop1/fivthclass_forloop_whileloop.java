package Fivthclass_forloop_whileloop1;

import java.util.Scanner;

public class fivthclass_forloop_whileloop {

	public static void main(String[] args) {
      //1,7-2times 
		//0, 7-1 times is primenumber 
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter number"); 
		int primenumber=7;
		 int count=0; //2 
		 for(int i=1; i<=primenumber; i++)
		 { 
			  if(primenumber%i==0) {
				   //System.out.println("hi"); 
				  count=count+1;  //1+1=2
				  
			  }  
			 	 	 
		 }   

		 if(count==2)
		 {
			  System.out.print(" this is prime number");
		 } 
		 else {
			  System.out.print("Not a prime number");
		 } 

	}


}
