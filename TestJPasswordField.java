import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import java.awt.Container;

public class TestJPasswordField extends JFrame {

	//data
	//method
	TestJPasswordField(String title){
		setTitle(title);
		setSize(200,200);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JTextField txt = new JTextField("ALOHA");
		JPasswordField ps = new JPasswordField("ALOHA");
		p.add(txt);
		p.add(ps);
		Container cp = getContentPane();
		cp.add(p, BorderLayout.NORTH);

	}
	//main
	public static void main(String[] args){
		TestJPasswordField pass = new TestJPasswordField("ALOHA");
		pass.setVisible(true);
	}

}