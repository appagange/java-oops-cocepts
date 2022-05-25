package oops.test;

public class Check {
	
	private String studentName;
	
	Check()
	{
		this.studentName="unknown";
	}

	Check(String studentName) 
	{
		
		this.studentName = studentName;
		
		
	}
	
	public void print()
	
	{
			System.out.println(this.studentName);
		
	}



	public static void main(String[] args) 
	{
		Check stud1=new Check();
		stud1.print();
		Check stud=new Check("Appa");
		stud.print();
	}

}
