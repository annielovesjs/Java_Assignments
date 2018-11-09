//***********************************************************************************************
//	Driver.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 1
//	This application initializes an array references for 3D shapes and instantiate shapes of 
//	different types and dimensions. The volume is then calculated and printed for each shape in 
//	the array.
//***********************************************************************************************

public class Driver
{
	public static void main(String[] args) 
	{
		//create and populate an array referencing different shapes with varying dimensions 
		Shape3D[] shapes = new Shape3D[5];
		shapes[0] = new Cube(4); 
		shapes[1] = new Sphere(6);
		shapes[2] = new Cylinder(4.5, 5.6);
		shapes[3] = new Sphere(2.1);
		shapes[4] = new Cylinder(15, 1);
		
		//print the calculation results for each shape in the array
		for(Shape3D shape : shapes) 
		{
			System.out.println(shape);
		}
	}
}
