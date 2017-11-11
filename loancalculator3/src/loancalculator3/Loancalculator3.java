package loancalculator3;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Loancalculator3 extends JFrame {
	/* static JFrame window;
	    static JPanel p;
	    static JLabel label1, label2;
	    static JTextField JTextField1, JTextField2;
	    static JButton b;
	    static JTextArea textArea;
	    static JScrollPane scrollPane;
	    static ButtonHandler handler;*/

private double tempNumbers1 = 0;
private double tempNumbers2 = 0;

private byte function = -1;


private JTextField resultJText;

public Loancalculator3() {

    JButton[] numberButtons = new JButton[10];

    for ( int i = 9; i >= 0; i--) {
        numberButtons[i] = new JButton(Integer.toString(i));
    }

    JButton enterButton     = new JButton("Enter");
    JButton cButton         = new JButton("C");
    JButton multiplyButton  = new JButton("*");
    JButton divideButton    = new JButton("/");
    JButton addButton       = new JButton("+");
    JButton substractButton = new JButton("-");


    resultJText = new JTextField();
        resultJText.setPreferredSize(new Dimension(160, 20));
        resultJText.setBackground(Color.WHITE);
        resultJText.setEnabled(false);
        resultJText.setHorizontalAlignment(4);
        resultJText.setDisabledTextColor(Color.BLACK);


    JPanel motherPanel = new JPanel();
        motherPanel.setLayout(new BoxLayout(motherPanel, BoxLayout.Y_AXIS));

    JPanel textPanel = new JPanel();
        textPanel.setPreferredSize(new Dimension(160, 20));
        textPanel.add(resultJText);

    JPanel numberButtonsPanel = new JPanel();
        numberButtonsPanel.setPreferredSize(new Dimension(160, 100));

        for(int i = 9; i>=0; i--) {
            numberButtonsPanel.add(numberButtons[i]);
        }

    JPanel functionButtonPanel = new JPanel();
        functionButtonPanel.setPreferredSize(new Dimension(160, 35));
        functionButtonPanel.add(enterButton);
        functionButtonPanel.add(cButton);
        functionButtonPanel.add(multiplyButton);
        functionButtonPanel.add(divideButton);
        functionButtonPanel.add(addButton);
        functionButtonPanel.add(substractButton);

    numberButtonsAction[] numberButtonActions = new numberButtonsAction[10];
    for ( int i = 0; i < 10; i++ ) {
        numberButtonActions[i] = new numberButtonsAction(numberButtons[i]);
        numberButtons[i].addActionListener(numberButtonActions[i]);
    }

    EnterButton enter = new EnterButton();
        enterButton.addActionListener(enter);

    CButton c = new CButton();
        cButton.addActionListener(c);

    MultiplyButton multiply = new MultiplyButton();
        multiplyButton.addActionListener(multiply);

    DivideButton divide = new DivideButton();
        divideButton.addActionListener(divide);

    AddButton add = new AddButton();
        addButton.addActionListener(add);

    SubtractButton subtract = new SubtractButton();
        substractButton.addActionListener(subtract);

    motherPanel.add(textPanel);
    motherPanel.add(numberButtonsPanel);
    motherPanel.add(functionButtonPanel);
    add(motherPanel);

    setTitle("ButtonTest");
    setSize(180, 290);
    setLocationByPlatform(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);

}

private class numberButtonsAction implements ActionListener {

    private String c;

    public numberButtonsAction(JButton a) {
        this.c = a.getText();
    }

    public void actionPerformed(ActionEvent e) {
        if (!resultJText.getText().equals("0.0")) {
            resultJText.setText(resultJText.getText() + c);
        } else {
            resultJText.setText("");
            actionPerformed(e);
        }
    }
}

private class EnterButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        tempNumbers2 = Double.parseDouble(resultJText.getText());

        if (function == 0) {
            resultJText.setText(Double.toString((Math.round((tempNumbers1 / tempNumbers2) * 100)) / 100));
        } else if (function == 1) {
            resultJText.setText(Double.toString(tempNumbers1 * tempNumbers2));
        } else if (function == 2) {
            resultJText.setText(Double.toString(tempNumbers2 + tempNumbers1));
        } else if (function == 3) {
            resultJText.setText(Double.toString(tempNumbers1 - tempNumbers2));
        } else {
            resultJText.setText(String.valueOf(tempNumbers1));
        }
            tempNumbers1 = Double.parseDouble(resultJText.getText());
    }


}

private class CButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        resultJText.setText("");
        tempNumbers1 = 0;
        tempNumbers2 = 0;

        function = -1;
    }


}

private class DivideButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tempNumbers1 == 0) {
            tempNumbers1 = Double.parseDouble(resultJText.getText());
            resultJText.setText("");
        } else {
            tempNumbers2 = Double.parseDouble(resultJText.getText());
            resultJText.setText("");
        }
        function = 0;
    }

}

private class MultiplyButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tempNumbers1 == 0) {
            tempNumbers1 = Double.parseDouble(resultJText.getText());
            resultJText.setText("");
        } else {
            tempNumbers2 = Double.parseDouble(resultJText.getText());
            resultJText.setText("");
        }
        function = 1;
    }


}


private class AddButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tempNumbers1 == 0) {
            tempNumbers1 = Double.parseDouble(resultJText.getText());
            resultJText.setText("");
        } else {
            tempNumbers2 = Double.parseDouble(resultJText.getText());
            resultJText.setText("");
        }
        function = 2;
    }

}

private class SubtractButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tempNumbers1 == 0) {
            tempNumbers1 = Double.parseDouble(resultJText.getText());
            resultJText.setText("");
        } else {
            tempNumbers2 = Double.parseDouble(resultJText.getText());
            resultJText.setText("");
        }
        function = 3;
    }

}


	public static void main(String[] args) {
		Loancalculator3 obi = new Loancalculator3();
	/*	 window = new JFrame(); // create window
	        p = new JPanel();
	         
	         //Create the first label.
	        label1 = new JLabel("Loan Amount", JLabel.LEFT);
	        p.add( label1);
	         
	        //Set the position of its text, relative to its icon:
	        label1.setVerticalTextPosition(JLabel.BOTTOM);
	        label1.setHorizontalTextPosition(JLabel.LEFT);
	         
	        // construct textfield with 10 columns
	        JTextField1 = new JTextField( 10 );
	        p.add( JTextField1 );
	         
	        //Create the other labels.
	        label2 = new JLabel("Number of Years");
	        p.add(label2);
	         
	        // construct textfield with default text
	        JTextField2 = new JTextField(3);
	        p.add( JTextField2 );
	         
	        label1.setToolTipText("A label containing both image and text");
	        label2.setToolTipText("A label containing only text");
	         
	        b = new JButton("Show Table" );
	        p.add(b);
	         
	        textArea = new JTextArea(20, 40);
	        textArea.setEditable(false);
	        scrollPane = new JScrollPane(textArea);
	        p.add( scrollPane );
	         
	        // create new ButtonHandler for button event handling
	        handler = new ButtonHandler();
	        b.addActionListener( handler );
	         
	        window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	        window.add(p);
	        window.setSize( 520, 360); // set frame size
	        window.setVisible( true ); // display frame 
	    } // end main
	     
	    // inner class for button event handling
	    private static class ButtonHandler implements ActionListener
	    {
	        // handle button event
	        public void actionPerformed( ActionEvent event )
	        {
	        String LoanAmount = JTextField1.getText();
	        String NumberofYears = JTextField2.getText();
	        double principle;
	        int lifeofloan;
	        String s = "Interest Rate     Monthly Payment                      Total Payment\n";
	         
	        // this method will be called each time amount of money is paid
	        private void incrementRate();
	        {
	        if(rate >= 3 && rate <= 6) rate += 0.125; // rate is instance variable
	        }
	         
	        textArea.setText(s);
	        }*/
	}

}
