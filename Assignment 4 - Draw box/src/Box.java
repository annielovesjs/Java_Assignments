//***********************************************************************************************
//	Box.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 4 Question 2
//	This application initializes the Box generic class which allows users to store a collection of
//	items in the box and randomly an item out (which also removes it from the collection).
//***********************************************************************************************

import java.util.Arrays;

public class Box<T> 
{
	private int size = 0;
	protected T[] boxItem;
	private int initialCapacity = 1;
	
	public Box()
	{
		boxItem = (T[]) new Object[initialCapacity];
	}
	
	public void add(T item) 
	{
		//if more items are added to the arraylist than its current capacity, the capacity will increase to accommodate
		if(size >= boxItem.length)
		{
			increaseSize();
		}
		
		//add item to list and increase size count
		boxItem[size] = item;
		size++;
	}
	
	public boolean isEmpty() 
	{
		if(size == 0) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	public T drawItem() 
	{
		if(this.isEmpty() == false) 
		{
			//once the randomly selected item is drawn and remove it from the arraylist 
			int random = (int)(Math.random() * (size));
			T draw = boxItem[random];
			int temp = random;
			
			while(temp < size-1) 
			{
				//shift the items (that was positioned after the drawn item) one index backwards in the arraylist
				boxItem[temp] = boxItem[temp+1];
				boxItem[temp+1] = null;
				temp++;
			}
			
			//reduce size of arraylist by 1 to remove null element
			boxItem = Arrays.copyOf(boxItem, boxItem.length -1);
			size--;
			
			return draw;
		} 
		else 
		{
			return null;
		}
	}
	
	public void increaseSize() 
	{
		//increase capacity of list by 1 
		boxItem = Arrays.copyOf(boxItem, boxItem.length +1);
	}
	
	public String toString() 
	{
		//print the list
		return Arrays.toString(boxItem);
	}
}
