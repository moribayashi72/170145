import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import java.awt.Container;

public class Testpass extends JFrame {

	//data
	//method
	Testpass(String title){
		setTitle(title);
		setSize(600,200);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();

		JTextField txt = new JTextField("",15);
		JPasswordField ps = new JPasswordField("",15);
		JLabel label = new JLabel("メールアドレス");
		JLabel label2 = new JLabel("パスワード");
		p.setLayout(new GridLayout(2,2));

		p.add(label);
		p.add(txt);
		p.add(label2);
		p.add(ps);
		Container cp = getContentPane();
		cp.add(p, BorderLayout.NORTH);

	}
	//main
	public static void main(String[] args){
		Testpass pass = new Testpass("ALOHA");
		pass.setVisible(true);
	}

}