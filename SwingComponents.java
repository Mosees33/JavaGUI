package javaGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class SwingComponents {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("REGISTRATION FORM");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(500,500);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(7,2,10,10));
		
		JLabel name = new JLabel("name :");
		JLabel gender = new JLabel("gender :");
		JLabel interest = new JLabel("interest :");
		
		//textField
		JTextField nameField = new JTextField();
		
		//radioButton
		JRadioButton male = new JRadioButton("male");
		JRadioButton female = new JRadioButton("female");
		ButtonGroup gender1= new ButtonGroup();
		gender1.add(male);
		gender1.add(female);
		
		//checkBox
		JCheckBox chk1 = new JCheckBox("Reading");
		JCheckBox chk2 = new JCheckBox("Listening");
		JCheckBox chk3 = new JCheckBox("Learning");
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new  ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
			String name = nameField.getText();
			String gender = male.isSelected()? "Male" : "Female";
			String interest = "";
				if(chk1.isSelected())
					interest += "Reading";
				if(chk2.isSelected())
					interest += "Listening";
				if(chk3.isSelected())
					interest += "Learning";
				
				String message = "name " +name+"\n gender "+gender+"\n Interests "+interest;
				JOptionPane.showConfirmDialog(frame, message, "Registration SuccesFull", JOptionPane.INFORMATION_MESSAGE);
				}
		});;
		
		panel.add(name);
		panel.add(nameField);
		panel.add(gender);
		panel.add(new JLabel());
		panel.add(male);
		panel.add(female);
		panel.add(interest);
		panel.add(new JLabel());
		panel.add(chk1);
		panel.add(new JLabel());
		panel.add(chk2);
		panel.add(chk3);
		panel.add(submit);
		
		
		frame.add(panel);
		frame.setVisible(true);
		
		
		
		
	}

	

}
