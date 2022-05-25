
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNo {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		InputStreamReader isn= new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isn);
		
		System.out.println("Enter Number");
		int i,no=Integer.parseInt(b.readLine());
		int temp = 0;
		for(i=1;i<no;i++)
		{
			if(no%i==0)
			{
				temp+=i;
				
				
			}
			
		}
		if(temp==no)
		{
			System.out.println("No is Perfect");
		}
		else
		{
			System.out.println("No is not Perfect");
		}

	}

}
