
package Userinputavg;

import java.awt.BorderLayout;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Average {

    public static void main(String [] args) {
    	JDialog.setDefaultLookAndFeelDecorated(true);
    	
    	String num11= JOptionPane.showInputDialog("How many numbers are you putting in: ");    	
    	
    	String num1= JOptionPane.showInputDialog("Input Number 1: ");

        String num2= JOptionPane.showInputDialog("Input Number 2: ");

        String num3= JOptionPane.showInputDialog("Input Number 3 : ");
      
        String num4= JOptionPane.showInputDialog("Input Number 4: ");

        String num5= JOptionPane.showInputDialog("Input Number 5: ");

        String num6= JOptionPane.showInputDialog("Input Number 6 : "); 
        
        String num7= JOptionPane.showInputDialog("Input Number 7: ");

        String num8= JOptionPane.showInputDialog("Input Number 8: ");

        String num9= JOptionPane.showInputDialog("Input Number 9 : ");

        String num10= JOptionPane.showInputDialog("Input Number 10 : ");
        
        String num11= JOptionPane.showInputDialog("How many numbers Did you put in : ");
        
        int int1 = Integer.parseInt(num1);
        int int2 = Integer.parseInt(num2);
        int int3 = Integer.parseInt(num3);
        int int4 = Integer.parseInt(num4);
        int int5 = Integer.parseInt(num5);
        int int6 = Integer.parseInt(num6);
        int int7 = Integer.parseInt(num7);
        int int8 = Integer.parseInt(num8);
        int int9 = Integer.parseInt(num9);
        int int10 = Integer.parseInt(num10);
        int int11 = Integer.parseInt(num11);
        
        SortedSet<Integer> set = new TreeSet<>();
        set.add(int1);
        set.add(int2);
        set.add(int3);
        set.add(int4);
        set.add(int5);
        set.add(int6);
        set.add(int7);
        set.add(int8);
        set.add(int9);
        set.add(int10);
        set.add(int11);
       
        int sum1 = int1 + int2 + int3 + int4 + int5 + int6 + int7 + int8 + int9 + int10;
        int x = sum1/int11;

      
        JFrame myFrame = new JFrame("Test GUI");
        myFrame.setVisible(true);
        myFrame.setBounds(300, 200, 700, 400);
        JLabel myText = new JLabel("Your average is "+x,
                SwingConstants.CENTER);
        myFrame.getContentPane().add(myText, BorderLayout.CENTER);

        }
    }
