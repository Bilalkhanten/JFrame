import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mainframe {

	
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JLabel label;
	
	public mainframe(){ //constructor ... always the name of the class
		gui();
		
	}
	
	public void gui(){
	
		frame = new JFrame("Begin");
		frame.setVisible(true);
		frame.setSize(700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.GREEN);
		
		button = new JButton("Click");
		label = new JLabel("Label");
		
		
		panel.add(button);
		panel.add(label);
		
		frame.add(panel); //add panel to frame
		
	}
	
	public static void main(String[] args){
		new mainframe();
	}
}
