package aggregation;

	public class AggreChildexample {
		int year;
		String month;
		AggreParentexample ref;
		
		public AggreChildexample(int year,String month,AggreParentexample ref)
		{
			
			this.year=year;
			this.month=month;
			this.ref=ref;
		}
		public void display()
		{
			System.out.println("year is " +year);
			System.out.println("month is " +month);
			System.out.println("date is  "  +ref.date);
			System.out.println("birthday is  "  +ref.birthday);
		}
	     public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	 
	    	 AggreParentexample obj1=new AggreParentexample(17,"Sunday");
	    	 AggreChildexample  obj=new AggreChildexample(1991,"may",obj1);
	    	 obj.display();

	}

}
