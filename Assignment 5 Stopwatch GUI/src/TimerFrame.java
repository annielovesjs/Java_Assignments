//***********************************************************************************************
//	TimerFrame.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 5 Question 2
//	This application initializes the main frame for the stopwatch display
//***********************************************************************************************

import java.awt.*;
import javax.swing.*;

public class TimerFrame extends JFrame 
{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Stopwatch");
		frame.setSize(500,500);
		frame.getContentPane().add(new TimerPanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
