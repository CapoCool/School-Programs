package game;

import java.util.*;

import javax.swing.JFrame;

public class AwesomeGame 
{
	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("Super crazy game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GamePanel panel = new GamePanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
	
}
