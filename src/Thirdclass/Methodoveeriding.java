package Thirdclass; 
class firstmethod{
	    void add() {
		  System.out.println("First class");
	 }
} 
class secondclass extends firstmethod {
	    void add() { 
		   super.add();
		   System.out.println("My secondclass");
	  }
}  
class secondclass1 extends secondclass {
    void add() { 
	   super.add();
	   System.out.println("My secondclass123");
  }
} 


public class Methodoveeriding {

	public static void main(String[] args) {
		secondclass1 k1=new  secondclass1(); 
		k1.add();
		

	}

}
