package loancalculator2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.TitledBorder;
import javax.swing.*;

public class loancalculator2 extends JFrame{
JFrame lCMenu;
JPanel lCMPanel,lCMPanel2;
JLabel heading, amount, years,totalLoan, monthlyPayment;
JTextField tamount, tyears;
JButton compute;
loancalculator2(){
	lCMenu = new JFrame("Loan Calculator");
	 ImageIcon image = new ImageIcon("C:/Users/newlife network/workspace/loancalculator2/mainmenu.png");
	   JLabel imageLabel = new JLabel(image);
	   imageLabel.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
	   imageLabel.setSize(200, 250);
	lCMenu.add(imageLabel, BorderLayout.NORTH);
	lCMPanel = new JPanel();
	amount = new JLabel("Enter Amount");
	tamount = new JTextField(14);	
	years = new JLabel("Enter years");
	tyears = new JTextField(14);
	monthlyPayment = new JLabel("Enter years");
	totalLoan = new JLabel("Enter years");
	compute = new JButton();
	lCMenu.setSize(350, 700);
	/*lCMenu.add(lCMPanel);
	lCMPanel.setBorder(new TitledBorder(""));
    lCMPanel.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
    lCMPanel.setBounds(0, 0, 200, 350);
    lCMPanel.setSize(300, 300);*/
    lCMenu.add(amount);
    amount.setBounds(95, 400, 50, 60);
    lCMenu.add(tamount);
    tamount.setBounds(220, 400, 50, 60);
    lCMenu.add(years);
    years.setBounds(95, 450, 50, 60);
    
    
  lCMenu.setVisible(true);
  lCMenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
  lCMenu.setLocationRelativeTo(null);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		loancalculator2 obj = new loancalculator2();
	}

}
