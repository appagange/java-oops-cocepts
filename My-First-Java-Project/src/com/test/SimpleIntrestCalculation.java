package com.test;

public class SimpleIntrestCalculation {

	public static void main(String[] args) {
		double intrestAmount,principleAmount,rateOfIntrest,timeInYears;
		principleAmount=5000;
		rateOfIntrest=5;
		timeInYears=3;
		
		intrestAmount=(principleAmount*rateOfIntrest*timeInYears)/100;
		
		System.out.print("Amount"+intrestAmount);

		if(principleAmount>0 && rateOfIntrest>0 && timeInYears>0)
		{
			intrestAmount=(principleAmount*rateOfIntrest*timeInYears)/100;
			
			System.out.print("Amount"+intrestAmount);
		}
		else
		{
			System.out.print("Vale Must Be Positive");
		}
	}

}
