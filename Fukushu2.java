import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fukushu2 extends JFrame{

	JCheckBox jc;
	JLabel l1;

	public static void main(String[] args){
		Fukushu2 ff = new Fukushu2("Hello");
		ff.setVisible(true);
	}
	Fukushu2(String title){
		setTitle(title);
		setSize(400,300);
    setLocation(400,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    //MenuBar
    JMenuBar mb = new JMenuBar();

    //Menu
    JMenu m = new JMenu("ファイル");

    //MenuItem
    JMenuItem mi = new JMenuItem("新規作成");

    //set,add
    setJMenuBar(mb);
    mb.add(m);
    m.add(mi);

	}
}