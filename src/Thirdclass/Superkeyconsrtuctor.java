package Thirdclass;

public class Superkeyconsrtuctor { 
	
	Superkeyconsrtuctor(int a, int b)
	{     
		this("Ardhendu","mohanty");
		 System.out.println("How my integer constructor");
	} 
	Superkeyconsrtuctor(String b, String b1)
	{
		 System.out.println("How my String constructor");
	} 
	Superkeyconsrtuctor(char c, char d)
	{
		 System.out.println("How my char constructor");
	} 
	Superkeyconsrtuctor(double d, double k)
	{   
		this(10, 20);
		 System.out.println("How my double constructor");
	}
	public static void main(String[] args) {
		new Superkeyconsrtuctor(10,20);  
//		new Superkeyconsrtuctor(12,20);
//		new Superkeyconsrtuctor('c','l');

	}

}
