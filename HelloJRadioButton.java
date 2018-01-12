import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloJRadioButton extends JFrame implements ActionListener{

	private JLabel l1;
  private JRadioButton rb;
  private JRadioButton rb2;
  private JRadioButton rb3;

	public static void main(String[] args){
		HelloJRadioButton hr = new HelloJRadioButton("Hello");
		hr.setVisible(true);
	}
	HelloJRadioButton(String title){
		setTitle(title);
		setSize(400,300);
    setLocation(400,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    //Label
    this.l1 = new JLabel("Label");

    //Button
    JButton b = new JButton("Crick");
    b.addActionListener(this);

    //RadioButton
    this.rb = new JRadioButton("Windows");
    this.rb2 = new JRadioButton("Linux");
    this.rb3 = new JRadioButton("Mac");

    //ButtonGroup
    ButtonGroup bg = new ButtonGroup();
    bg.add(this.rb);
    bg.add(this.rb2);
    bg.add(this.rb3);

    //MenuBar
    JMenuBar mb = new JMenuBar();

    //Menu
    JMenu m = new JMenu();

    //MenuItem
    JMenuItem mi = new JMenuItem();

    //Panel
    JPanel p = new JPanel();

    p.add(this.rb);
    p.add(this.rb2);
    p.add(this.rb3);
    p.add(b);
    p.add(this.l1);

    p.setLayout(new GridLayout(5,1));

		Container cont = getContentPane();
    Container cont2 = getContentPane();
    cont.add(p, BorderLayout.NORTH);

	}
	public void actionPerformed(ActionEvent e){
   		//ラジオボタンを調べる
      Boolean kekka = this.rb.isSelected();
      Boolean kekka2 = this.rb2.isSelected();
      Boolean kekka3 = this.rb3.isSelected();

      //調べた結果をラベルへ書き込む
      String msg = "";
      if(kekka){
        msg = this.rb.getText()+"が選択されています";
        this.l1.setText(msg);
      }else if(kekka2){
        msg = this.rb2.getText()+"が選択されています";
        this.l1.setText(msg);
      }else{
        msg = this.rb3.getText()+"が選択されています";
        this.l1.setText(msg);
      }
   	}
}