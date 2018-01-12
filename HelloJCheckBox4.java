import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloJCheckBox4 extends JFrame implements ActionListener{
   JLabel lb1;
   JLabel lb2;
   JLabel lb3;
   
   public static void main(String[] args) {
      HelloJCheckBox4 frame = new HelloJCheckBox4("CHECKBOX");
      frame.setVisible(true);
   }
   HelloJCheckBox4(String title){
   	setTitle(title);
      setSize(400,300);
      setLocation(400,300);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      //CheckBox     
      JCheckBox jb1 = new JCheckBox("A",true);
      JCheckBox jb2 = new JCheckBox("B",true);
      JCheckBox jb3 = new JCheckBox("C",true);
      //Label
      this.lb1 = new JLabel("名前");
      this.lb2 = new JLabel("電話");
      this.lb3 = new JLabel("住所");
   
      // boolean
      boolean b1 = jb1.isSelected();
      boolean b2 = jb2.isSelected();
      boolean b3 = jb3.isSelected();

      //Panel
      JPanel p = new JPanel();
      JPanel p2 = new JPanel();
      p.setLayout(new GridLayout(3,3));
    
      p.add(lb1);
      p.add(lb2);
      p.add(lb3);

      p.add(jb1);
      p.add(jb2);
      p.add(jb3);

      //Button 
      JButton button = new JButton("Crick");
      button.addActionListener(this);

      p.add(button);
   
      Container cont = getContentPane();
      cont.add(p, BorderLayout.NORTH);
   }
   	//action lister
   	public void actionPerformed(ActionEvent e){
         System.out.println("CLICK!!");
         this.lb1.setText("Check");
      }
}