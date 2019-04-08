package com.apps1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class App1 {

	String input1;
	private JFrame frame;
	private JTextField txtEnterName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App1 window = new App1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Database Selection");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtEnterName = new JTextField();
		txtEnterName.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtEnterName.setText("Enter Database: ");
		txtEnterName.setBounds(25, 34, 386, 20);
		frame.getContentPane().add(txtEnterName);
		txtEnterName.setColumns(10);
    
		
		{

		}

	}
}
