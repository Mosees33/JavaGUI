package javaGUI;
import java.awt.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExploreAWTcomponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame frame = new Frame("AWT application");
		//set the window size
		frame.setSize(400,400);
		
		//label
		Label label = new Label("name:");
		label.setBounds(50,50,50,20);
		
		//TextBox
		TextField txt = new TextField();
		txt.setBounds(110,50,150,20);
		
		//button
		Button btn = new Button("CLICK ME");
		btn.setBounds(110,80,100,20);
		
		//CheckBox
		Checkbox chk = new Checkbox("I agree with a terms and conditions");
		chk.setBounds(110,120,200,20);
		
		//Radiobutton
		CheckboxGroup chk_group = new CheckboxGroup();
		Checkbox radio1 = new Checkbox("Option1",chk_group,false);
		Checkbox radio2 = new Checkbox("Option2",chk_group,false);
		radio1.setBounds(110,150,100,20);
		radio2.setBounds(220,150,100,20);
		
		//list
		List list = new List();
		list.setBounds(120,180,120,80);
		list.add("Laptop");
		list.add("Mouse");
		list.add("Smarphone");
		
		//scrollBar
		Scrollbar sb = new Scrollbar();
		sb.setBounds(150,190,130,90);
		
		frame.add(label);
		frame.add(txt);
		frame.add(btn);
		frame.add(chk);
		frame.add(radio1);
		frame.add(radio2);
		frame.add(list);
		frame.add(sb);	
		
		frame.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
			frame.dispose();
		}
		});
		//set visibility for the window
		frame.setVisible(true);
		
		
	}

}
