package InheritanceConcept;

class Aa
{
	protected long no=10;
	public void testA()
	{
	
		System.out.println("this is Class A");
	}
}

class Bb extends Aa
{
	protected long no=20;
	public void testB()
	{
	
		System.out.println("this is Class B");
	}
}

public class MaltilevelInheritance extends Bb{

	public static void main(String[] args) 
	{
		

	}

}
