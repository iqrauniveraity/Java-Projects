package abci;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
public class Abci extends JFrame{

	FlowLayout fout;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JButton btn10;
	JButton btn11;
	JButton btn12;
	JButton btn13;
	JButton btn14;
	JButton btn15;
	JButton btn16;
	Abci(){
		fout = new FlowLayout();
		btn1 = new JButton("CAr name");
		btn2 = new JButton("manufacturer");
		btn3 = new JButton("Model");
		btn4 = new JButton("model year");
		btn5 = new JButton("price");
		btn6 = new JButton("Body type");
		btn7 = new JButton("HP");
		btn8 = new JButton("BHP");
		btn9 = new JButton("RIM SIze");
		btn10 = new JButton("RIM type");
		btn11 = new JButton("Engine");
		btn12 = new JButton("Torque");
		btn13 = new JButton("Color 1");
		btn14 = new JButton("Color 2");
		btn15 = new JButton("Top speed");
		btn16 = new JButton("Plate Number");
	}
	
	public static void main(String[] args) {
		
		
		Abci frame = new Abci();
		frame.setTitle("CAR");
		frame.setSize(300, 250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pnl = new JPanel();
		
		
	}

}
