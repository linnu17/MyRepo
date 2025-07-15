package superkeyword;

public class Superinstchild extends Superinstance {
	String color="Red";
	
	
	public void display()
	{
	   
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Superinstchild obj=new Superinstchild();
		obj.display();
		System.out.println(obj.color);
		
	}

}
