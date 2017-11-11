package loancalculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;



import javax.swing.*;

public class LoanCalculator extends JFrame{
		JFrame lCMenu;
		JButton loancalculator, loanform,query,aboutus,quit;
		JLabel mainmenu;
		LoanCalculator(){
			lCMenu = new JFrame("Loan Calculator");
			lCMenu.setSize(500, 700);
			   mainmenu = new JLabel("MainMenu");
			   mainmenu.setBounds(135, 50, 200, 60);
			   mainmenu.setBackground(Color.white);
			   mainmenu.setForeground(Color.blue);
	            mainmenu.setFont(new Font(mainmenu.getFont().getName(),mainmenu.getFont().getStyle(), 25 ));
			   lCMenu.add(mainmenu);
			 /*loancalculator = new JButton("Loan Calculator");
			 loancalculator.setBounds(95,110,200,100);
			lCMenu.add(loancalculator);*/
			
		    
		  lCMenu.setVisible(true);
		  lCMenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
		  lCMenu.setLocationRelativeTo(null);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoanCalculator LCalculator = new LoanCalculator();
	}

	}

