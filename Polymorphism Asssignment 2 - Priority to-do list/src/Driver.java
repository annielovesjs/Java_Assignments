//***********************************************************************************************
//	Driver.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 2
//	This application initializes an array references for Task objects and instantiate tasks of 
//	different types and priority values. The tasks in the array are then sorted based on priority 
//	values (from highest priority to lowest) and prints the sorted list to the console.
//***********************************************************************************************

public class Driver 
{
	//sortArray sorts tasks from highest priority to lowest 
	public static void sortArray(Task[] arr) 
	{
		Task temp;
		int arrLength = arr.length;
		
		//loop through the array and swap adjacent task objects if the first priority value is not bigger than the following objects
		for(int i = 0; i < arrLength; i++) 
		{
			for(int j = 1; j < (arrLength - i); j++) 
			{
				if(arr[j-1].compareTo(arr[j]) != 1) 
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		//create and populate an array of task objects with varying priorities 
		Task[] taskList = new Task[6];
		
		taskList[0] = new Task("Finish this assignment");
		taskList[0].setPriority(9);
		taskList[1] = new Task("Eat breakfast");
		taskList[1].setPriority(8);
		taskList[2] = new Task("Make food");
		taskList[2].setPriority(5);
		taskList[3] = new Task("Read a book");
		taskList[3].setPriority(1);
		taskList[4] = new Task("Read an article");
		taskList[4].setPriority(2);
		taskList[5] = new Task("Visit dog");
		taskList[5].setPriority(2);
		
		//sort task objects based on priority values
		sortArray(taskList);
		
		//print each object in the sorted array 
		for(Task task: taskList) 
		{
			System.out.println(task);
		}
	}
}
