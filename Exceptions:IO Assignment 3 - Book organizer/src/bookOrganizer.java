//***********************************************************************************************
//	bookOrganizer.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 3 Question 2
//	This application reads book titles from bookTitles.inp and outputs the unique book titles
//	(removing the duplicates) into uniqueTitles.out
//***********************************************************************************************

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;

public class bookOrganizer 
{
	public static void main(String[] args) 
	{
		File filename = new File("bookTitles.inp");
		String finalFilename = "uniqueTitles.out";
		String line;
		
		//create a hashset to store the titles from reading bookTitles.inp and remove its duplicates
		HashSet<String> bookTitles = new HashSet<String>();
		
		try 
		{
			FileReader file = new FileReader(filename);
			FileWriter finalFile = new FileWriter(finalFilename);
			
			BufferedReader book = new BufferedReader(file);
			BufferedWriter uniqueBooks = new BufferedWriter(finalFile);
			
			PrintWriter outFile = new PrintWriter(uniqueBooks);

			//reads all the book titles from bookTitles.inp and add it to the hashset bookTitles
			while((line = book.readLine()) != null) 
			{
				bookTitles.add(line);
			}
					
			//set up iterator to loop through bookTitles
			Iterator<String> bookTitle = bookTitles.iterator();
			
			//for every item in the iterator bookTitle, print its unique book titles to uniqueTitles.out
			while(bookTitle.hasNext()) 
			{
				outFile.println(bookTitle.next());
			}
	
			//close the input and output files
			book.close();
			outFile.close();
		} 
		catch (FileNotFoundException e) 
		{
			//handles exception when file does not exist
			System.out.println("File not found: " + filename.toString());
		} 
		catch (IOException e) 
		{
			//handles exception for when file cannot be read
			System.out.println("Cannot read file: " + filename.toString());
		}	
	}
}
