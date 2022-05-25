package oops.test;

public class Rectangle1 
{

	private double length;
	private double breadth;
	
	Rectangle1(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public void  Area()
	{
		double area=this.length*this.breadth;
		System.out.println("Area of Rectangle="+area);
	}

	
	

}
