package inner.anonymous;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import inner.MyGui;
import inner.named.MyInnerGui;

public class MyAnonymousInnerGui extends JFrame {

	public static void main(String[] args) {
		MyAnonymousInnerGui myAnonymousInnerGui 			//3
			= new MyAnonymousInnerGui("My Anonymous InnerGui");
		
		MyInnerGui myInnerGui = new MyInnerGui("My Inner Gui");	//2
		
		MyGui myGui = new MyGui("MyGui");					//1
	}

	//constructor
		public MyAnonymousInnerGui(String title){
			super(title);
			
			//instantiate GUI component
			button = new JButton("Click Anonymous Inner");
			
			//obtain content pane and add component to container
			Container c = getContentPane();
			c.add(button);
			
			//create event listener object
			//MyListener myListener = new MyListener();
			
			//register event listener object
			//button.addActionListener(/*myListener*/);
//create an anonymous class, instantiate it & pass to addActionListener()
			button.addActionListener( new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					button.setText("Button Clicked - Anonymous Inner . . .");
				} 
				
			});
			
			//display frame
			setSize(500, 300);
			setVisible(true);
		}
		
		//class fields
		private JButton button;
}

