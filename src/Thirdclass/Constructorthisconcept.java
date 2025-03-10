package Thirdclass; 




public class Constructorthisconcept { 
	Constructorthisconcept(int a, int b)
	{   
		this("Ardhendu");
		System.out.println(" hi 2");	 
		
		}
	Constructorthisconcept()
	{
		System.out.println(" hi");	 
		}
	Constructorthisconcept( char c, char j)
	{    
		this(true,"Ardhendu");
		System.out.println(" hi");	 
		}
	Constructorthisconcept(Boolean h, String h1)
	{
		System.out.println(" hi");	 
		}
	Constructorthisconcept(String h)
	{ 
		 this('c','l');
		System.out.println(" hi1");	 
		
		}

	public static void main(String[] args) {

   new Constructorthisconcept(10,20);

	}

}
