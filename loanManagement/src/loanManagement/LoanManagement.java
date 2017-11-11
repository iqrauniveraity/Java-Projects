package loanManagement;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.border.TitledBorder;
import javax.swing.*;
public class LoanManagement extends JFrame {

	JFrame frame;
	JPanel panel1;
	JButton help,loanform,aboutus,loancalculator,query;
	
	LoanManagement(){
		frame= new JFrame("Loan Calculator");
		frame.setBounds(250, 180, 260, 160);
		panel1 = new JPanel();
		panel1.setBackground(Color.blue);
		
		frame.add(panel1);
		panel1.setBorder(new TitledBorder("Menu"));
		loanform = new JButton("Loan Form");
		panel1.add(loanform);
		loancalculator = new JButton("Loan Calculator");
		panel1.add(loancalculator);
		query = new JButton("Query");
		panel1.add(query);
		panel1.add(query, BorderLayout.SOUTH);
		
		aboutus = new JButton("About us");
		panel1.add(aboutus);
		loanform.addActionListener(new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent arg0){
        		frame.hide();
        		JFrame loanform = new JFrame("ABC Bank");
        		loanform.setSize(350, 400);
        		FlowLayout flayout = new FlowLayout();
        		
        		JPanel page = new JPanel();
        		page.setBackground(Color.white);
        		page.setBorder(new TitledBorder("Loan Form"));
        		page.setBackground(Color.magenta);
        		loanform.add(page);
        		JLabel name = new JLabel("Name");
        		JLabel cnic = new JLabel("CNIC");
        		JLabel number = new JLabel("Number");
        		JLabel age = new JLabel("    Age    ");
        		JLabel amount = new JLabel("Loan Amount");
        		JLabel purpose = new JLabel("Purpose");
        		JLabel job = new JLabel("   Job    ");
        		JLabel organization = new JLabel("Organization");
        		JLabel years = new JLabel("    years    ");
        		JTextField tname = new JTextField(15);
        		JTextField tcnic = new JTextField(15);
        		JTextField tnumber = new JTextField(15);
        		JTextField tage = new JTextField(15);
        		JTextField tamount = new JTextField(15);
        		JTextField tpurpose = new JTextField(15);
        		JTextField tjob  = new JTextField(15);
        		JTextField torganization = new JTextField(15);
        		JTextField tyears  = new JTextField(15);
        		page.add(name);
        		name.setBounds(50, 90, 100, 100);
        		page.add(tname);
        		tname.setBounds(90, 90, 100, 100);
        		page.add(cnic);
        		cnic.setBounds(50, 120, 100, 100);
        		page.add(tcnic);
        		tcnic.setBounds(90, 90, 100, 100);
        		page.add(age);
        		age.setBounds(50, 150, 100, 100);
        		page.add(tage);
        		tage.setBounds(90, 180, 100, 100);
        		page.add(number);
        		number.setBounds(50, 180, 100, 100);
        		page.add(tnumber);
        		tnumber.setBounds(90, 180, 100, 100);
        		page.add(job);
        		job.setBounds(50, 210, 100, 100);
        		page.add(tjob);
        		tjob.setBounds(90, 180, 100, 100);
        		page.add(organization);
        		organization.setBounds(50, 240, 100, 100);
        		page.add(torganization);
        		torganization.setBounds(90, 180, 100, 100);
        		page.add(purpose);
        		purpose.setBounds(50, 270, 100, 100);
        		page.add(tpurpose);
        		tpurpose.setBounds(90, 180, 100, 100);
        		page.add(amount);
        		amount.setBounds(50, 300, 100, 100);
        		page.add(tamount);
        		tamount.setBounds(90, 180, 100, 100);
        		page.add(years);
        		years.setBounds(50, 330, 100, 100);
        		page.add(tyears);
        		tyears.setBounds(90, 180, 100, 100);
        		JButton submit = new JButton("Submit");
        		page.add(submit, BorderLayout.SOUTH);
        		
        		submit.addActionListener(new ActionListener() {
    				
    				@Override
    				public void actionPerformed(ActionEvent arg0) {
    					
    					if( !tname.getText().trim().equals("") &&
    						!tage.getText().trim().equals("") &&
    						!tcnic.getText().trim().equals("")&&
    						!tnumber.getText().trim().equals("") &&
    						!tjob.getText().trim().equals("") &&
    						!torganization.getText().trim().equals("") &&
    						!tpurpose.getText().trim().equals("") &&
    						!tamount.getText().trim().equals("") &&
    						!tyears.getText().trim().equals(""))
    					{
    						JOptionPane.showMessageDialog(null, "We will contact you in 2-3 working days");
    						String s1 = tname.getText().trim();
    						String s2 = tage.getText().trim();
    						String s3 = tcnic.getText().trim();
    						String s4 =tnumber.getText().trim();
    						String s5 = tjob.getText().trim();
    						String s6 = torganization.getText().trim();
    						String s7 = tpurpose.getText().trim();
    						String s8 = tamount.getText().trim();
    						String s9 = tyears.getText().trim();
    						try{
    							BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/newlife network/workspace/loanManagement/info.txt"));
    							bw.write("name: " +s1 + "   ");
    							bw.write("age: " +s2 + "   ");
    							bw.write("cnic: " +s3 + "   ");
    							bw.write("number: " +s4 + "   ");
    							bw.write("job: " +s5 + "   ");
    							bw.write("organization: " +s6 + "   ");
    							bw.write("purpose: " +s7 + "   ");
    							bw.write("amount: " +s8 + "   ");
    							bw.write("years: " +s9 + "   ");
    							bw.close();
    						}
    						catch(Exception e){
    							System.out.println("Error loading file");
    						}
    						
    					}
    					else{
    						JOptionPane.showMessageDialog(null, "Fields cannot be empty!");
    					}
    				}});
    	        JButton back1 = new JButton("Back");
    	        page.add(back1);
    	        back1.addActionListener(new ActionListener(){
    	        	public void actionPerformed(ActionEvent arg0){
    	        		loanform.hide();
    	        		frame.show();
    	        	}
    	        });
			     
        		loanform.setDefaultCloseOperation(EXIT_ON_CLOSE);
        		loanform.setVisible(true);
        		loanform.setLocationRelativeTo(null);
        	}});
		loancalculator.addActionListener(new ActionListener(){
	    	   public void actionPerformed(ActionEvent arg0){
	    		   frame.hide();
	    		   JFrame frame2 = new JFrame("Loan Calculator");
	    		   frame2.setSize(320,350);
	    		   JPanel panel3 = new JPanel();
	    			 panel3.setBorder(new TitledBorder(""));
	    			 panel3.setBackground(Color.LIGHT_GRAY);
	    			 frame2.add(panel3);
		    			JLabel LoanAmount = new JLabel();
		    			LoanAmount.setText("Enter Loan Amount:");
		    			LoanAmount.setBounds(50,50,150,30);
		    			 panel3.add(LoanAmount);
		    		
		    			 JTextField txta = new JTextField(14);
		    				txta.setBounds(170,50,150,30);
		    				panel3.add(txta);
		    				
		    				JLabel interestrate = new JLabel();
		    			interestrate.setText("  Interest Rate   :");
		    			interestrate.setBounds(50, 90, 150, 30);
		    			panel3.add(interestrate);
		    			
		    			JTextField txtb = new JTextField(14);
		    			txtb.setBounds(170, 90, 150, 30);
		    			panel3.add(txtb);
		    			 
		    			JLabel years = new JLabel();
		    			years.setText("Number Of Years:");
		    			years.setBounds(50, 130, 150, 30);
		    			panel3.add(years);
		    			
		    			JTextField txtc = new JTextField(14);
		    			txtc.setBounds(170, 130, 150, 30);
		    			panel3.add(txtc);
		    			
		    			JLabel totalloan = new JLabel();
		    			totalloan.setText("     Total loan     :");
		    			totalloan.setBounds(100, 500, 80, 30);
		    			panel3.add(totalloan);
		    			JTextField txtd = new JTextField(14);
		    			txtd.setBounds(170, 130, 150, 30);
		    			panel3.add(txtd);

		    			JLabel monthlypayment = new JLabel();
		    			monthlypayment.setText("Monthly payment    :");
		    			monthlypayment.setBounds(100, 800, 80, 30);
		    			panel3.add(monthlypayment);
		    			JTextField txte = new JTextField(14);
		    			txte.setBounds(170, 130, 150, 30);
		    			panel3.add(txte);
		    			JButton compute= new JButton();
		    			compute.setText("compute");
		    			compute.setBounds(150, 350, 80, 30);
		    			panel3.add(compute, BorderLayout.SOUTH);

		    			compute.addActionListener(new ActionListener() {
		    				
		    				@Override
		    				public void actionPerformed(ActionEvent arg0) {
		    					
		    					if( !txta.getText().trim().equals("") &&
		    						!txtb.getText().trim().equals("") &&
		    						!txtc.getText().trim().equals("") )
		    					{
		    						double loanamount = Integer.parseInt(txta.getText().trim()); 
		    						double interestrate = Integer.parseInt(txtb.getText().trim());
		    						double numberofyears = Integer.parseInt(txtc.getText().trim());
		    						double interestRate = interestrate / 100;
		    						double interestamount = interestRate * loanamount;
		    						double totalLoan = loanamount + interestamount;
		    						
		    						double monthlyPayment = totalLoan/(numberofyears * 12);
		    					
		    						txtd.setText(String.valueOf(totalLoan));
		    						txte.setText(String.valueOf(monthlyPayment));
		    					}				
		    					else
		    					{		JOptionPane.showMessageDialog(null, "Fields cannot be empty!");
		    										
		    					}
		    					
		    				}
		    			});

		    			 JButton back1 = new JButton("Back");
		    			 panel3.add(back1);
		    	        back1.addActionListener(new ActionListener(){
		    	        	public void actionPerformed(ActionEvent arg0){
		    	        		frame2.hide();
		    	        		frame.show();
		    	        	}
		    	        });
	    		   frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
					frame2.setVisible(true);
					frame2.setLocationRelativeTo(null);
	    	   }
	       });   
    query.addActionListener(new ActionListener(){
 	   public void actionPerformed(ActionEvent arg0){
 		  Query on = new Query();
 		  frame.hide();
 		  on.questions.show();
 	   }
    });
    aboutus.addActionListener(new ActionListener(){
      	@Override
      	public void actionPerformed(ActionEvent arg0){
      		frame.hide();
      		JFrame members = new JFrame("Our team Info");
      		members.setSize(200, 300);
      		JPanel name = new JPanel();
      		name.setBorder(new TitledBorder("Names of menbers"));
      		name.setBackground(Color.GRAY);
      		members.add(name);
      		JButton waleed = new JButton(" waleed ");
      		JButton farooq = new JButton(" farooq ");
      		JButton hani = new JButton("  hani  ");
      		JButton hammad = new JButton("hammad");
      		JButton bilal = new JButton(" bilal ");
      		name.add(waleed);
      		name.add(hammad);
      		name.add(hani);
      		name.add(farooq);
      		name.add(bilal);
      		waleed.addActionListener(new ActionListener(){
		        	@Override
		        	public void actionPerformed(ActionEvent arg0){
		        	File file = new File("C:/Users/newlife network/workspace/loanManagement/waleed.txt");
	        		FileInputStream fis = null;

	        		try {
	        			fis = new FileInputStream(file);

	        			
	        			int content;
	        			while ((content = fis.read()) != -1) {
	        				// convert to char and display it
	        				System.out.print((char) content);
	        			}

	        		} catch (IOException e) {
	        			e.printStackTrace();
	        		} finally {
	        			try {
	        				if (fis != null)
	        					fis.close();
	        			} catch (IOException a) {
	        				a.printStackTrace();
	        			}
	        		}

		        	}
      		});
      		hammad.addActionListener(new ActionListener(){
		        	@Override
		        	public void actionPerformed(ActionEvent arg0){
		        	File file = new File("C:/Users/newlife network/workspace/loanManagement/hammad.txt");
	        		FileInputStream fis = null;

	        		try {
	        			fis = new FileInputStream(file);

	        			
	        			int content;
	        			while ((content = fis.read()) != -1) {
	        				// convert to char and display it
	        				System.out.print((char) content);
	        			}

	        		} catch (IOException e) {
	        			e.printStackTrace();
	        		} finally {
	        			try {
	        				if (fis != null)
	        					fis.close();
	        			} catch (IOException ex) {
	        				ex.printStackTrace();
	        			}
	        		}

		        	}
      		});
      		hani.addActionListener(new ActionListener(){
		        	@Override
		        	public void actionPerformed(ActionEvent arg0){
		        	File file = new File("C:/Users/newlife network/workspace/loanManagement/hani.txt");
	        		FileInputStream fis = null;

	        		try {
	        			fis = new FileInputStream(file);

	        			
	        			int content;
	        			while ((content = fis.read()) != -1) {
	        				// convert to char and display it
	        				System.out.print((char) content);
	        			}

	        		} catch (IOException e) {
	        			e.printStackTrace();
	        		} finally {
	        			try {
	        				if (fis != null)
	        					fis.close();
	        			} catch (IOException ex) {
	        				ex.printStackTrace();
	        			}
	        		}

		        	}
      		});
      		farooq.addActionListener(new ActionListener(){
		        	@Override
		        	public void actionPerformed(ActionEvent arg0){
		        	File file = new File("C:/Users/newlife network/workspace/loanManagement/farooq.txt");
	        		FileInputStream fis = null;

	        		try {
	        			fis = new FileInputStream(file);

	        			
	        			int content;
	        			while ((content = fis.read()) != -1) {
	        				// convert to char and display it
	        				System.out.print((char) content);
	        			}

	        		} catch (IOException e) {
	        			e.printStackTrace();
	        		} finally {
	        			try {
	        				if (fis != null)
	        					fis.close();
	        			} catch (IOException ex) {
	        				ex.printStackTrace();
	        			}
	        		}

		        	}
      		});
      		bilal.addActionListener(new ActionListener(){
		        	@Override
		        	public void actionPerformed(ActionEvent arg0){
		        	File file = new File("C:/Users/newlife network/workspace/loanManagement/bilal.txt");
	        		FileInputStream fis = null;

	        		try {
	        			fis = new FileInputStream(file);

	        			
	        			int content;
	        			while ((content = fis.read()) != -1) {
	        				// convert to char and display it
	        				System.out.print((char) content);
	        			}

	        		} catch (IOException e) {
	        			e.printStackTrace();
	        		} finally {
	        			try {
	        				if (fis != null)
	        					fis.close();
	        			} catch (IOException ex) {
	        				ex.printStackTrace();
	        			}
	        		}

		        	}
      		});
      		JButton back2 = new JButton("Back");
      		back2.setBounds(95, 350, 250, 10);
      	    name.add(back2);
      	    back2.addActionListener(new ActionListener(){
      	    	public void actionPerformed(ActionEvent arg0){
      	    		members.hide();
      	    		frame.show();
      	    	}
      	    });
      		
      		members.setDefaultCloseOperation(EXIT_ON_CLOSE);
      		members.setVisible(true);
      		members.setLocationRelativeTo(null);
				        	}
      });
    

		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LoanManagement LM = new LoanManagement();
	}

}
