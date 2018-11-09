//***********************************************************************************************
//	TimerPanel.java
//
//	Annie Liang T00627460
//	COMP 1231 Assignment 5 Question 2
//	This application initializes the panel that displays the stopwatch and the buttons that 
//	control it 
//***********************************************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TimerPanel extends JPanel 
{
	JButton start = new JButton("START");
	JButton stop = new JButton("STOP");
	JButton reset = new JButton("RESET");
	int ms = 0;
	int seconds = 0;
	JLabel timer = new JLabel(seconds + "." + ms + "s", JLabel.CENTER);
	Timer msClock;
	Timer sClock;
	
	//displays the stopwatch and its buttons 
	public TimerPanel() 
	{
		setSize(500, 500);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(Box.createVerticalGlue());
		
		//setup Timer objects to increment the displayed timer for every milliseconds and seconds passed 
		msClock = new Timer(100, new ButtonListener());
		sClock = new Timer(1000, new ButtonListener());
		sClock.setActionCommand("secondsCount");
		
		timer.setFont(timer.getFont().deriveFont(64.0f));
		timer.setAlignmentX(JLabel.CENTER_ALIGNMENT);

		add(timer);
		add(new ButtonsPanel());
	}
	
	//create panel to store buttons 
	public class ButtonsPanel extends JPanel 
	{
		public ButtonsPanel() 
		{
			start.setOpaque(true);
			start.setForeground(Color.WHITE);
			start.setBackground(Color.GREEN);
			start.setBorder(null);
			start.setMnemonic('s');	
			start.setPreferredSize(new Dimension(90, 40));
			start.setFont(start.getFont().deriveFont(18.0f));
			start.addActionListener(new ButtonListener());
			
			stop.setOpaque(true);
			stop.setForeground(Color.WHITE);
			stop.setBackground(Color.RED);
			stop.setBorder(null);
			stop.setMnemonic('t');
			stop.setFont(start.getFont().deriveFont(18.0f));
			stop.setPreferredSize(new Dimension(90, 40));
			stop.addActionListener(new ButtonListener());
				
			reset.setOpaque(true);
			reset.setForeground(Color.WHITE);
			reset.setBackground(Color.GRAY);
			reset.setBorder(null);
			reset.setMnemonic('r');
			reset.setFont(start.getFont().deriveFont(18.0f));
			reset.setPreferredSize(new Dimension(90, 40));
			reset.addActionListener(new ButtonListener());
			
			add(start);
			add(stop);
			add(reset);
		}
	}
	
	private class ButtonListener implements ActionListener 
	{
		//changes the stopwatch display based on which button was clicked
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			//start incrementing the stopwatch
			msClock.start();
			if(e.getSource() == start) 
			{
				msClock.start();
				sClock.start();
				
			} 
			else if(e.getSource() == stop) 
			{
				msClock.stop();
				sClock.stop();
			} 
			else if(e.getSource() == reset) 
			{
				//reset stopwatch display to 0
				seconds = 0;
				ms = 0;
				timer.setText(Integer.toString(seconds) + "." + Integer.toString(ms) + "s");
				msClock.stop();
				sClock.stop();
			} 
			else 
			{	
				ms++;
				
				if(e.getActionCommand() == "secondsCount") 
				{
					seconds++;	
				}
				
				if(ms == 10) 
				{
					ms = 0;
				}
				
				timer.setText(Integer.toString(seconds) + "." + Integer.toString(ms) + "s");
			}	
		}	
	}
}
