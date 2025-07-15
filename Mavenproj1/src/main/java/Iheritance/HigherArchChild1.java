package Iheritance;

public class HigherArchChild1 extends HigherArchParent{
	
	public void show()
	{
		System.out.println("This is child1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 HigherArchChild1 obj=new HigherArchChild1();
	 obj.show();
	 obj.sum();
		

	}

}
