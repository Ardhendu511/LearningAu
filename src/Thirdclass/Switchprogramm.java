package Thirdclass;

import java.util.Scanner;

public class Switchprogramm {

	

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter your day"); 
		String day=sc.nextLine();
		String days="Sunday"; 
		float j=3.23f;
		switch (days) {
		case "Sunday": 
		     System.out.println("sun");    
		    System.out.println(" i have eat veg");
		    break;
		 
		case "Monday":
			System.out.println("Monday");  
			System.out.print(" i have eat veg");
			break;
			
		case "tuesday":
			 System.out.println("tuesday");  
			 System.out.println(" i have eat veg");
			 break;
			 
		case "Wednesday": 
			System.out.println("Wednesday");  
			System.out.println(" i have eat non-veg");
			break;
			
		case "Thursday":
			System.out.println("Wednesday");  
			System.out.println(" i have eat non-veg"); 
			break; 
			
		case "friday":
			System.out.println("friday");  
			System.out.println(" i have eat non-veg"); 
			break;  
			
		case "Saturday":
			System.out.println("friday");  
			System.out.println(" i have eat non-veg"); 
			break;
		  
		 default:{
			  System.out.println("defaults block");
		 }
		} 
		
		
		
		
		 
		 
		}
	

}
