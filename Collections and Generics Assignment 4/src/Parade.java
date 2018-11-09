//***********************************************************************************************
//	Parade.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 4 Question 1
//	This application initializes the Parade arraylist which manages instances of class clown. 
//	Users can add a clown to the parade at the back only and only remove clowns at the beginning
//	of the array.
//***********************************************************************************************

import java.util.Arrays;

public class Parade<T>
{
	private T[] myParade;
	private int initialCapacity;
	private int actSize = 0;
	
	public Parade(int initialCapacity) 
	{
		this.initialCapacity = initialCapacity;
		myParade = (T[]) (new Object[initialCapacity]);
	}
	
	public void add(T o)
	{
		//if size of the array has reached its capacity, the capacity will increase to accomodate and then add the requested item
		if(actSize >= myParade.length) 
		{
			increaseListCapacity();
		} 
		
		myParade[actSize] = o;
		actSize++;
	}
	
	public T get(int index) throws ArrayIndexOutOfBoundsException
	{
		//returns the item in the array if it exists
		if(index < actSize) 
		{
			return myParade[index];
		} 
		else if(index < initialCapacity) 
		{
			return null;
		}
		
		throw new ArrayIndexOutOfBoundsException("Array index does not exist");
	}
	
	public T remove() throws ArrayIndexOutOfBoundsException
	{
		if(actSize!=0) 
		{
			T temp = null;

			//shift all the array items one position backwards to remove the first element 
			for(int i = 0; i < actSize -1; i++) 
			{
				temp = myParade[i+1];
				myParade[i] = temp;
				myParade[i+1] = null; 
			}
			
			//remove empty space (null) at the end of the arraylist and update size
			myParade = Arrays.copyOf(myParade, myParade.length-1);
			actSize--;
			
			return temp;
		} 
		throw new ArrayIndexOutOfBoundsException("Cannot remove more than the exisiting items in the list");
	}
	
	public int size() 
	{
		return actSize;
	}
	
	private void increaseListCapacity() 
	{
		//increase capacity of arraylist by 1
		myParade = Arrays.copyOf(myParade, myParade.length+1);
	}
	
	public String toString() {
		//return string representation of the arraylist items
		return Arrays.toString(myParade);
	}
}
