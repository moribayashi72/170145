import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
public class AlohaGui extends JFrame implements ActionListener{
  private JTextField jTF = new JTextField(10);
  private String data = "ALOHA";

  public static void main(String[] args){
    AlohaGui gi = new AlohaGui("Hello");
    gi.setVisible(true);
  }
    
  AlohaGui(String title){
    setTitle(title);
    setSize(400,300);
    setLocation(400,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    JPanel jp = new JPanel();
    jp.add(this.jTF);
    JButton jB = new JButton("CLICK");
    jB.addActionListener(this);
    jp.add(jB);
    add(jp);
  }
  
  public void actionPerformed(ActionEvent e){
    this.jTF.setText(data);
  }
}