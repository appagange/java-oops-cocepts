
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorNo {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		InputStreamReader isn= new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isn);
		
		System.out.println("Enter Number");
		int i,no=Integer.parseInt(b.readLine());
	
		for(i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				
				System.out.println(i);
			}
			
		}
		
	}

}
