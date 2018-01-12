import javax.swing.*;
import java.awt.*;


public class HelloJCheckBox extends JFrame{
	HelloJCheckBox(String title){
		setTitle(title);
		setLocation(500,500);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		JCheckBox c1 = new JCheckBox("katuta");
		JCheckBox c2 = new JCheckBox("kensuke");
		JCheckBox c3 = new JCheckBox("kebabu");

		p.add(c1);
		p.add(c2);
		p.add(c3);

		Container cp = getContentPane();
		cp.add(p, BorderLayout.NORTH);

	}
	public static void main(String[] args){
		HelloJCheckBox frame = new HelloJCheckBox("Hello");
		frame.setVisible(true);
	}
}