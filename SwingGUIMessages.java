package javaGUI;

import javax.swing.*;
import java.awt.*;
import java.io.File;
public class SwingGUIMessages {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
		JFrame frame = new JFrame("Swing messages");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton filechooser = new JButton("chose your file");
		JButton colorchooser = new JButton("Choose your color");
		
		filechooser.addActionListener(e -> showfilechooser(frame));
		colorchooser.addActionListener(e -> showcolorChooser(frame));
		
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(filechooser);
		panel.add(colorchooser);
		
		frame.add(panel);
		frame.setVisible(true);
		
		});

	}
	
	private static void showfilechooser(JFrame frame) {
		
		JFileChooser file = new JFileChooser();
		int result = file.showOpenDialog(frame);
		
		if(result == JFileChooser.APPROVE_OPTION) {
			File selectedfile = file.getSelectedFile();
			JOptionPane.showMessageDialog(frame, "Selected file:"+selectedfile.getAbsolutePath(),"file:",JOptionPane.INFORMATION_MESSAGE);
		}
		
		else {
			JOptionPane.showMessageDialog(frame, "File selection cancelled","warning",JOptionPane.WARNING_MESSAGE);
		}
	}
	
	  private static void showcolorChooser(JFrame frame) {
		
		  Color selectedcolor = JColorChooser.showDialog(frame, "choose a color", Color.RED);
		  if(selectedcolor != null) {
			  JOptionPane.showMessageDialog(frame, "selectedcolor : "+selectedcolor,"color chooser",JOptionPane.INFORMATION_MESSAGE);
		  }
		  else {
			  JOptionPane.showMessageDialog(frame, "selection cancelled","warning",JOptionPane.WARNING_MESSAGE);
		  }
	  }

}
