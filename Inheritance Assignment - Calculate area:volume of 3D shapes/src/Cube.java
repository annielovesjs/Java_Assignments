//***********************************************************************************************
//	Cube.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 1
//	This application prompts the user for the dimensions of a cube, then calculate its volume
//	and surface area and displays the result 
//***********************************************************************************************

import java.util.InputMismatchException;
import java.util.Scanner;

class Cube extends Shape3D 
{
	protected double side;
	
	public Cube(double side) 
	{
		this.side = side;
	}
	
	public double getSide() 
	{
		return side;
	}
	
	@Override
	public double calculateVolume() 
	{
		return Math.pow(side, 3);
	}
	
	@Override
	public double calculateSurfaceArea() 
	{
		return 6 * Math.pow(side, 2);
	}	
	
	public String toString() 
	{
		//calculate the volume and surface area of the shape and display the results in a string
		StringBuilder result = new StringBuilder();
		result.append("For a cube with side length of " + getSide() + "\n");
		
		String volume = "The volume is " + calculateVolume() + "\n";
		String surfaceArea = "The surface area is " + calculateSurfaceArea() + "\n";
		
		result.append(volume).append(surfaceArea);
		return result.toString();
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			//prompt and accept user's input for the shapes' dimensions 
			System.out.println("Cube calculations");
			System.out.println("Enter the length of one side: ");
			Scanner input = new Scanner(System.in);
			double side = input.nextDouble();
			
			//create a new cube class with given dimensions 
			Cube cube1 = new Cube(side);
			
			//display the results of calculations
			System.out.println(cube1);
		} 
		catch(InputMismatchException e) 
		{
			//exception for handling non-integer inputs
			System.out.println("InputMismatchException: Error - can only input integer values");
		}
	}
}

