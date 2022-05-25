package oops.test;

public class EmployeeInfo {
 
  private int id;
  private String firstName;
  private String lastName;
  private int salary;
  
public EmployeeInfo() {
	
}

public EmployeeInfo(int id, String firstName, String lastName, int salary) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public int getAnnualSalary()
{
	
	return this.salary*12;
}

public int raiseSalary(int percent)
{
	return this.salary+(this.salary*percent)/100;
}


	@Override
public String toString() {
	return "EmployeeInfo [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
			+ "]";
}

	public static void main(String[] args) {
	
		EmployeeInfo employee=new EmployeeInfo(101,"Suman","Sharma",50000);
		System.out.println(employee.getAnnualSalary());
		System.out.println(employee.raiseSalary(10));
		
		System.out.println(employee);
		
		
	}

}
