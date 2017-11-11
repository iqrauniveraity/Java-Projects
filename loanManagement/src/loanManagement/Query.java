package loanManagement;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.border.TitledBorder;
import javax.swing.*;
import javax.swing.JFrame;
public class Query extends JFrame{

	JFrame questions;
	JPanel answer;
	JButton num1, num2, num3,num4, num5, num6, num7 ,num8,num9,num10,num11,num12,num13,back;
	Query(){
		LoanManagement lm = new LoanManagement();
		questions = new JFrame("Query");
		questions.setSize(400, 400);
		answer = new JPanel();
		answer.setBorder(new TitledBorder("Query information"));
		answer.setBackground(Color.white);
		questions.add(answer);
		num1 = new JButton("Why take loan");
		answer.add(num1);
		num2= new JButton("procedure 1");
		answer.add(num2);
		num3 = new JButton("procedure 2");
		answer.add(num3);
		num4 = new JButton("procedure 3");
		answer.add(num4);
		num5 = new JButton("procedure 4");
		answer.add(num5);
		num6 = new JButton("procedure 5");
		answer.add(num6);
		num7 = new JButton("procedure 6");
		answer.add(num7);
		num8 = new JButton("procedure 7");
		answer.add(num8);
		num9 = new JButton("Document req");
		answer.add(num9);
		num10 = new JButton("application guide");
		answer.add(num10);
		num11 = new JButton("treatment");
		answer.add(num11);
		num12 = new JButton("Schedule of Charges");
		answer.add(num12);
		num13 = new JButton("Special Features");
		answer.add(num13);
		JButton info = new JButton("info of loan Form");
		answer.add(info);
		
		back = new JButton("back");
		answer.add(back);
		num1.addActionListener(new ActionListener(){
		 	   public void actionPerformed(ActionEvent arg0){
		 		  File file = new File("C:/Users/newlife network/workspace/loanManagement/whytakeloan.txt");
		 			FileInputStream fis = null;

		 			JFrame fun = new JFrame();
		 			try {
		 				fis = new FileInputStream(file);

		 				

		 				int content;
		 				while ((content = fis.read()) != -1) {
		 					// convert to char and display it
		 					JOptionPane.showMessageDialog(null, (char)content);
		 					//System.out.print((char) content);
		 				}

		 			} catch (IOException e) {
		 				System.out.println("Error");
		 			}
  		  
			  	   }
			     });
		num2.addActionListener(new ActionListener(){
		 	   public void actionPerformed(ActionEvent arg0){
			 		  File file = new File("C:/Users/newlife network/workspace/loanManagement/procedure1.txt");
			 			FileInputStream fis = null;

			 			try {
			 				fis = new FileInputStream(file);

			 				

			 				int content;
			 				while ((content = fis.read()) != -1) {
			 					// convert to char and display it
			 					System.out.print((char) content);
			 				}

			 			} catch (IOException e) {
			 				System.out.println("Error");
			 			} 
			  	   }
			     });
		num3.addActionListener(new ActionListener(){
		 	   public void actionPerformed(ActionEvent arg0){
			 		  File file = new File("C:/Users/newlife network/workspace/loanManagement/procedure2.txt");
			 			FileInputStream fis = null;

			 			try {
			 				fis = new FileInputStream(file);

			 				

			 				int content;
			 				while ((content = fis.read()) != -1) {
			 					// convert to char and display it
			 					System.out.print((char) content);
			 				}

			 			} catch (IOException e) {
			 				System.out.println("Error");
			 			} 
			  	   }
			     });
		num4.addActionListener(new ActionListener(){
		 	   public void actionPerformed(ActionEvent arg0){
			 		  File file = new File("C:/Users/newlife network/workspace/loanManagement/procedure3.txt");
			 			FileInputStream fis = null;

			 			try {
			 				fis = new FileInputStream(file);

			 				

			 				int content;
			 				while ((content = fis.read()) != -1) {
			 					// convert to char and display it
			 					System.out.print((char) content);
			 				}

			 			} catch (IOException e) {
			 				System.out.println("Error");
			 			}
			  	   }
			     });
		num5.addActionListener(new ActionListener(){
		 	   public void actionPerformed(ActionEvent arg0){
			 		  File file = new File("C:/Users/newlife network/workspace/loanManagement/procedure4.txt");
			 			FileInputStream fis = null;

			 			try {
			 				fis = new FileInputStream(file);

			 				

			 				int content;
			 				while ((content = fis.read()) != -1) {
			 					// convert to char and display it
			 					System.out.print((char) content);
			 				}

			 			} catch (IOException e) {
			 				System.out.println("Error");
			 			}
			  	   }
			     });
		num6.addActionListener(new ActionListener(){
		 	   public void actionPerformed(ActionEvent arg0){
			 		  File file = new File("C:/Users/newlife network/workspace/loanManagement/procedure5.txt");
			 			FileInputStream fis = null;

			 			try {
			 				fis = new FileInputStream(file);

			 				

			 				int content;
			 				while ((content = fis.read()) != -1) {
			 					// convert to char and display it
			 					System.out.print((char) content);
			 				}

			 			} catch (IOException e) {
			 				System.out.println("Error");
			 			}
			  	   }
			     });
		num7.addActionListener(new ActionListener(){
		 	   public void actionPerformed(ActionEvent arg0){
			 		  File file = new File("C:/Users/newlife network/workspace/loanManagement/procedure6.txt");
			 			FileInputStream fis = null;

			 			try {
			 				fis = new FileInputStream(file);

			 				

			 				int content;
			 				while ((content = fis.read()) != -1) {
			 					// convert to char and display it
			 					System.out.print((char) content);
			 				}

			 			} catch (IOException e) {
			 				System.out.println("Error");
			 			}
			  	   }
			     });
		num8.addActionListener(new ActionListener(){
		 	   public void actionPerformed(ActionEvent arg0){
			 		  File file = new File("C:/Users/newlife network/workspace/loanManagement/procedure7.txt");
			 			FileInputStream fis = null;

			 			try {
			 				fis = new FileInputStream(file);

			 				

			 				int content;
			 				while ((content = fis.read()) != -1) {
			 					// convert to char and display it
			 					System.out.print((char) content);
			 				}

			 			} catch (IOException e) {
			 				System.out.println("Error");
			 			}
			  	   }
			     });
		num9.addActionListener(new ActionListener(){
		 	   public void actionPerformed(ActionEvent arg0){
			 		  File file = new File("C:/Users/newlife network/workspace/loanManagement/docreq.txt");
			 			FileInputStream fis = null;

			 			try {
			 				fis = new FileInputStream(file);

			 				

			 				int content;
			 				while ((content = fis.read()) != -1) {
			 					// convert to char and display it
			 					System.out.print((char) content);
			 				}

			 			} catch (IOException e) {
			 				System.out.println("Error");
			 			}
			  	   }
			     });
		num10.addActionListener(new ActionListener(){
		 	   public void actionPerformed(ActionEvent arg0){
			 		  File file = new File("C:/Users/newlife network/workspace/loanManagement/applicationguideline.txt");
			 			FileInputStream fis = null;

			 			try {
			 				fis = new FileInputStream(file);

			 				

			 				int content;
			 				while ((content = fis.read()) != -1) {
			 					// convert to char and display it
			 					System.out.print((char) content);
			 				}

			 			} catch (IOException e) {
			 				System.out.println("Error");
			 			}
			  	   }
			     });
		num11.addActionListener(new ActionListener(){
		 	   public void actionPerformed(ActionEvent arg0){
			 		  File file = new File("C:/Users/newlife network/workspace/loanManagement/treatment.txt");
			 			FileInputStream fis = null;

			 			try {
			 				fis = new FileInputStream(file);

			 				

			 				int content;
			 				while ((content = fis.read()) != -1) {
			 					// convert to char and display it
			 					System.out.print((char) content);
			 				}

			 			} catch (IOException e) {
			 				System.out.println("Error");
			 			} 
			  	   }
			     });
				num12.addActionListener(new ActionListener(){
		 	   public void actionPerformed(ActionEvent arg0){
			 		  File file = new File("C:/Users/newlife network/workspace/loanManagement/Sheduleofcharges.txt");
			 			FileInputStream fis = null;

			 			try {
			 				fis = new FileInputStream(file);

			 				

			 				int content;
			 				while ((content = fis.read()) != -1) {
			 					// convert to char and display it
			 					System.out.print((char) content);
			 				}

			 			} catch (IOException e) {
			 				System.out.println("Error");
			 			} 
			  	   }
			     });
		num13.addActionListener(new ActionListener(){
		 	   public void actionPerformed(ActionEvent arg0){
			 		  File file = new File("C:/Users/newlife network/workspace/loanManagement/specialfeature.txt");
			 			FileInputStream fis = null;

			 			try {
			 				fis = new FileInputStream(file);

			 				

			 				int content;
			 				while ((content = fis.read()) != -1) {
			 					// convert to char and display it
			 					System.out.print((char) content);
			 				}

			 			} catch (IOException e) {
			 				System.out.println("Error");
			 			
			  	   }
		 	   }
			     });
		info.addActionListener(new ActionListener(){
		 	   public void actionPerformed(ActionEvent arg0){
		 		  File file = new File("C:/Users/newlife network/workspace/loanManagement/info.txt");
		 			FileInputStream fis = null;

		 			
		 			try {
		 				fis = new FileInputStream(file);

		 				

		 				int content;
		 				while ((content = fis.read()) != -1) {
		 					// convert to char and display it
		 					
		 					System.out.print((char) content);
		 				}

		 			} catch (IOException e) {
		 				System.out.println("Error");
		 			}
		  
			  	   }
			     });

		back.addActionListener(new ActionListener(){
		 	   public void actionPerformed(ActionEvent arg0){
		  		  questions.hide();
		  		  lm.frame.show();
		  	   }
		     });
		questions.setDefaultCloseOperation(EXIT_ON_CLOSE);
		questions.setVisible(true);
		questions.setLocationRelativeTo(null);
	}
}
