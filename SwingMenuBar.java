package javaGUI;

import java.awt.BorderLayout;

import javax.swing.*;

public class SwingMenuBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			JFrame frame = new JFrame("My application");
			frame.setSize(300, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			//creating a new menuBar
			JMenuBar menubar = new JMenuBar();
			
			//create menu
			JMenu filemenu = new JMenu("File");
			
			//add the items inside the menu
			JMenuItem newitem = new JMenuItem("new");
			JMenuItem openitem = new JMenuItem("open");
			JMenuItem saveitem = new JMenuItem("save");
			JMenuItem exititem = new JMenuItem("exit");
			
			//add the menu items within the menu
			filemenu.add(newitem);
			filemenu.add(openitem);
			filemenu.add(saveitem);
			filemenu.addSeparator();
			filemenu.add(exititem);
			
			//create another menu
			JMenu editmenu = new JMenu("Edit");
			
			//add some values inside the edit menu
			JMenuItem cut = new JMenuItem("cut");
			JMenuItem copy = new JMenuItem("copy");
			JMenuItem paste = new JMenuItem("paste");
			
			
			//this menu within the menu (like nested..)
			JMenu submenu = new JMenu("submenu");
			//convert this menu like checkBox...
			JCheckBoxMenuItem check = new JCheckBoxMenuItem("chekable item");
			
			submenu.add(check);
			
			//add the items within the edit menu
			editmenu.add(cut);
			editmenu.add(copy);
			editmenu.add(paste);
			//add a separator 
			editmenu.addSeparator();
			editmenu.add(submenu);
			
			
			//add all menu's inside the menuBar
			menubar.add(filemenu);
			menubar.add(editmenu);
			
			
			//insert menu bar inside the frame
			frame.setJMenuBar(menubar);
			//add the menu bar within the frame 
			frame.add(menubar,BorderLayout.NORTH);
			
			
			//create new toolBar for exploring it
			JToolBar toolbar = new JToolBar("Toolbar");
			
			//add some buttons inside the toolbBar
			JButton newbtn = new JButton(new ImageIcon("new.png"));
			JButton savebtn = new JButton(new ImageIcon("save.png"));
			JButton openbtn = new JButton(new ImageIcon("edit.png"));
			JButton cutbtn = new JButton(new ImageIcon("cut.png"));
			
			//add some messages to display when the button is clicked
			newbtn.addActionListener(e -> showMessage("new button clicked"));
			savebtn.addActionListener(e -> showMessage("save button clicked"));
			openbtn.addActionListener(e -> showMessage("edit button clicked"));
			cutbtn.addActionListener(e -> showMessage("cut button clicked"));
			
			
			//add the buttons inside the toolBar
			toolbar.add(newbtn);
			toolbar.add(openbtn);
			toolbar.add(savebtn);
			toolbar.add(cutbtn);
			
			//add the toolBar inside the frame
			frame.add(toolbar,BorderLayout.SOUTH);
			frame.setVisible(true);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//create a method to display the message whenever the button is clicked
	public static void showMessage(String s) {
		JOptionPane.showMessageDialog(null, s, "message", JOptionPane.INFORMATION_MESSAGE);
	}

}
