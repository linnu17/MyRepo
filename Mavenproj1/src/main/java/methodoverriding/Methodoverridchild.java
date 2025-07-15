package methodoverriding;

public class Methodoverridchild extends Methodoverparent{

	public void display()
	{
		super.display();
		System.out.println("This is child");
	}
	
	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
	super.sum(3, 9);
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Methodoverridchild obj=new Methodoverridchild();
 obj.display();
 obj.sum(25, 30);
 
	}

}
