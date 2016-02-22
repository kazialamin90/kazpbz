package com.sample.test;
import java.util.Arrays;


public class CodeExercise1 {
	
	int[] listOfArray1={5,100,10,125,15,150,20,175,25,0};
	int[] listOfArray2={25,93,97,18,71,114,52,48};

	public int theFirstHighestNumber(int [] number)
	{
		Arrays.sort(number);
		System.out.println("From the Class CodeExercise1 the highest number from the given  list is : "+number[number.length-1]);
		return number[number.length-1];
		
	}
	public int theSecondHighestNumber(int [] number)
	{
		Arrays.sort(number);
		System.out.println("From the class CodeExercise1 the SecondHighest number from the given list is : "+number[number.length-2]);
		return number[number.length-2];
		
	}
	
	

}
