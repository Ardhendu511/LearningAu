package Thirdclass;

public class Accessspecifier { 
	   public  static void add() {
		    System.out.println(" hello world ");
	   } 
	   protected static void sub()
	   {
		    System.out.println(" hello sub");
		    
	   } 
	   private static void mul()
	   {
		    System.out.println("Multiple method");
	   } 
	  static void  div()
	   {
		  System.out.println("Divison method"); 
	   }

	public static void main(String[] args) {
		 add(); 
		 sub();
		 mul();
		 div();
		 
     
	}

}
