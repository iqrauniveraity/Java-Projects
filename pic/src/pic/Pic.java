package pic;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.border.TitledBorder;
import javax.swing.*;
public class Pic extends JFrame{

	JFrame p;
	JPanel p1;
	JButton btn1,btn2;
	JTextField txt2,txt1;
	Pic(){
		p = new JFrame("Pic");
		p.setVisible(true);
		p.setSize(400, 400);
		p.setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLocationRelativeTo(null);
		p.setIconImage();
		p1 = new JPanel();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pic a = new Pic();
	}

}
