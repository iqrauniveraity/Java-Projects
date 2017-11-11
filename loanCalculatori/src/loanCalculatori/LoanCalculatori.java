package loanCalculatori;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;
import javax.swing.*;
 
public class LoanCalculatori extends JFrame {

    JFrame frame;
	JMenu menu;
	JButton btn;
	JTextField txt;
	FlowLayout flayout;
     JPanel panel,panel2;
     
     JTextField txtInterestRate = new JTextField();
     JTextField txtNumberOfYears = new JTextField();
     JTextField txtLoanAmount = new JTextField();
     JTextField txtMonthlyPayment = new JTextField();
     JTextField txtTotalPayment = new JTextField();
     
     JButton btnCompute = new JButton("Compute Payment");
     
     public LoanCalculatori() {
         
     JPanel panel = new JPanel(new GridLayout(5 ,5));
     panel.setBorder(new TitledBorder("THIS IS A LOAN CALCULATOR: Enter Interest Rate, Loan Amount and Number of Years"));
     
panel.add(new JLabel("Interest Rate:"));
panel.add(txtInterestRate);

panel.add(new JLabel("Number of Years:"));
panel.add(txtNumberOfYears);

panel.add(new JLabel("Loan Amount:"));
panel.add(txtLoanAmount);

panel.add(new JLabel("Monthly Payment:"));
panel.add(txtMonthlyPayment);

panel.add(new JLabel("Total Payment:"));
panel.add(txtTotalPayment);

JPanel panel2 = new JPanel();
panel.setLayout(null);
panel2.add(btnCompute);

add(panel, BorderLayout.CENTER);
add(panel2, BorderLayout.SOUTH);

btnCompute.addActionListener(new ButtonListener());
     }
     
    class ButtonListener implements ActionListener {
 public void actionPerformed(ActionEvent e) {
     
    
 
 if( !txtInterestRate.getText().trim().equals("") &&
			!txtNumberOfYears.getText().trim().equals("") &&
			!txtLoanAmount.getText().trim().equals("") )
		{
 double interest = Double.parseDouble(txtInterestRate.getText());
     
     int year =
     Integer.parseInt(txtNumberOfYears.getText());
   double loanAmount =
     Double.parseDouble(txtLoanAmount.getText());

   
   Loan loan = new Loan(interest, year, loanAmount);

  
   
 txtMonthlyPayment.setText(String.format("%.2f",
     loan.getMonthlyPayment()));
 
 txtTotalPayment.setText(String.format("%.2f",
     loan.getTotalPayment()));
		}				
		else
		{		JOptionPane.showMessageDialog(null, "Fields cannot be empty!");
							
		}
  
   
 }
}


	public static void main(String[] args) {
		  LoanCalculatori frame = new LoanCalculatori();
		    frame.pack();
		    frame.setTitle("Loan Calculator");
		    frame.setLocationRelativeTo(null);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
		    }
		  }
		class Loan {
			   double InterestRate;
			   int numberOfYears;
			   double loanAmount;

			  
			  Loan() {
			    this(5, 2, 1500);
			  }

			  double interestamount;
			  
			  Loan(double InterestRate, int numberOfYears,
			      double loanAmount) {
			    this.InterestRate = InterestRate;
			    this.numberOfYears = numberOfYears;
			    this.loanAmount = loanAmount;
			  }

			  double getInterestRate() {
			    return InterestRate;
			  }

			  void setInterestRate(double InterestRate) {
			    this.InterestRate = InterestRate;
			  }

			  public int getNumberOfYears() {
			    return numberOfYears;
			  }

			  public void setNumberOfYears(int numberOfYears) {
			    this.numberOfYears = numberOfYears;
			  }

			  double getLoanAmount() {
			    return loanAmount;
			  }

			  
			  void setLoanAmount(double loanAmount) {
			    this.loanAmount = loanAmount;
			  }

			   double getMonthlyPayment() {
			    double monthlyInterestRate = InterestRate / 100;
			     interestamount = monthlyInterestRate * loanAmount;
			    double monthlyPayment = loanAmount + interestamount / ( numberOfYears * 12);
			    return monthlyPayment;    
			  }

			  
			  double getTotalPayment() {
			    double totalPayment = loanAmount + interestamount ;
			    return totalPayment;    
			  }

			  
			  
			}

