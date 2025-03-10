package Thirdclass;

public class Staticclass {

	public static void main(String[] args) {

		Staticclass ref=new Staticclass(); 
		
		ref.sub(10, "Ardhendu"); 
		
	}  
	
	static void add()
	{
		System.out.println("i am inside the static method"); 
	} 
	public void sub(int s, String h)
	{ 
		
		System.out.println("non static"); 
		add();
	} 
	public void sub()
	{
		System.out.println("non static123");
	} 
	public void sub1()
	{
		System.out.println("non static123345");
	} 
	public void sub2(int h,float h1)
	{
		System.out.println("non static123345");
	} 
	public void sub2(int h,int j)
	{
		System.out.println("non static123345567");
	}
	 
	

}
