//***********************************************************************************************
//	Task.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 2
//	This application initializes the task object which allows for users to add and store a new
//	task and a priority rank. The rank can be used to compare against another task object's
//	priority. 
//***********************************************************************************************

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task implements Priority, Comparable<Task>
{
	private String description;
	private double priority;
	private String ranking;
	
	public Task(String description) 
	{
		this.description = description;
	}
	
	@Override
	public void setPriority(double priority)
	{
		//if input is within the numeric range provided, set priority to the input, otherwise, prompt the user for another number
		if(priority >= minimumPriority && priority <= maximumPriority) 
		{
			this.priority = priority;
			
			if(priority >= minimumPriority && priority < mediumPriority) 
			{
				ranking = "Low Priority - ";
			} 
			else if(priority > mediumPriority) 
			{
				ranking = "High Priority - ";
			} 
			else 
			{
				ranking = "Medium Priority - ";
			}
		} 
		else 
		{
			System.out.println("Invalid input for: " + description + ". Please enter a number from 1 to 10 (1 = lowest priority, 10 = highest priority): ");
			Scanner priorityInput = new Scanner(System.in);
			double priorityNew = priorityInput.nextDouble();
			
			this.setPriority(priorityNew);
			priorityInput.close();
		}
	}

	@Override
	public double getPriority() 
	{
		return priority;
	}
	
	@Override
	public int compareTo(Task o) 
	{
		if(o.getPriority() > priority)
		{
			return -1;
		}
		else if(o.getPriority() < priority) 
		{
			return 1;
		}
		
		return 0;
	}
	
	public String toString() 
	{
		StringBuilder task = new StringBuilder();
		task.append(ranking).append(priority).append(": ").append(description);
		return task.toString();
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			//prompt the user for a task 
			System.out.println("What task do you need to do?");
			Scanner taskInput = new Scanner(System.in);
			String taskHere = taskInput.nextLine();
			
			//prompt the user for a priority ranking 
			System.out.println("How important is this task (from a scale of 1 to 10)");
			Scanner rankInput = new Scanner(System.in);
			double rank = rankInput.nextDouble();
			
			//create task object with given inputs and print object to console
			Task task = new Task(taskHere);
			task.setPriority(rank);
		
			taskInput.close();
			rankInput.close();

			System.out.println(task);
		} 
		catch(InputMismatchException e) 
		{ 
			//exception for handling non integer/double inputs
			System.out.println("Invalid input: need to provide a number");
		}
	}

}
