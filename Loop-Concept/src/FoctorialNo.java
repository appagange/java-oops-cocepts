import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoctorialNo {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ins);
		System.out.println("Enter No");
		int no = Integer.parseInt(br.readLine());
		
		int i,fact=1;
		for(i=1;i<=no;i++)
		{
			fact*=i;
		}
		System.out.println("Foctorial of "+no+"is"+fact);

	}

}
