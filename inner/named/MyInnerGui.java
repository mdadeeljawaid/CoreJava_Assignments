package inner.named;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//import inner.MyGui;
//import inner.MyListener;
//GUI class
public class MyInnerGui extends JFrame{

	public static void main(String[] args) {
		//instantiate the GUI
		MyInnerGui myGui = new MyInnerGui("My Inner Gui");
	}

	public MyInnerGui(String title){
		super(title);
		
		//instantiate GUI component
		button = new JButton("Click Inner");
		
		//obtain content pane and add component to container
		Container c = getContentPane();
		c.add(button);
		
		//create event listener object
		MyListener myListener = new MyListener();
		
		//register event listener object
		button.addActionListener(myListener);
		
		//display frame
		setSize(400, 200);
		setVisible(true);
	}
	
	//class fields
	private JButton button;
//INNER CLASS
	//event handler class is a member of MyInnerGui
	class MyListener implements ActionListener {

		//event handling method contains event handling logic
		@Override
		public void actionPerformed(ActionEvent e) {
			//Object obj = e.getSource();		//obtain the source of event
			
			//if( obj instanceof JButton) {
			//	JButton b = (JButton)obj; 	//down-casting
				
		//	if(button.getText().equals("Click Inner")) {
				//event handler logic
				button.setText("Button Clicked - Inner . . .");
		//	}
			
		}
	}
}
