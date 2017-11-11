package lc;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class Lc extends JFrame{

	JFrame frame;
	JPanel panel1;
	JButton help;
	Lc(){
		frame = new JFrame("Filing");
		frame.setSize(300, 300);
		panel1 = new JPanel();
		panel1.setBorder(new TitledBorder("abc"));
        frame.add(panel1);
        help = new JButton("help");
		panel1.add(help);
		panel1.add(help, BorderLayout.SOUTH);
		help.addActionListener(new ActionListener(){
		 	   public void actionPerformed(ActionEvent arg0){
		 			File file = new File("C:/New Text Document.txt");
		 			FileInputStream fis = null;

		 			try {
		 				fis = new FileInputStream(file);

		 				System.out.println("Total file size to read (in bytes) : "
		 						+ fis.available());

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
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lc c = new Lc();
	}

}
