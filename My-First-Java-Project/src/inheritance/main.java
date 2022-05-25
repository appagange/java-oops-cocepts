package inheritance;

class Member
{
	private String Name;
	private int Age;
	private long PhoneNo;
	private String Address;
	private double Salary;
	
	public Member(String Name,int Age,long PhoneNo,String Address,double Salary)
	{
		this.Name=Name;
		this.Age=Age;
		this.PhoneNo=PhoneNo;
		this.Address=Address;
		this.Salary=Salary;
	}
	public void printSalary()
	{
		System.out.println("Salary Of Employee= "+Salary);
	}
	@Override
	public String toString() {
		return "Member [Name=" + Name + ", Age=" + Age + ", PhoneNo=" + PhoneNo + ", Address=" + Address + ", Salary="
				+ Salary + "]";
	}
	
}

class Employee extends Member
{
	private String specialization;
	public Employee(String Name,int Age,long PhoneNo,String Address,double Salary,String specialization)
	{
		super(Name,Age,PhoneNo,Address,Salary);
		this.specialization=specialization;
	}
	
	
}
class Manager extends Member
{
	public String department;
	public Manager(String Name,int Age,long PhoneNo,String Address,double Salary,String Department)
	{
		super(Name,Age,PhoneNo,Address,Salary);
		this.department=department;
	}
	
  
}

class main
{
	public static void main(String[] args) 
	{
		Employee em=new Employee("Appa",25,54465632,"Pune",500000,"Accounts");
		Manager mg=new Manager("Appa",25,54465632,"Pune",8544221,"IT");

		System.out.println(em.toString());
		System.out.println(mg.toString());
		em.printSalary();
		mg.printSalary();
		

	}

}
