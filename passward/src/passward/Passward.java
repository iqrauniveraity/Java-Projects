package passward;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;
import javax.swing.*;
public class Passward extends JFrame {

	 JFrame frame1, frame2, frame3,frame4;
		JMenu menu;
		JButton btn1, btn2, btn3, btn4, btn5, btn6;
		JTextField txt1,txt2,txt3,txt4,txt5,txt6;
		JLabel label1,label2, label3, label4, label5, label6;
		FlowLayout flayout;
		JPasswordField p1;
	     JPanel panel,panel2;
	     
	     Passward(){
	    	 frame1 = new JFrame();
	    	 frame1.setTitle("Loan Calculator");
	 		frame1.setSize(290, 200);
	    	 JPanel panel = new JPanel();
	         panel.setBorder(new TitledBorder("Authentication Required"));
	        
	        label1 = new JLabel("Username");
	        panel.add(label1);
	        txt1 = new JTextField(15);
	        panel.add(txt1);

	        label2 = new JLabel("Passward");
	        panel.add(label2);
	        p1 = new JPasswordField(15);
	        panel.add(p1);

	        add(panel, BorderLayout.CENTER);
	        btn1 = new JButton("Login");
	        
	        btn1.addActionListener(new ActionListener(){
	        	@Override
	        	public void actionPerformed(ActionEvent arg0){
	        		if(!txt1.getText().trim().equals("") && !txt2.getText().trim().equals("")){
	        			String username  = "admin";
	        			String passward  = "iqra";
	        			String t = txt1.getText().trim().toLowerCase();
	        			String s = txt2.getText().trim().toLowerCase();
	        			if(t.equals("admin")==true && s.equals("iqra")==true){
	        				JOptionPane.showMessageDialog(null, "Welcome Admin");
	        			}
	        			else
	        			{
	        				JOptionPane.showMessageDialog(null, "invalid user name or passward");
	        			}
	        		}
	        		else
	        		{
	        			JOptionPane.showMessageDialog(null, "text field empyt");
	        		}
	        	}
	        });
	      
	      panel.add(btn1, BorderLayout.SOUTH);
	        frame1.add(panel);
	        frame1.setVisible(true);
			 frame1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
			 frame1.setLocationRelativeTo(null);
	     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Passward pass = new Passward();
	}

}