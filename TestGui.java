import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;

public class TestGui extends JFrame {

	//data
	//method
	TestGui(String title){
		setTitle(title);
		setSize(200,200);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel p = new JPanel();
		JTextField txt = new JTextField("ALOHA",20);
		//p.add(txt);
		Container cp = getContentPane();
		cp.add(txt, BorderLayout.NORTH);

	}
	//main
	public static void main(String[] args){
		TestGui testGui = new TestGui("ALOHA");
		testGui.setVisible(true);
	}

}