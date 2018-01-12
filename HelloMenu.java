import javax.swing.*;
import java.awt.*;

public class HelloMenu extends JFrame{
	public static void main(String[] args){
		HelloMenu frame = new HelloMenu("Hello");
		frame.setVisible(true);
	}
	HelloMenu(String title){
		setTitle(title);
		setSize(400,300);
  	  	setLocation(400,300);
  	  	setDefaultCloseOperation(EXIT_ON_CLOSE);

    	//MenuBar
    	JMenuBar mb = new JMenuBar();

    	//Menu
    	JMenu m = new JMenu("File");

    	//MenuItem
    	JMenuItem mi = new JMenuItem("new");
    	JMenuItem mi2 = new JMenuItem("open");

    	//set,add
    	setJMenuBar(mb);
    	mb.add(m);
    	m.add(mi);
    	m.add(mi2);

	}
	
}