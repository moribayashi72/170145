import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloJCheckBox3 extends JFrame implements ActionListener{
   JCheckBox[] check;
   JLabel[] lbl;
   
   public static void main(String[] args) {
      HelloJCheckBox3 frame = new HelloJCheckBox3("CHECKBOX");
      frame.setVisible(true);
   }
   HelloJCheckBox3(String title){
   	setTitle(title);
      setSize(400,300);
      setLocation(400,300);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      //CheckBox     
      this.check = new JCheckBox[3];
      this.check[0] = new JCheckBox("JAVA");
      this.check[1] = new JCheckBox("PYTHON");
      this.check[2] = new JCheckBox("C/C++");
      //Label
      this.lbl = new JLabel[3];
      this.lbl[0] = new JLabel();
      this.lbl[1] = new JLabel();
      this.lbl[2] = new JLabel();
   
      //Panel
      JPanel pnl = new JPanel();
      JPanel msg = new JPanel();
      pnl.setLayout(new GridLayout(1,3));
      msg.setLayout(new GridLayout(1,3));
      for(int i = 0; i<3 ; i++){
         pnl.add(this.check[i]);
         msg.add(this.lbl[i]);
      }
      //Button 
      JButton button = new JButton("OK");
      button.addActionListener(this);
      JPanel pnlbutton = new JPanel();
      pnlbutton.add(button);
   
      Container cont = getContentPane();
      cont.add(pnl, BorderLayout.NORTH);
      cont.add(msg, BorderLayout.CENTER);
      cont.add(pnlbutton, BorderLayout.SOUTH);
   }
   	//action lister
   	public void actionPerformed(ActionEvent e){
         System.out.println("CLICK!!");
         for(int i = 0; i < 3; i++){
            if(this.check[i].isSelected()){
               this.lbl[i].setText(this.check[i].getText()+"");
            }else {
               this.lbl[i].setText("");
            }
         }
      }
}