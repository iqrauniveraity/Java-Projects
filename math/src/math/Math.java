package math;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;


public class Math extends JFrame {
	JPanel panel;
	JLabel lbl_number1;
	JTextField txt_number1;

	JLabel lbl_number2;
	JTextField txt_number2;
	
	JButton btn_add;
	JButton btn_multiply;
	JButton btn_subtract;
	JButton btn_divide;
	JLabel lbl_result;
	
	public static void main(String[] args) {

		Math screen = new Math();
		screen.setTitle("Math - Application");
		screen.setBounds(100,100,500,300);
		screen.setVisible(true);
		
		screen.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	Math()
	{
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder("Add Numbers"));
		setContentPane(panel);
		
		lbl_number1 = new JLabel("Enter Number 1: ");
		lbl_number1.setBounds(50,50,150,30);
		panel.add(lbl_number1);
		
		txt_number1 = new JTextField();
		txt_number1.setBounds(170,50,150,30);
		panel.add(txt_number1);
		
		lbl_number2 = new JLabel("Enter Number 2: ");
		lbl_number2.setBounds(50,90,150,30);
		panel.add(lbl_number2);
		
		txt_number2 = new JTextField();
		txt_number2.setBounds(170,90,150,30);
		panel.add(txt_number2);
		
		btn_add = new JButton("Add");
		btn_add.setBounds(110,130,80,30);
		panel.add(btn_add);
		
		btn_multiply = new JButton("Multiply");
		btn_multiply.setBounds(200,130,80,30);
		panel.add(btn_multiply);
		
		btn_subtract = new JButton("Subtract");
		btn_subtract.setBounds(290,130,80,30);
		panel.add(btn_subtract);
		
		btn_divide = new JButton("Divide");
		btn_divide.setBounds(380,130,80,30);
		panel.add(btn_divide);
		
		lbl_result = new JLabel("..");
		lbl_result.setBounds(170,170,90,30);
		panel.add(lbl_result);
		
		btn_add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try{
				if( !txt_number1.getText().trim().equals("") &&
					!txt_number2.getText().trim().equals("") )
				{
					int sum = Integer.parseInt(txt_number1.getText().trim()) + 
							  Integer.parseInt(txt_number2.getText().trim());
				
				lbl_result.setText(String.valueOf(sum));
				}				
				else
				{		JOptionPane.showMessageDialog(null, "Fields cannot be empty!");
									
				}
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "onlu numeric data");
				}
			}
		});
	btn_subtract.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try{
				if( !txt_number1.getText().trim().equals("") &&
					!txt_number2.getText().trim().equals("") )
				{
					int difference = Integer.parseInt(txt_number1.getText().trim()) - 
							  Integer.parseInt(txt_number2.getText().trim());
				
				lbl_result.setText(String.valueOf(difference));
				}				
				else
				{		JOptionPane.showMessageDialog(null, "Fields cannot be empty!");
									
				}
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "onlu numeric data");
				}
			}
		});
	btn_multiply.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			try{
			if( !txt_number1.getText().trim().equals("") &&
				!txt_number2.getText().trim().equals("") )
			{
				int product = Integer.parseInt(txt_number1.getText().trim()) * 
						  Integer.parseInt(txt_number2.getText().trim());
			
			lbl_result.setText(String.valueOf(product));
			}				
			else
			{		JOptionPane.showMessageDialog(null, "Fields cannot be empty!");
								
			}
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "onlu numeric data");
			}
		}
	});
	btn_divide.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			try{
			if( !txt_number1.getText().trim().equals("") &&
				!txt_number2.getText().trim().equals("") )
			{
				int divde = Integer.parseInt(txt_number1.getText().trim()) / 
						  Integer.parseInt(txt_number2.getText().trim());
			
			lbl_result.setText(String.valueOf(divde));
			}				
			else
			{		JOptionPane.showMessageDialog(null, "Fields cannot be empty!");
								
			}
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "onlu numeric data");
			}`
		}
	
	});
	
	}

}
