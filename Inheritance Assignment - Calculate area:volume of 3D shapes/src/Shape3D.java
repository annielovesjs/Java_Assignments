//***********************************************************************************************
//	Shape3D.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 1
//	This application initializes a parent class (for 3D shapes) with abstract methods that all
//	derived 3D shapes can inherit from
//***********************************************************************************************

public abstract class Shape3D 
{
	public abstract double calculateVolume();
	public abstract double calculateSurfaceArea();
	public abstract String toString();
}
