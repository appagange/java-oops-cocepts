package com.test;

public class GreterNoCheck {

	public static void main(String[] args) 
	{
		int no1=45,no2=85,no3=20;
		
		if(no1>no2 && no1>no3)
		{
			System.out.print("No 1 Is Greter than others");
		}
		else if(no2>no1 && no2>no3)
		{
			System.out.print("No 2 Is Greter than others");
		}
		else
		{
			System.out.print("No 3 Is Greter than others");
		}

	}

}
