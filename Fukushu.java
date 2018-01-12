import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fukushu extends JFrame implements ActionListener{

	JCheckBox jc;
	JLabel l1;

	public static void main(String[] args){
		Fukushu ff = new Fukushu("Hello");
		ff.setVisible(true);
	}
	Fukushu(String title){
		setTitle(title);
		setSize(400,300);
    	setLocation(400,300);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);

    	//Label
    	this.l1 = new JLabel("test");

    	//CheckBox
    	this.jc = new JCheckBox("試験",true);

    	//Button
    	JButton b = new JButton("特に意味はない");
    	b.addActionListener(this);

    	//Panel
    	JPanel p = new JPanel();

    	p.add(l1);
    	p.add(jc);
    	p.add(b);
    	p.setLayout(new GridLayout(2,2));

		Container cont = getContentPane();
    	cont.add(p, BorderLayout.NORTH);
	}
	public void actionPerformed(ActionEvent e){
   		if(this.jc.isSelected()){
   			this.l1.setText(this.jc.getText()+"check1");
   		} else {
   			this.l1.setText("nasi");
   		}
   	}
}