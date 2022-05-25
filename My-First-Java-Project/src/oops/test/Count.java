package oops.test;

public class Count {

	int a;
	static int b=0;
	
	Count()
	{
		this.a=this.a+1;
		b=b+1;
	}
	
	
	static void display()
	{
		System.out.println("value of b is "+b);
	}
	
	public static void main(String[] args) {
		
		Count c1=new Count();
		Count.display();
		Count c2=new Count();
		Count.display();
		Count c3=new Count();
		
		System.out.println(c3.a);
		System.out.println(Count.b);
		Count.display();
		

	}

}
