//***********************************************************************************************
//	Driver.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 4 Question 2
//	This application initializes the Box object and stores, in one box, the names of 5 people
// 	and in another box, store seat numbers from 1-5. The seats are randomly drawn from the seats
//	box and assigned to randomly selected people in the names box
//***********************************************************************************************

public class Driver {

	public static void main(String[] args) {
		Box<String> names = new Box<String>();
		names.add("Annie");
		names.add("Sean");
		names.add("Mary");
		names.add("Calvin");
		names.add("Jess");

		
		Box<Integer> seats = new Box<Integer>();
		seats.add(1);
		seats.add(2);
		seats.add(3);
		seats.add(4);
		seats.add(5);
	
		for(int i = 0; i < 5; i++) {
			System.out.println(names.drawItem() + " will sit at seat " + seats.drawItem());
		}
	}
}
