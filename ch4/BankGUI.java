//Program Name: BankGUI.java
//Author Name: Dillan Poorman
//Class: CSC110AA
//Date: 4/4/2018
//Description: Driver class for gui and bank account
package ch4;

import javax.swing.JFrame;

public class BankGUI {

	public static void main(String[] args) 
	{		
		JFrame frame = new JFrame ("My Bank Account");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		BankPanel panel = new BankPanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}

}
