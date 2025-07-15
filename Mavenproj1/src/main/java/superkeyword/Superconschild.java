package superkeyword;

public class Superconschild extends Superconstruparent{
	
	public Superconschild()
	{
		super();
		System.out.println("This is the child class");
	}
	public Superconschild(int c,int d)
  {
		super(6,2);
		System.out.println(c+d);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superconschild obj= new Superconschild();
		Superconschild obj1= new Superconschild(50,50);
	}

}
