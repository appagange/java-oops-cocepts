package oops.test;

public class Fruits {
	
	static String companyName="ABC food products"; //Static Variable
	private String name;       //Non-static
	private String color;
	private double price;
	
	Fruits(String name,String color,double price)
	{
		
		this.name=name;
		this.color=color;
		this.price=price;
	}
	
	public Fruits() {
		System.out.println("This is the default constructor..");
	}

	public void display()
	{
		System.out.println(this.name+" "+this.color+" "+this.price+" "+companyName );
	}

	public static void main(String[] args) {
		
		Fruits fruit=new Fruits("Mango","Yellow",60);
		Fruits fruit1=new Fruits("Banana","Yellow",30);
		
		System.out.println(Fruits.companyName);
		
		fruit.display();
		fruit1.display();

	}

}
