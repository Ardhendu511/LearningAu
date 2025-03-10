package Thirdclass; 
 class zero{
	  zero( String h, int b)
	  {  
		  super();
		   System.out.println("print zero over here");
	  }
 }
	class first extends zero {
		first() 
		{     
			super("sdf", 67);
			 System.out.println("hello"); //hello
		}
	} 
	class second extends zero {
		second()
		{    
//			  super(); 
//			  super(); 
			super("Ardhendu",10);
			 System.out.println("new second ");//Second 
		}
	} 



public class inheritance_concept { 
	
	public static void main(String[] args) { 
		new second(); 
	}

}  


