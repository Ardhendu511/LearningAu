package Thirdclass;
//Add interface
interface Add{
 Character add(Character a,Character b);
}

//Sub interface
interface Sub{
   Character sub(Character a,Character b);
} 
class Cal implements Add , Sub
{
  
	@Override
	public Character sub(Character a, Character b) {
		// TODO Auto-generated method stub
		return 'c';
	}

	@Override
	public Character add(Character a, Character b) {
		// TODO Auto-generated method stub
		return 'f';
	} 



public class Interface {

	public static void main(String[] args) {
		 // instance of Cal class
        Cal x = new Cal();
    
        System.out.println("Addition : " + x.add('c','g'));
        System.out.println("Substraction : " + x.sub('f','h'));
	}

}}





