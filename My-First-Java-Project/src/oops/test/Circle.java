package oops.test;

public class Circle {
	
	private static double redius;
	
	Circle()
	{
		
	}
	
	Circle(double redius)
	{
		this.redius=redius;
	}
	
	public double getRedius() 
	{
		return redius;
		
	}
	
	public void setRedius(double redius)
	{
		this.redius=redius;
		
	}
	
	public double getArea()
	{
		return redius*redius*Math.PI;
	}
	
	public double getCircumference()
	{
		return 2*Math.PI*redius;
	}
	
	
	

	@Override
	public String toString() {
		return "Circle []";
	}

	public static void main(String[] args) 
	{
		Circle c1=new Circle();
		c1.setRedius(5);
		c1.toString();
		
		System.out.println(c1.getArea());
		System.out.println(c1.getCircumference());

	}

}
