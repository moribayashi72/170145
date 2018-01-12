import javax.swing.*;
import java.awt.*;


public class HelloJCheckBox2 extends JFrame{
	HelloJCheckBox2(String title){
		setTitle(title);
		setLocation(500,500);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,1));

		JCheckBox c1 = new JCheckBox("katuta",true);
		JCheckBox c2 = new JCheckBox("kensuke",true);
		JCheckBox c3 = new JCheckBox("kebabu",true);

		p.add(c1);
		p.add(c2);
		p.add(c3);

		Container cp = getContentPane();
		cp.add(p, BorderLayout.NORTH);

	}
	public static void main(String[] args){
		HelloJCheckBox2 frame = new HelloJCheckBox2("Hello");
		frame.setVisible(true);
	}
}