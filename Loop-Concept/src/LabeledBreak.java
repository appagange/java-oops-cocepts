
public class LabeledBreak {

	public static void main(String[] args) {
		
		ag:
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(i==5 && j==5)
				{
					break ag;
				}
				System.out.println(i + " "+j);
			}
		}

	}

}
