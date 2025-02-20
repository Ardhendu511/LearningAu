package Thirdclass;

import java.util.Scanner;

public  class GlobalvariableAndlocalvariable {  
	
       String  firstname;       //abc=bgf , this.abc=abc 
       String  secondname;
       String lastname;
       GlobalvariableAndlocalvariable(String firstname, String secondname, String thridnamee){ 
    	   
    	   this.firstname=firstname; 
    	   this.secondname=secondname; 
    	   this.lastname=thridnamee;   
//    	     String j1=this.firstname;  
//    	     System.out.print(j1);
       }
	
	 void add()
	 { 
		
      System.out.print(this.firstname); 
      System.out.print(this.secondname); 
      System.out.print(this.lastname);
		
	 }  
	 void sub() 
	 {
		 System.out.println("firstname="+this.firstname+"secondname="+this.lastname+"thirdname="+this.lastname); 
	 }

	
	public static void main(String[] args) {
		System.out.println("program start");  
		 //firstname,secondname, thirdname   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter firstname"); 
		String firstname=sc.next();
		System.out.println("Enter Secondname");  
		String secondname=sc.next();
		System.out.println("Enter Thirdname");   
		String thirdname=sc.next();
		//new GlobalvariableAndlocalvariable(firstname, secondname, thirdname); //thirdname, thirdname, thirdname 
//		GlobalvariableAndlocalvariable ref=new GlobalvariableAndlocalvariable();
//		ref.add();  
		//new GlobalvariableAndlocalvariable(); 
		GlobalvariableAndlocalvariable ref=new GlobalvariableAndlocalvariable(thirdname, thirdname, thirdname);
		ref.add();  
		//ref.sub(); 
//		ref.sub();   
		//print value
	}

}
