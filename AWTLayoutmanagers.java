package javaGUI;
import java.awt.*;
import java.awt.event.*;
public class AWTLayoutmanagers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame frame = new Frame("AWT application");
		//set the window size
		frame.setSize(400,400);
		
		FlowLayout flow = new FlowLayout();
		Panel panel1 = new Panel(flow);
		
		panel1.add(new Button("Button1"));
		panel1.add(new Button("Button2"));
		panel1.add(new Button("Button3"));
		panel1.add(new Button("Button4"));
		panel1.add(new Button("Button5"));
		
		frame.add(panel1);
		
		BorderLayout bl = new BorderLayout();
		frame.setLayout(bl);
		
		Button b1 = new Button("Button1");
		Button b2 = new Button("Button2");
		Button b3 = new Button("Button3");
		Button b4 = new Button("Button4");
		Button b5 = new Button("Button5");
		
		frame.add(b1,BorderLayout.NORTH);
		frame.add(b2,BorderLayout.EAST);
		frame.add(b3,BorderLayout.WEST);
		frame.add(b4,BorderLayout.SOUTH);
		frame.add(b5,BorderLayout.CENTER);
		
		GridLayout grid = new GridLayout();
		Panel panel2 = new Panel(grid);
		
		panel2.add(new Button("Button1"));
		panel2.add(new Button("Button2"));
		panel2.add(new Button("Button3"));
		panel2.add(new Button("Button4"));
		
		frame.add(panel2);
		
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
		System.exit(0);
			}
		});
		//set visibility for the window
		frame.setVisible(true);
	
	}

}
