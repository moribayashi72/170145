import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Container;
public class TestCheckBox extends JFrame {

	//data
	//method
	TestCheckBox(String title){
		setTitle(title);
		setSize(600,200);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();

		JCheckBox c1 = new JCheckBox("Linux");
		JCheckBox c2 = new JCheckBox("Windows");
		JCheckBox c3 = new JCheckBox("Android");

		p.add(c1);
		p.add(c2);
		p.add(c3);

		Container cp = getContentPane();
		cp.add(p, BorderLayout.NORTH);

	}
	//main
	public static void main(String[] args){
		TestCheckBox pass = new TestCheckBox("ALOHA");
		pass.setVisible(true);
	}

}