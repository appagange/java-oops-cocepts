package com.test;

public class Student {
	private String name;
	private int age;
	private String address;
	
	Student()
	{
		this.name="Unknown";
		this.age='0';
		this.address="Not availabele";
		
		
	}
	public void setInfo(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Student Name is: " + name + " "
                + "and Student age is: "
                + age+" "+"Student address is"+address); 
	}

	public static void main(String[] args) 
	{
		Student[] stud;
		stud=new Student[10];
		
		stud[0] =new Student();
		stud[1] =new Student();
		stud[2] =new Student();
		stud[3] =new Student();
		stud[4] =new Student();
		stud[5] =new Student();
		stud[6] =new Student();
		stud[7] =new Student();
		stud[8] =new Student();
		stud[9] =new Student();
	

		stud[0].setInfo("appa", 25,"pune");
		stud[1].setInfo("ram", 25,"pune");
		stud[2].setInfo("sham", 25,"pune");
		stud[3].setInfo("ramesh", 25);
		stud[4].setInfo("yogesh", 25,"pune");
		stud[5].setInfo("mahesh", 25,"pune");
		stud[6].setInfo("rambabu", 25,"pune");
		stud[7].setInfo("bhairu", 25,"pune");
		stud[8].setInfo("aditya",25);
		stud[9].setInfo("NTR", 25,"pune");
		
		stud[0].display();
		stud[1].display();
		stud[2].display();
		stud[3].display();
		stud[4].display();
		stud[5].display();
		stud[6].display();
		stud[7].display();
		stud[8].display();
		stud[9].display();
		

	}

}
