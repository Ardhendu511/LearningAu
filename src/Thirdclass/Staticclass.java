package Thirdclass;

public class Staticclass {

	public static void main(String[] args) {
//		add(10,20); 
		Staticclass ref=new Staticclass(); 
		
		ref.sub(10, "Ardhendu"); 
		
//		ref.sub(); 
//		ref.sub1(); 
//		ref.sub2(10, 65.45f);
//		ref.sub2(10, 20);
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
