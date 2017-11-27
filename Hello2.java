import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.BorderLayout;

public class Hello2 extends JFrame{

	Hello2(String title){
		setTitle(title);
		setSize(200,200);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//JPanel p = new JPanel();
		JTextField txt = new JTextField("HELLO",20);
		//p.add(txt);
		Container cp = getContentPane();
		cp.add(txt, BorderLayout.CENTER);
	}
	//main
	public static void main(String[] args){
		Hello2 hello = new Hello2("HELLO2");
		hello.setVisible(true);
	}
}