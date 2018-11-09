//***********************************************************************************************
//	WordCounterFrame.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 5 Question 1
//	This application sets up the main frame for the word counter program
//***********************************************************************************************

import java.awt.*;
import javax.swing.*;

public class WordCounterFrame extends JFrame 
{
	public WordCounterFrame(String title) 
	{
		super(title);
		setSize(500, 500);
		getContentPane().add(new DisplayStatsPanel());
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) 
	{
		WordCounterFrame frame = new WordCounterFrame("Count my words!");
		frame.setVisible(true);
	}
}
