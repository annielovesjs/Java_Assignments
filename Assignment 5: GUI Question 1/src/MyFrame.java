import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame 
{
	
	public MyFrame(String title) 
	{
		super(title);
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame("Count my words!");
		frame.setVisible(true);
	}

}

