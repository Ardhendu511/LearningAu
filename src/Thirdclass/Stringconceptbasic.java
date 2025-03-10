package Thirdclass;

import java.util.Scanner;

public class Stringconceptbasic {

	public static void main(String[] args) {
		//System.out.println(" progarm string"); 
		//String h1="hello world";
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter String value"); 
//		String h=sc.nextLine(); 
//		//System.out.print("my string value="+h); 
////		 String h="new";
////		 int j=h.length(); 
////		 System.out.println(); 
//		System.out.println(h.toLowerCase());
		 
//		String k="       hello world      ";
//		System.out.println(k); 
//		System.out.println(k.trim()); 
//		String h="hello";
//		String b="HELLO";
//		if(h.equalsIgnoreCase(b)) {
//			System.out.print(" both are same ");
//		} 
//		else {
//			 System.out.println(" Both are not same ");
//		}
  
//		 String h="hello world new";
//		 if(h.contains("hello123")) {
//			 System.out.println(" yes hello is present ");
//		 } 
//		 else {
//			  System.out.println(" not hello");
//		 } 
//		String h="hello world";
//		System.out.println(h.substring(2)); 
//		System.out.print(h.substring(3, 10)); 
//		
//		 String h="hello";
//		 char j=h.charAt(3);  
//		 int k=h.lastIndexOf("h");
//		  System.out.println(j);  
//		  System.out.print(k); 
		String  h1 =" hello world";
		String b=h1.replaceAll("hello world", "djhslksghduifosdghiosdh");
//		System.out.print(b); 
		//reversed a string 
		String  k1="aba";   //4-o,3-l2-l1-e 0-h ollep
		int j=k1.length();  
		String hp="";
		//System.out.println(j);
for( int i=k1.length()-1; i>=0; i--)
{
	char ch=k1.charAt(i); 
	hp=hp+ch; 
	
} 
//System.out.println(hp); 
if(k1.equals(hp))
{
	 System.out.print(" it is a pallidrome");
} 
else {
	 System.out.println(" it is not a pallidrome");
}
		  
	}

}
