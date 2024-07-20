import java.util.*;
import javax.swing.JFrame;  
import javax.swing.JButton; 
 import java.awt.*;
 import java.awt.event.*;   

public class practice3 {
    JButton c1; 
    int count1;
        public static void main (String[] args) {
        practice3 myobj = new practice3();
        myobj.start(); }
    public void start() {
        JFrame jf = new JFrame(" Multiple Components With The ActionListener Interface");

        c1 = new JButton("Button 1. I have been clicked " + count1 + " times."); 
        	
        c1.addActionListener(new addActionListener1());
	// Add buttons directly to two regions of BorderLayout of frame, set size and display it
       // jf.setBounds(100, 200, 20, 18);
      
        jf.add(BorderLayout.CENTER, c1);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }   

    // Inner class 1
    class addActionListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            count1++;
            c1.setText("I have been clicked " + count1 + " times.");
        }
    }  

}

