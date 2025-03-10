package Thirdclass; 
 abstract class fivth{
	 abstract void add();
} 
class child extends fivth{

	@Override
	void add() {
		System.out.println("anything ");
	}
	 
}

public class Abstractionmethod {

	public static void main(String[] args) {
    child d=new child();
    d.add();
	}

}
