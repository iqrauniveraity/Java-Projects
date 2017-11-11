package entertainmentemulator;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GKQuiz extends JFrame {
    
JFrame GKQuiz;
JButton sports,ca,cs,gk,phy,back;
JLabel LQuiz,enter;

GKQuiz(){

    GKQuiz = new JFrame();
    sports = new JButton("Sports");
    ca = new JButton("Current Affairs");
    cs = new JButton("Computer Science");
    gk = new JButton("General Knowledge");
    phy= new JButton("Physics");
    enter = new JLabel("Select Your Desired Field");
    back = new JButton("Back");
    LQuiz = new JLabel("G.K QUIZ");
    
    GKQuiz.add(ca);
    ca.setBounds(95, 110, 200, 35);
    
    GKQuiz.add(cs);
    cs.setBounds(95, 150, 200, 35);    
    
    GKQuiz.add(sports);
    sports.setBounds(95, 190, 200, 35); 
   
    GKQuiz.add(gk);
    gk.setBounds(95, 230, 200, 35); 
    
    GKQuiz.add(phy);
    phy.setBounds(95, 270, 200, 35);
    
    GKQuiz.add(LQuiz);
     LQuiz.setBounds(135, 6, 800, 60);
            LQuiz.setForeground(Color.blue);
            LQuiz.setFont(new Font(LQuiz.getFont().getName(),LQuiz.getFont().getStyle(), 25 )); 
    GKQuiz.add(back);
    
    GKQuiz.add(enter);
     enter.setBounds(120, 65, 800, 60);
        //    enter.setForeground(Color.black);
         //   enter.setFont(new Font(enter.getFont().getName(),enter.getFont().getStyle(), 15 )); 
    GKQuiz.add(back);
    
    back.setBounds(0,341,400,20);
              back.addActionListener(new ActionListener(){
                 
                    public void actionPerformed(ActionEvent e){
                     EntertainmentEmulator b = new EntertainmentEmulator();
                     GKQuiz.hide();
                     b.MainMenu.show();
                }});

    GKQuiz.hide();
    GKQuiz.setLayout(null);
    GKQuiz.setDefaultCloseOperation(HIDE_ON_CLOSE);
    GKQuiz.setLocationRelativeTo(null);
    GKQuiz.setSize(400,400);
    GKQuiz.setVisible(true);
}

    
}


