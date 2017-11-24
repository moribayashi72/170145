import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

public class Hello extends JFrame{

	Hello(String title){
		setTitle(title);
		setSize(200,200);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//buttons
		JButton btn1 = new JButton("Crick Me!!");

		//panel
		JPanel panel = new JPanel();
		panel.add(btn1);

		//Container
		Container cp = getContentPane();
		cp.add(panel, BorderLayout.CENTER);

	}
	//main
	public static void main(String[] args){
		Hello hello = new Hello("ALOHA");
		hello.setVisible(true);
	}
}