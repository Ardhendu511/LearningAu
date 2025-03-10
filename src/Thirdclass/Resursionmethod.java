package Thirdclass;

public class Resursionmethod {

	public static void main(String[] args) {
	  int row=5; 
	  for(int i=1; i<=row; i++)
	  {
		   for(int j=1; j<=row-i; i++)
		   {
			     System.out.print(" "); 
			    
		   } 
		   for(int k=1; k<=i; k++)
		   {
			    System.out.print("*"); 
//			    break; 
			    continue;
		   }  
		   System.out.println();
		   
	  } 
	  
	  
	}


	
}
	 
	

