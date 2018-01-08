package Salary;

import java.awt.BorderLayout;
import java.beans.Customizer;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.lang.model.type.DeclaredType;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

@SuppressWarnings("unused")
public class joptforcomputingsaml {	
	public static void main(String[] args) {
        //... Text to put on the buttons.
    	String num1= JOptionPane.showInputDialog(null,"your Salary: " , "Torgersons Frames",JOptionPane.INFORMATION_MESSAGE);
    	int int1 = Integer.parseInt(num1);
        SortedSet<Integer> set = new TreeSet<>();
        set.add(int1);
		
		
		String[] choices = {"Excellent", "Good", "Poor", "Quit"};
        
        //... Variables to keep track of the counts.
        int Excellentc = 0;
        int Goodc = 0;
        int Poorc   = 0;
        
        //... "Infinite" loop, terminated by call to System.exit(0)
        while (true) {
            int response = JOptionPane.showOptionDialog(
                               null                       // Center in window.
                             , "Your Performance?"        // Message
                             , "Torgerson Frames"              // Title in titlebar
                             , JOptionPane.YES_NO_OPTION  // Option type
                             , JOptionPane.PLAIN_MESSAGE  // messageType
                             , null                       // Icon (none)
                             , choices                    // Button text as above.
                             , "None of your business"    // Default button's label
                           );
            
            //... Use a switch statement to check which button was clicked.
            switch (response) {
                case 0: 
                    Excellentc++;
                    break;
                case 1:
                    Goodc++;
                    break;
                case 2:
                   Poorc++;
                    break;
                case 3:
                case -1:
                    //... Both the quit button (3) and the close box(-1) handled here.
                    System.exit(0);     // It would be better to exit loop, but...
                default:
                    //... If we get here, something is wrong.  Defensive programming.
                    JOptionPane.showMessageDialog(null, "Unexpected response " + response);
            }
            
            if (Excellentc == 1) {
            	double e = 0.06 * int1;
            	int e1 = (int) (e + int1);
            	JOptionPane.showMessageDialog(null, "your raise is " +e1);
            	System.exit(0);		
            
            } else {
            	if(Goodc == 1) {
                	double g = 0.04 * int1;
                	int g1 = (int) (g + int1);
                	JOptionPane.showMessageDialog(null, "your raise is " +g1);
                	System.exit(0);
            	} else {
            		
            		if (Poorc == 1) { 
                    	double p = 0.015 * int1;
                    	int p1 = (int) (p + int1);
                    	JOptionPane.showMessageDialog(null, "your raise is " +p1);
                    	System.exit(0);
            		}
            		
            }
            
            //... Display the accumulated results so far.
            
        } 
   
        
        }
}
}