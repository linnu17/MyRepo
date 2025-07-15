package aggregation;

public class AggreChild {
	int mark;
	String student;
	AggreParent ref;
	public AggreChild(int mark,String student,AggreParent ref)
	{
		
		this.mark=mark;
		this.student=student;
		this.ref=ref;
        
		
	}
	public void display()
	{
		System.out.println("mark is " +mark);
		System.out.println("Student name is " +student);
		System.out.println("Age is  "  +ref.age);
		System.out.println("Name is  "  +ref.name);
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		AggreParent obj1=new AggreParent(50,"Praveen");
		AggreChild obj=new AggreChild(100,"linnu",obj1);
		obj.display();
		
		

	}

}
