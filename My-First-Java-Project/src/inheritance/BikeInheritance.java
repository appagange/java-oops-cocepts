package inheritance;

public class BikeInheritance implements Bike{
	
	public void demo()
	{
		System.out.println("This is a Demo Method");
	}
	
	public void test()
	{
		System.out.println("This is a test Method");
	}

	public static void main(String[] args) {
	
		Bike b=new BikeInheritance();
		b.demo();
		b.test();

	}

}
