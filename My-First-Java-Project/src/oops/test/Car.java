package oops.test;

public class Car {

	private String carNumber;
	private String carColor;
	private String carType;
	private String carBrand;
	private String carModel;
	private double carPrice;
	
	
	
	public Car() {
		
		
		super();
		System.out.println("This is default constructor");
		// TODO Auto-generated constructor stub
	}

   

	public Car(String carNumber, String carColor, String carType, String carBrand, String carModel, double carPrice) {
		super();
		System.out.println("This is Parameterized constructor");
		this.carNumber = carNumber;
		this.carColor = carColor;
		this.carType = carType;
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.carPrice = carPrice;
	}
	
	
	public void carInfoDisplay()
	{
		System.out.println(this.carNumber+" "+this.carColor+" "+this.carBrand+" "+this.carModel+" "+this.carType+" "+this.carPrice);
	}



	public static void main(String[] args) {
	
    Car car1=new Car();
    car1.carNumber="WB-09-89765";
    car1.carColor="Red";
    car1.carBrand="Maruti";
    car1.carType="Sedan";
    car1.carModel="800";
    car1.carPrice=1200000;
    
    
    Car car2=new Car("WB-65-9858","Royal Blue","sedan","XYZ","Ns56",900000);
    
    car1.carInfoDisplay();
    car2.carInfoDisplay();
	}

}
