//***********************************************************************************************
//	AverageFinder.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 3 Question 1
//	This application prints the average of the 10 integers given by the user
//***********************************************************************************************

import java.util.Scanner;

public class AverageFinder 
{
	public static void main(String[] args) 
	{
		boolean notValid = true;
		Scanner input = null;
		String numInput;
		int num = 0;
		double sum = 0;
		
		System.out.print("Enter 10 integers to find the average: " + "\n");
		
		//prompts user to input up to 10 integers 
		for(int i = 0; i < 10; i++) 
			{
				//check if input is valid integer, if not, handle the exception and prompt user for another integer
				while(notValid) {
					try 
					{
						//prompt user and keep track of for integer input
						System.out.print((i + 1) + ": ");
						
						input = new Scanner(System.in);
						numInput = input.next();
						
						//convert string input to integer 
						num = Integer.parseInt(numInput);
						
						notValid = false;
					}
					catch(NumberFormatException e) 
					{
						System.out.println("Invalid input: Please enter a INTEGER value (no decimals or characters): ");
					}
				}
				
				//add integer input to total sum 
				sum += num;
				
				notValid = true;
			}
	
			//print the average of the 10 numbers
			System.out.println(sum / 10);
	}
}
