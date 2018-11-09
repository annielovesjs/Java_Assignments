//***********************************************************************************************
//	Clown.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 4 Question 1
//	This application initializes an object (Clown) that will be used by the Parade object(s) 
//***********************************************************************************************

public class Clown {

	private String name;
	
	public Clown(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name.toString();
	}

}
