package com.sample.test;


public class CodeExercise2 extends CodeExercise1
{


	public void verify()
	{
		
		assertTheFirstHighestNumberFromArray1(theFirstHighestNumber(listOfArray1),175);
		

		assertTheFirstHighestNumberFromArray2(theFirstHighestNumber(listOfArray2),114);
		
		assertionTheSecondHighestNumberFromArray1(theSecondHighestNumber(listOfArray1),150);
		
		assertionTheSecondHighestNumberFromArray2(theSecondHighestNumber(listOfArray2),97);
		
	}
	public void assertTheFirstHighestNumberFromArray1(int expectedValue, int actualValue) {
		
		if(expectedValue==actualValue)
		{
			System.out.println(" The Highest Number from listOfArray1 is "+expectedValue+" with the actualValue being "+actualValue+" is matched");
		}
		else
			System.out.println("The Highest Number from listOfArray1 is "+expectedValue+" with the actualValue being "+actualValue+" does not match");
		
	}
	
	
	public void assertTheFirstHighestNumberFromArray2(int expectedValue, int actualValue) {
		
		if(expectedValue==actualValue)
		{
			System.out.println("The Highest Number from listOfArray2 is "+expectedValue+" with actualValue being "+actualValue+" is matched");
		}
		else
			System.out.println("The Highest Number from listOfArray2 is "+expectedValue+" with actualValue being "+actualValue+" does not match");
		
	}
	
public void assertionTheSecondHighestNumberFromArray1(int expectedValue, int actualValue) {
		
		if(expectedValue==actualValue)
		{
			System.out.println("The Second Highest Number from listOfArray1 is "+expectedValue+" with the actualValue being "+actualValue+" is matched");
		}
		else
			System.out.println("The Second Highest Number from listOfArray1 is "+expectedValue+" with  the actualValue being "+actualValue+" does not match");
	}

	
		public void assertionTheSecondHighestNumberFromArray2(int expectedValue, int actualValue) {
			
			if(expectedValue==actualValue)
			{
				System.out.println("The Second Highest Number from listOfArray2 is "+expectedValue+" with the actualValue being "+actualValue+" is matched");
			}
			else
				System.out.println("The Second Highest Number from listOfArray2 is "+expectedValue+" with the actualValue being "+actualValue+"  does not match");
	 
 
		}
}
