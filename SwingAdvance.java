package javaGUI;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class SwingAdvance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Task Manager");
		
		//task table
		String[] columns = {"Task","Category","Priority","Completion"};
		
		//task table
		Object[][] data = {{"Task1","work","High",30},{"Task2","personal","Medium",50},
				{"Task3","work","Low",80}};
		
		//Table for adding the values
		JTable tasktable = new JTable(new DefaultTableModel(data,columns));
		
		//scroll pane
		JScrollPane tablescrollpane = new JScrollPane(tasktable);
		
		//tree ->task tree -> root
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Categories");
		DefaultMutableTreeNode worknode = new DefaultMutableTreeNode("Work");
		DefaultMutableTreeNode personalnode = new DefaultMutableTreeNode("personal");
		
		root.add(worknode);
		root.add(personalnode);
		
		JTree tasktree = new JTree(root);
		JScrollPane treescrollpane = new JScrollPane(tasktree);	
		
		//list
		String[] priorityLevels = {"High","Medium","Low"};
		JList<String> prioritylist = new JList(priorityLevels);
		JScrollPane listscrollpane = new JScrollPane(prioritylist);
		
		
		JTabbedPane tabPane = new JTabbedPane();
		tabPane.add("All tasks", tablescrollpane);
		tabPane.add("Categories", treescrollpane);
		tabPane.add("priorityList", listscrollpane);
		
		//progress bar
		JProgressBar Progress = new JProgressBar();
		Progress.setStringPainted(true);
		
		//JSlider
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,100,50);
		slider.setMajorTickSpacing(25);
		slider.setMinorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		//spinner
		SpinnerModel spinner = new SpinnerNumberModel(2,0,3,1);
		JSpinner taskspinner = new JSpinner(spinner);
		
		//layout
		frame.setLayout(new BorderLayout());
		frame.add(tabPane,BorderLayout.CENTER);
		frame.add(createprioritypanel(slider),BorderLayout.SOUTH);
		frame.add(createprogresspanel(Progress),BorderLayout.NORTH);
		frame.add(createspinnerpanel(taskspinner),BorderLayout.EAST);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,500);
		frame.setVisible(true);
	}
	
	private static JPanel createprioritypanel(JSlider slider) {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(new JLabel("task priority"));
		panel.add(slider);
		
		return panel;
	}
	
	private static JPanel createprogresspanel(JProgressBar progress) {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(new JLabel("task completion : "));
		panel.add(progress);
		
		return panel;
	}
	
	private static JPanel createspinnerpanel(JSpinner taskspinner) {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(new JLabel("Number of tasks : "));
		panel.add(taskspinner);
		
		return panel;
	}
	

}
