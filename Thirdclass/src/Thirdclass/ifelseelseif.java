package Thirdclass;

public class ifelseelseif {

	public static void main(String[] args) {
		ifelseelseif k1=new ifelseelseif();
		//k1.factorialnumber(); 
		//k1.amstrongnumber(); 
		k1.reversednumber();
     

	} 
	public void factorialnumber()
	{  
		//5!=5*4*3*2*1=120
		//6!=6*5*4*3*2*1=720
		System.out.println("program started"); 
		int number=5; 
		 int facorialnumber=1;
		for(int i=number; i>=1; i--)   
		{
			facorialnumber=facorialnumber*i;  //firstloop= 0,secondloop=0
		} 
		System.out.print(facorialnumber);
	} 
	public void amstrongnumber()
	{
		 //int a=123 
		 // digits over here  3
		  //1*1*1+2*2*2+3*3*3 1+8+27=36
	     //121
		//1*1*1+2*2*2+1*1*1=8 
		//153
		//1*1*1+5*5*5+3*3*3=1+125+27=153  
//		int a=1253;  
////		int length=String.valueOf(a).length();
////		int reminder = 1; 
////		int sum=0; 
//		//double finalresults=double(sum);
//		while(a>0)
//		{
////		reminder=a%10;   
////		sum=(int) (sum+Math.pow(reminder, length));
////		a=a/10;	 
//		} 
//		System.out.println(sum); 
		//System.out.println(a); 
		
//		
//		if(sum==a) {
//			 System.out.print("number is amstrong");
//		} 
//		else {
//			 System.out.print("not amstrong");
//		} 
		 int[] h= {10,20,30,50,50};
		 int results=h.length; 
		 System.out.print(results);
		 
//		int a=153568; 
//		int length=String.valueOf(a).length(); 
//		System.out.println(length);
//		double results;  
//		double sum=0;
//		while(a>0)  //153>0  15>0
//		{
//			int reminder=a%10;  // 3, 5 
//			sum=sum+Math.pow(reminder,length);  // 3^3=27  27+5^3=27+125= 152
//			a=a/10;  	 
//		} 
		//System.out.println(sum); 
	} 
	public void leap()
	{
		System.out.print("leap year");
	} 
	public void reversednumber()
	{  int a=10;
	  int b=20; 
	  if(a==b && b>a)
	  {
		   
	  } 
	  if(a!=b && b>a) 
	  {
		 // System.out.println("cfbcvb");
		  
	  }  
	  
	     //true && true //true //false
	  if(!(a<b&&b>a))  //false ! true true !false
	  { 
		   System.out.print("hi");
	  } 
	  else {
		   System.out.print("hi i am here");
	  } 
	  //hi i am here  // 
	  //hi
		 	
	}

}
