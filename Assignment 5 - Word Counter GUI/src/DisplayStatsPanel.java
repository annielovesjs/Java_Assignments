//***********************************************************************************************
//	DisplayStatsPanel.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 5 Question 1
//	This application initializes the panel that displays the textbox and text statistics for the 
//	user. It will count the number of words inputed in the textbox as well as calculate the 
//	average word length and present the info back to the user. 
//***********************************************************************************************

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class DisplayStatsPanel extends JPanel 
{
	private JTextArea textArea = new JTextArea();
	private JScrollPane scrolltxt = new JScrollPane(textArea);
	
	public DisplayStatsPanel() 
	{
		setLayout(new BorderLayout());
		setSize(500, 500);
		
		scrolltxt.setBounds(3, 3, 490, 300);
		scrolltxt.getVerticalScrollBar();
		
		add(scrolltxt, BorderLayout.CENTER);
		add(new StatsPanel(), BorderLayout.SOUTH);
	}
	
	public class StatsPanel extends JPanel 
	{
		private JButton calculateB;
		private JLabel wordCount;
		private JLabel averageLength;
		
		//setup panel used for displaying statistics 
		public StatsPanel() 
		{
			//setBackground(Color.cyan);

			calculateB = new JButton("Calculate");
			
			wordCount = new JLabel("Word Count is: --");
			averageLength = new JLabel("Average word length: --");
			
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			calculateB.addActionListener(new ButtonListener());
			
			setBorder(BorderFactory.createTitledBorder("Stats"));

			add(wordCount);
			add(averageLength);
			add(calculateB);
		}
		
		private class ButtonListener implements ActionListener 
		{
			//calculate and display the word count and average word length once button is clicked
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Scanner input = new Scanner(textArea.getText());
				ArrayList<String> words = new ArrayList<String>();
				String word = input.next();
				words.add(word);
				int charNum = word.length();
				
				while(input.hasNext()) 
				{
					words.add(word);
					word = input.next();
					charNum += word.length();
				}
				
				input.close();
						
				wordCount.setText("Word Count is: " + words.size());
				averageLength.setText("Average word length: " + charNum / words.size());				
			}
		}
	}
}

