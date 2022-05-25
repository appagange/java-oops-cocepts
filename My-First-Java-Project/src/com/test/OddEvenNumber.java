package com.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class OddEvenNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int no;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		
		System.out.println("Please Enter Number");
		
		no=Integer.parseInt(b.readLine());
		
		if(no%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
