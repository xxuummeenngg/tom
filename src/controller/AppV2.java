package controller;

import javax.swing.JFrame;
import javax.swing.JLabel;

import view.MyFrame;

public class AppV2 {
	
	
	public static void main(String args[])
	{
		JFrame mainFrame=new MyFrame();
		JLabel label=new JLabel("Hello world!");
		mainFrame.add(label);
		mainFrame.pack();
	}
}
