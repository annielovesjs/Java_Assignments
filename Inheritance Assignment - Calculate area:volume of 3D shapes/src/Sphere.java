//***********************************************************************************************
//	Sphere.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 1
//	This application prompts the user for the dimensions of a sphere, then calculate its volume
//	and surface area and displays the result 
//***********************************************************************************************

import java.util.InputMismatchException;
import java.util.Scanner;

class Sphere extends Shape3D 
{
	private double radius;
	
	public Sphere(double radius) 
	{
		this.radius = radius;
	}
	
	public double getRadius() 
	{
		return radius;
	}

	@Override
	public double calculateVolume() 
	{
		return (4 * Math.PI * Math.pow(radius, 3)) / 3;
	}

	@Override
	public double calculateSurfaceArea() 
	{
		return 4 * Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() 
	{
		//calculate the volume and surface area of the shape and display the results in a string
		StringBuilder result = new StringBuilder();
		result.append("For a sphere with radius " + getRadius()  + "\n");
		
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
			System.out.println("Sphere Calculations");
			System.out.println("Enter the size of radius: ");
			Scanner input = new Scanner(System.in);
			double radius = input.nextDouble();
			
			//create a new cube class with given dimensions
			Sphere sphere1 = new Sphere(radius);
			
			//display the results of calculations
			System.out.println(sphere1);	
		} 
		catch(InputMismatchException e) 
		{
			//exception for handling non-integer inputs
			System.out.println("InputMismatchException: Error - can only input integer values");
		}
	}
}
