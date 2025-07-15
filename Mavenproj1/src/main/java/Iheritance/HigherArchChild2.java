package Iheritance;

public class HigherArchChild2 extends HigherArchParent{
	
	public void display()
	{
		System.out.println("This is child2 ");
	}

	public static void main(String[] args) {
		
		HigherArchChild2 obj=new HigherArchChild2();
		 obj.display();
		 obj.sum();
		// TODO Auto-generated method stub

	}

}
