package inner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

//event handler class
class MyListener implements ActionListener {

	//event handling method contains event handling logic
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();		//obtain the source of event
		
		if( obj instanceof JButton) {
			JButton b = (JButton)obj; 	//down-casting
			
			if(b.getText().equals("Click")) {
				//event handler logic
				b.setText("Button Clicked . . .");
			}
		}
	}
}
