package frametest;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.Action;
import java.awt.*;
public class Frametest extends JFrame{
 
	JFrame fun;
	JButton btn1;
	JButton btn2;
	JPanel p;
    JLabel lb;
    JTextField  txt;
    FlowLayout flayout;
    Frametest(){
    	fun = new JFrame();
    	fun.setTitle("haji");
    	fun.setVisible(true);
    	fun.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	fun.setLocationRelativeTo(null);
    	fun.setSize(300,300);
    	flayout = new FlowLayout();
    	p = new JPanel((new FlowLayout(FlowLayout.CENTER)));
    	p.setBackground(Color.white);
    	p.setBorder(new TitledBorder("Menu"));
    	
    	lb = new JLabel("jumma");
    	
    	
    	btn1 = new JButton();
    	btn1.setText("default");
    	 btn1.addActionListener(new ActionListener(){
    		 public void actionPerformed(ActionEvent arg0){
    			 if(!txt.getText().trim().equals("")){
    				 
    			 }
    		 }
    	 });
    	
    	
    	btn2 = new JButton();
    	btn2.setText("kill");
    	
    	txt = new JTextField(15);
    	
    	
    	lb.setBounds(100, 100, 50, 60);
    	txt.setBounds(150, 100, 50, 60);
    	btn1.setBounds(100, 150, 50, 60);
    	btn2.setBounds(100, 200, 50, 60);
    	fun.add(p);
     p.add(lb);
     
     p.add(txt);
    	
     p.add(btn1);
     p.add(btn2);
    	
    	
    	
    }
	
	
	public static void main(String[] args) {
	Frametest you = new Frametest();

	}

}