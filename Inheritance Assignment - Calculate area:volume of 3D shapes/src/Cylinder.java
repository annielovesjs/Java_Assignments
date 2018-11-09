//***********************************************************************************************
//	Cylinder.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 1
//	This application prompts the user for the dimensions of a cylinder, then calculate its volume
//	and surface area and displays the result 
//***********************************************************************************************

import java.util.InputMismatchException;
import java.util.Scanner;

class Cylinder extends Shape3D 
{
	protected double radius;
	protected double height;
	
	public Cylinder(double radius, double height) 
	{
		this.radius = radius;
		this.height = height;
	}
	
	public double getRadius() 
	{
		return radius;
	}
	
	public double getHeight() 
	{
		return height;
	}

	@Override
	public double calculateVolume() 
	{
		return Math.PI * Math.pow(radius, 2) * height;
	}

	@Override
	public double calculateSurfaceArea() 
	{
		return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() 
	{
		//calculate the volume and surface area of the shape and display the results in a string
		StringBuilder result = new StringBuilder();
		result.append("For a cylinder of radius " + getRadius() + " and height of " + getHeight() + "\n");
		
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
			System.out.println("Cylinder calculations");
			System.out.println("Enter size of radius: ");
			Scanner radiusInput = new Scanner(System.in);
			double radius = radiusInput.nextDouble();
			
			System.out.println("Enter height: ");
			Scanner heightInput = new Scanner(System.in);
			double height = heightInput.nextDouble();
			
			//create a new cube class with given dimensions
			Cylinder cylinder1 = new Cylinder(radius, height);
			
			//display the results of calculations
			System.out.println(cylinder1);
			
		} 
		catch(InputMismatchException e) 
		{
			//exception for handling non-integer inputs
			System.out.println("InputMismatchException: Error - can only input integer values");
		}
	}
}


