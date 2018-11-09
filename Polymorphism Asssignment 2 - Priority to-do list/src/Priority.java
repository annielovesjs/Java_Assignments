//***********************************************************************************************
//	Priority.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 2
//	This application initializes an interface (priority) that will be used by Tasks objects 
//***********************************************************************************************

public interface Priority 
{
	public final double minimumPriority = 1;
	public final double mediumPriority = 5;
	public final double maximumPriority = 10;
	
	public void setPriority(double priority);
	public double getPriority();
}
