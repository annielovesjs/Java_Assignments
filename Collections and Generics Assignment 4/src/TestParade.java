//***********************************************************************************************
//	TestParade.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 4 Question 1
//	This application initializes the Parade object, adds, and removes Clown objects. The
//	results are then printed to the console.
//***********************************************************************************************

public class TestParade {

	public static void main(String[] args) 
	{
		Parade<Clown> parade1 = new Parade<Clown>(4);
				
		parade1.add(new Clown("Annie"));
		parade1.add(new Clown("Samuel"));
		parade1.add(new Clown("Vanessa"));
		parade1.add(new Clown("Samantha"));
		
		System.out.println(parade1);
		
		parade1.remove();
		parade1.remove();
		
		System.out.println(parade1);
		
		parade1.add(new Clown("Cal"));
		parade1.add(new Clown("Caitlin"));
		
		System.out.println(parade1);

	}
}