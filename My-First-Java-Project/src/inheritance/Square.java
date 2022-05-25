package inheritance;
class Shape 
{
	public void print1()
	{
		System.out.println("This is Shape");
		
	}

}
class Rectangle extends Shape
{
	public void print2()
	{
		System.out.println("This is Rectangular Shape");
	}

}

class Circle extends Rectangle
{
	public void print3() {
	System.out.println("This is Circular Shape");
	}
}


public class Square extends Circle
{
	public void print4()
	{
		System.out.println("Square is a rectangle");
	}

	public static void main(String[] args) 
	{
		Square ob=new Square();
		ob.print1();
		ob.print2();

	}

}
