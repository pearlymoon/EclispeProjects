package com.Lucas.GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;



// Just copy this code to make a gui

public class GUI implements ActionListener {
	
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public GUI() {
		
		frame = new JFrame();
		JButton button = new JButton("Click Me");
		button.addActionListener(this);
		label = new JLabel("Number of Clicks: 0");
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(60, 60, 10, 60));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new GUI();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of Clicks: " + count);
		
	}

}
