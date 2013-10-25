package controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import view.MyFrame;

public class TempConvert {
	
	
	public static void main(String args[])
	{
		JFrame mainFrame=new MyFrame();
		JButton button=new JButton("Press me!");
		final JTextField field=new JTextField(20);
		mainFrame.add(button,BorderLayout.NORTH);
		mainFrame.add(field,BorderLayout.SOUTH);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 double  fahrenheitValue;
				try{
					String string=field.getText();
					fahrenheitValue=Double.parseDouble(string);
					field.setText("d");
				}catch(NumberFormatException e1){
					fahrenheitValue=0;
				}
			}
		});
		mainFrame.pack();
	}
}
