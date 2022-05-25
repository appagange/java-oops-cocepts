
public class NestedLoopBreakTest 
{
	public static void main(String[] args) 
	{
		int i=1;
		for(i=1;i<=10;i++)
		{
			int j=1;
			for(j=1;j<=10;j++)
			{
				if(i==5 && j==5)
				{
					break;
				}
				System.out.println(i +" "+ j);
				
			}
		}
	}

}
