package swingcomponentstest;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class Swingcomponentstest extends JFrame {

	JFrame frame;
	FlowLayout flayout;
	JButton btn;
	JButton btn1;
	JTextField txt,txt2;
	JList list;
	String[] listColorNames = { "black", " blue", "green", "white" };
	JComboBox cBox;
	String[] Arr = {"option 1","option 2","option 3","option 4"};
	JComboBox cBox2;
	String[] Arr2 = {"1st","2nd","3rd","4th"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Swingcomponentstest obj = new Swingcomponentstest();
	}
	Swingcomponentstest(){
		frame = new JFrame();
		frame.setTitle("my Swing components test");
		frame.setSize(300,300);
		
		 flayout = new FlowLayout();
		 frame.setLayout(flayout);
		 txt = new JTextField(14);
		 frame.add(txt);
		 
		 btn = new JButton();
		 btn.setText("Button # 1");
		 frame.add(btn);
		 
		 btn.addActionListener(new ActionListener() {
			 
			 public void actionPerformed(ActionEvent e){
				 
				 txt.setText("hello !");
			 }
		 });
		 txt2 = new JTextField(14);
		 frame.add(txt2);
		 
		 btn1 = new JButton();
		 btn1.setText("Button # 2");
		 frame.add(btn1);
		 
		 btn1.addActionListener(new ActionListener() {
			 
			 public void actionPerformed(ActionEvent e){
				 txt2.setText("BYe !");
			 }
		 });
		 
		
		
		 list = new JList(listColorNames);
		 list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(list);
			
			 cBox = new JComboBox(Arr);
			 frame.add(cBox);
			 
			 cBox2 = new JComboBox(Arr2);
			 frame.add(cBox2);
		 
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		 frame.setLocationRelativeTo(null);
		
		}

}
