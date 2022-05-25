package com.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LeapYearCheck {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int no;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		
		System.out.println("Please Enter Year");
		
		no=Integer.parseInt(b.readLine());
		
		if(no%400==0 || no%4==0 && no%100!=0)
		{
			
				System.out.println("Leap Year");
		
			
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}

}
