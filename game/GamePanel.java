package game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.text.*;

public class GamePanel extends JPanel
{
	private JLabel name, test;
	private JTextField playerInsert, infoDisplay, infoDis2, infoDis3;
	private JButton opt1, opt2, opt3, opt4, opt5;
	
	GameBackend player1 = new GameBackend(null, 1, 0);

	public GamePanel()
	{
		setLayout(new FlowLayout());
		
		setPreferredSize(new Dimension(800, 800));
		setBackground(Color.GRAY);
		
		name = new JLabel("What do you want your name to be? ");
		
		
		playerInsert = new JTextField(10);
		infoDisplay = new JTextField(player1.getName(), 10);
		infoDis2 = new JTextField(Integer.toString(player1.getLevel()), 10);
		
		
		infoDis3 = new JTextField(Integer.toString(player1.getMoney()));
		
		opt1 = new JButton("Option 1");
		
		ButtonListener list = new ButtonListener();
		opt1.addActionListener(list);
		
		add(name);
		add(playerInsert);
		add(opt1);
		add(infoDisplay);
		
		
		
		
		
	}
	
	private class ButtonListener implements ActionListener
	{
		
		@Override
		public void actionPerformed(ActionEvent event) 
		{
			String inserted;
			
			String text = playerInsert.getText();
			inserted = text;
			
			if (event.getSource() == opt1)
			{
				player1.setName(inserted);
				infoDisplay.setText(inserted);
				remove(name);
				
			}
			
			else
			{
				name = new JLabel("Insert a damn name: ");
			}
			
		}
	}	
}
