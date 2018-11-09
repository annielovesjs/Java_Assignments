//***********************************************************************************************
//	TextPanel.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 5 Question 1
//	This application initializes the Text panel that store user input and be used to calculate 
//	statistics. 
//***********************************************************************************************

import java.awt.*;
import javax.swing.*;

public class TextPanel extends JPanel 
{
	private JTextArea textArea = new JTextArea();
	private JScrollPane scrolltxt = new JScrollPane(textArea);
	
	public TextPanel() 
	{
		scrolltxt.setBounds(3, 3, 490, 300);
		scrolltxt.getVerticalScrollBar();
		setSize(500, 50);
		setLayout(null);
		add(scrolltxt);
		setBackground(Color.YELLOW);
		setVisible(true);
	}
}
