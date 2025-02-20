package Thirdclass;

public class Designpattern {

	public static void main(String[] args) { 
		

		firstquestion(); 
		Secondclass(); 
		fullsqurepattern(); 
      numberincrementpyraid(); 
		numberincrementpyraid1(); 
		numberincrementpyraid2();

	} 
public static void firstquestion()
{
	for(int i=1; i<=4; i++) //This line is for row    
	{
		 for(int j=1; j<=i; j++)  //this line is for columns
		 {
			 System.out.print(1); 
			 
		 } 
		 System.out.println();
	} 
	System.out.print("\n");
}   

public static void Secondclass()
{
	for(int i=1; i<=5; i++) //This line is for row 
	{
		 for(int j=1; j<=i; j++)  //this line is for columns
		 {
			 System.out.print("*"+" ");
		 } 
		 System.out.println();
	} 
	System.out.print("\n");
}  
public static void fullsqurepattern()
{
	for(int i=1; i<=5; i++)
	{
		 for(int j=1; j<=5; j++)
		 {
			 System.out.print("*" +" ");
		 } 
		 System.out.println();
	} 
	System.out.print("\n");
} 
public static void numberincrementpyraid()
{ 
	  for (int i =1; i <= 5; i++) {
          for (int j=1; j <= i; j++) { 
              System.out.print(j+" ");
          }
          System.out.println();
      } 
	  System.out.print("\n");
} 
public static void numberincrementpyraid1()
{ 
	  for (int i =4; i >= 0; i--) {
          for (int j=1; j <= i; j++) { 
              System.out.print(j +" ");
          }
          System.out.println();
      } 
	  System.out.print("\n");
} 
public static void numberincrementpyraid2()
{   int variable=1;
	  for (int i =1; i <= 4; i++) {
          for (int j=1; j <= i; j++) { 
              System.out.print(variable +" "); 
              variable=variable+1; 
//              break; 
//              System.out.print(variable);
              
          }
          System.out.println();
      } 
	  System.out.print("\n");
}


}
