package inheritance;

public class Child implements Three{

	

	@Override
	public void test() {
		System.out.println("This is Test methods");
		
	}

	@Override
	public void demo() {
		System.out.println("This is demo methods");
		
	}

	@Override
	public void sample() {
		System.out.println("This is void methods");
		
	}
public static void main(String[] args) {
	
	Three bs=new Child();
	bs.demo();
	bs.sample();
	bs.test();
		

	}

}
