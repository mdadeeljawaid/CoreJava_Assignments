package inner;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyGui extends JFrame {

	public static void main(String[] args) {
		//instantiate the GUI
		MyGui myGui = new MyGui("MyGui");
	}
	
	//constructor
	public MyGui(String title){
		super(title);
		
		//instantiate GUI component
		button = new JButton("Click");
		
		//obtain content pane and add component to container
		Container c = getContentPane();
		c.add(button);
		
		//create event listener object
		MyListener myListener = new MyListener();
		
		//register event listener object
		button.addActionListener(myListener);
		
		//display frame
		setSize(300, 100);
		setVisible(true);
	}
	
	//class fields
	JButton button;
}
