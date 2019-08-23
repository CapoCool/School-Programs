//Program Name: BankPanel.java
//Author Name: Dillan Poorman
//Class: CSC110AA
//Date: 4/4/2018
//Description: class gui
package ch4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankPanel extends JPanel
{
	private JLabel accountNameLabel, accountNumberLabel, accountBalanceLabel, accountStatusLabel, depwithAmountLabel;
	private JPanel buttonPanel;
	private JTextField amountDepWith, accountName, acctNumber, acctBalance, acctStatus;
	private JButton deposit, withdraw;

	BankAccount3 myAcct = new BankAccount3();
	
	public BankPanel() 
	{
		setLayout(new FlowLayout());//figuring out how to format this thing took me 3 hours... worth it.
		
		//stuff for account name
		accountNameLabel = new JLabel("Account Name: ");
		accountName = new JTextField(10);
		accountName.setText(myAcct.getName());
		
		//stuff for account number
		accountNumberLabel = new JLabel ("Account number: ");
		acctNumber = new JTextField(10);
		acctNumber.setText(Integer.toString(myAcct.getAcctNumber()));
		
		//stuff for account balance
		accountBalanceLabel = new JLabel("Account balance: ");
		acctBalance = new JTextField(10);
		acctBalance.setText(Double.toString(myAcct.getBalance()));
		
		//stuff for account status
		accountStatusLabel = new JLabel("     Account status: ");
		acctStatus = new JTextField(10);
		acctStatus.setText(myAcct.setStatus());
		
		//stuff for deposit and withdraw. Looks like depth and width but I am already committed to the names.
		depwithAmountLabel = new JLabel("Deposit/Withdraw amount: ");
		amountDepWith = new JTextField(7);
		
		//adding to gui
		add(accountNameLabel);
		add(accountName);
		add(accountNumberLabel);
		add(acctNumber);
		add(accountBalanceLabel);
		add(acctBalance);
		add(accountStatusLabel);
		add(acctStatus);
		
		//setting size
		setPreferredSize(new Dimension(300, 300));
		setBackground(Color.cyan);
		
		//creating button objects
		deposit = new JButton("Deposit");
		withdraw = new JButton("Withdraw");
		
		//creating listener for 
		ButtonListener listener = new ButtonListener();
		deposit.addActionListener(listener);
		withdraw.addActionListener(listener);
		
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(20, 80));
		buttonPanel.setBackground(Color.cyan);
		buttonPanel.add(deposit);
		buttonPanel.add(withdraw);
		add(deposit);
		add(withdraw);
		add(depwithAmountLabel);
		add(amountDepWith);
	}
	private class ButtonListener implements ActionListener
	{


		public void actionPerformed(ActionEvent event) 
		{
			double depositAmount;
			
			String text = amountDepWith.getText();
			depositAmount = (Double.valueOf(text));
			
			if (event.getSource() == deposit)
			{				
				myAcct.deposit(depositAmount);
				acctBalance.setText(Double.toString(myAcct.getBalance()));
				acctStatus.setText(myAcct.setStatus());
			}
			
			else
			{
				myAcct.withdraw(depositAmount);
				acctBalance.setText(Double.toString(myAcct.getBalance()));
				acctStatus.setText(myAcct.setStatus());
			}
			
		}
		
	}
	
}