import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPrimeNo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int lowerLimit,upperLimit;
		
		System.out.println("Enter the lower limit:");
		lowerLimit=Integer.parseInt(br.readLine());
		
		
		System.out.println("Enter the upper limit:");
		upperLimit=Integer.parseInt(br.readLine());
		int fact=0;
		int j;
		for(int i=lowerLimit;i<=upperLimit;i++)
			
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					fact++;
					
				}
				
				
			}
			if(fact==2)
			{
				System.out.println(i);
			}
			fact=0;
		}
		
		
	}

}
