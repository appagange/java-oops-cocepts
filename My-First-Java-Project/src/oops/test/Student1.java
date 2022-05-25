package oops.test;

public class Student1 
{
	private int rollNo;
	private String studentName;
	private String studentAddress;
	private long phoneNo;
	
	Student1(int rollNo,String studentName,String studentAddress,long phoneNo)
	{
	  this.rollNo=rollNo;
	  this.studentName=studentName;
	  this.studentAddress=studentAddress;
	  this.phoneNo=phoneNo;
	}
	
	
	public void Print()
	{
		System.out.println(this.rollNo+ " "+this.studentName+" "+this.studentAddress+this.phoneNo);
	}
	
	
	public static void main(String[] args)
	{
		Student1 stud1=new Student1(11,"Sam","Pune ",95114578);
		stud1.Print();
		Student1 stud2=new Student1(13,"john","mumbai ",65213256);
		stud2.Print();
		

	}

}
