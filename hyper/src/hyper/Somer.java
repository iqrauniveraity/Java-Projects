package hyper;
import javax.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.*;

public class Somer extends JFrame {

	
		JFrame ful;
		JPanel pl;
		JButton but1;
		JButton but2;
		JButton but3;
		JTextField txt;
		JLabel lab;
		FlowLayout fLayout;
		Somer(){
			
			
		fLayout = new FlowLayout();
		 ful = new JFrame();
		 ful.setTitle("kit");
		 ful.setVisible(true);
		 ful.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 ful.setLocationRelativeTo(null);
		 ful.setSize(250,200);
		 
		 pl = new JPanel(new FlowLayout(FlowLayout.CENTER));
		 pl.setBackground(Color.YELLOW);
		
		 lab = new JLabel("port");
		 lab.setBounds(95, 95, 50, 60);
		 
		 txt = new JTextField(15);
		 txt.setBounds(145, 95, 50, 60);
		
		but1 = new JButton("kaam");
		but1.setBounds(95, 125, 50, 60);
		
		but2 = new JButton("tamaam");
		but2.setBounds(95, 175, 50, 60);
		
		but3 = new JButton("khtab");
		but3.setBounds(95, 185, 50, 60);
		
		ful.add(pl);
		pl.add(lab);
		pl.add(txt);
		pl.add(but1);
		pl.add(but2);
		pl.add(but3);
		
		
	}
	public static void main(String[] args) {
	
		Somer sum = new Somer();
		

	}

}
