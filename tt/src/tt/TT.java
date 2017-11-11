package tt;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TT {
JFrame frame;
JPanel panel;
JButton btn,btn1;
JTextField txt,txt1;
JLabel label,label1;
TT(){
	frame = new JFrame("frame");
	frame.setSize(300,250);
	panel = new JPanel();
	btn = new JButton("get Text");
	btn1 = new JButton("show Text");
	txt = new JTextField(20);
	label = new JLabel("name");
	frame.add(panel);
	panel.setBorder(new TitledBorder("Filing"));
	panel.add(label);
	panel.add(txt);
	panel.add(btn);
	panel.add(btn1);
	btn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(txt.getText().trim().equals("")){
			File file = new File("C:/Users/newlife network/workspace/tt/names.txt");
			String content = "byte";

			
			try (FileOutputStream fop = new FileOutputStream(file)) {

				// if file doesn't exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}

				// get the content in bytes
				byte[] contentInBytes = content.getBytes();

				fop.write(contentInBytes);
				fop.flush();
				fop.close();

				System.out.println("Done");

			} catch (IOException e) {
				e.printStackTrace();
			}


		}
		else{
			JOptionPane.showInputDialog(null, "txt field empty");
		}
		}
	});
	
	frame.setVisible(true);
    
}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TT tt = new TT();
	}

}
