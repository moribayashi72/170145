import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fukushu5 extends JFrame implements ActionListener{

	private JLabel l1;
	private JCheckBox[] cb;
    private JRadioButton[] rb;

	public static void main(String[] args){
		Fukushu5 ff = new Fukushu5("Hello");
		ff.setVisible(true);
	}
	Fukushu5(String title){
		setTitle(title);
		setSize(400,300);
    	setLocation(400,300);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);

    	//Label
    	this.l1 = new JLabel("test");

    	//CheckBox
    	this.cb = new JCheckBox[3];
    	cb[0] = new JCheckBox("java");
    	cb[1] = new JCheckBox("C#");
    	cb[2] = new JCheckBox("C++");

    	//RadioButton
    	this.rb = new JRadioButton[3];
    	rb[0] =new JRadioButton("+");
    	rb[1]= new JRadioButton("±");
    	rb[2]= new JRadioButton("-");

    	ButtonGroup rg = new ButtonGroup();
    	rg.add(rb[0]);
    	rg.add(rb[1]);
    	rg.add(rb[2]);

    	//Button
    	JButton b = new JButton("特に意味はない");
    	b.addActionListener(this);

    	//Panel
    	JPanel p = new JPanel();

    	p.add(cb[0]);
    	p.add(cb[1]);
    	p.add(cb[2]);
    	p.add(rb[0]);
    	p.add(rb[1]);
    	p.add(rb[2]);
    	p.add(l1);
    	p.add(b);
    	p.setLayout(new GridLayout(3,3));

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
	public void actionPerformed(ActionEvent e){
		String[] msg ={"","",""};
		for(int i=0;i<3;i++){
	   		if(this.cb[i].isSelected()){
				msg[i] = this.cb[i].getText();
   			}
   		}

   		for(int n=0;n<3;n++){
   			if(this.rb[n].isSelected()){
   				this.l1.setText(msg[0]+msg[1]+msg[2]+this.rb[n].getText());
   			}
   		}
   	}
}