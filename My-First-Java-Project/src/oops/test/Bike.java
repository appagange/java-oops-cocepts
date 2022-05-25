package oops.test;

public class Bike {

	private String bikename;
	private String bikeColor;
	private String bikeNo;
	private String bikemodel;
	
	
	public Bike() {
		super();
		System.out.println("this is default Cunstroctor");
	}
	
	


	public Bike(String bikename, String bikeColor, String bikeNo, String bikemodel) {
		super();
		this.bikename = bikename;
		this.bikeColor = bikeColor;
		this.bikeNo = bikeNo;
		this.bikemodel = bikemodel;
	}
	
	public void Print()
	{
		System.out.println(this.bikename+this.bikeColor+this.bikeNo+this.bikemodel);
	}




	public static void main(String[] args) 
	{
		
		Bike b=new Bike();
		b.bikename="Hero";
		b.bikeColor="red";
		b.bikeNo="mh-12-mk-3077";
		b.bikemodel="2015";
		
		Bike b2=new Bike("Honda","black","mh-12","2015 livo");
		
		b.Print();
		b2.Print();
		

	}

}
