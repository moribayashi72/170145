import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fukushu4 extends JFrame{

  private JCheckBox rb;
  private JCheckBox rb2;
  private JCheckBox rb3;

	public static void main(String[] args){
		Fukushu4 hr = new Fukushu4("Hello");
		hr.setVisible(true);
	}
	Fukushu4(String title){
	setTitle(title);
	setSize(400,300);
    setLocation(400,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    //RadioButton
    this.rb = new JCheckBox("Windows");
    this.rb2 = new JCheckBox("Linux");
    this.rb3 = new JCheckBox("Mac");

    //Panel
    JPanel p = new JPanel();

    p.add(this.rb);
    p.add(this.rb2);
    p.add(this.rb3);

    p.setLayout(new GridLayout(5,1));

	Container cont = getContentPane();
    cont.add(p, BorderLayout.NORTH);

    //MenuBar
    JMenuBar mb = new JMenuBar();

    //Menu
    JMenu m = new JMenu("ファイル");
    JMenu m2 = new JMenu("編集");

    //MenuItem
    JMenuItem mi = new JMenuItem("新規作成");
    JMenuItem mi2 = new JMenuItem("アンドゥ");

    //set,add
    setJMenuBar(mb);
    mb.add(m);
    mb.add(m2);
    m.add(mi);
    m2.add(mi2);

	}
}