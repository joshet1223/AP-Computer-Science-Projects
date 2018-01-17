package mydud;

import java.awt.BorderLayout;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Jtorgdio {

	public static void main(String[] args) {
		String cur= JOptionPane.showInputDialog(null,"What was your current Balance ",JOptionPane.INFORMATION_MESSAGE);
		String pre= JOptionPane.showInputDialog(null,"What was your previous balance ",JOptionPane.INFORMATION_MESSAGE);
        int p = Integer.parseInt(pre);
        int c = Integer.parseInt(cur);
        SortedSet<Integer> set = new TreeSet<>();
        set.add(p);
        set.add(c);
        	
        	if (c < 50) {
        		if ( p > 0 ) {
        		double s = (p * .02);
        		double t = (s + p);
        		double d = (c + t);
        		System.out.println("CS CARD CHARGE STATEMENT");
        		System.out.println("========================");
        		System.out.println(                             );
        		System.out.println("Previous balance:"+"$"+p);
        		System.out.println(                             );
        		System.out.println("Additional Charges:"+"$"+ t);
        		System.out.println(                             );
        		System.out.println(                             );
        		System.out.println("New Balance:"+     + c);
        		System.out.println(                             );
        		System.out.println("Minimum Payment:"+     "$"+d);
        		
        	} else {
        		System.out.println("CS CARD CHARGE STATEMENT");
        		System.out.println("========================");
        		System.out.println(                             );
        		System.out.println("Previous Balance:       "+"$"+p);
        		System.out.println(                             );
        		System.out.println("Additional Charges:     "+"$"+c);
        		System.out.println(                             );
        		System.out.println(                             );
        		System.out.println("New Balance:            "+"$"+c);
        		System.out.println(                             );
        		System.out.println("Minimum Payment:        "+"$"+c);
        	}
        	
	} else { 
		if ( c > 50 && c <=300) { 
    		if ( p > 0 ) {
    		double s = (p * .02);
    		double t = (s + p);
    		double d = (50 + t);
    		System.out.println("CS CARD CHARGE STATEMENT");
    		System.out.println("========================");
    		System.out.println(                             );
    		System.out.println("Previous balance:    "+"$"+p);
    		System.out.println(                             );
    		System.out.println("Additional Charges:  "+"$"+d);
    		System.out.println(                             );
    		System.out.println(                             );
    		System.out.println("New Balance:         "+"$"+c);
    		System.out.println(                             );
    		System.out.println("Minimum Payment:     "+"$"+d);
    		} else {
        		System.out.println("CS CARD CHARGE STATEMENT");
        		System.out.println("========================");
        		System.out.println(                             );
        		System.out.println("Previous Balance:    "+"$"+p);
        		System.out.println(                             );
        		System.out.println("Additional Charges:  "+"$50");
        		System.out.println(                             );
        		System.out.println(                             );
        		System.out.println("New Balance:         "+"$"+c);
        		System.out.println(                             );
        		System.out.println("Minimum Payment:     "+"$50");
        	}
    		
		} else {
			if(c > 300) {
	    		double a = (c * 0.2);
				if ( p > 0 ) {
		    		double s = (p * .02);
		    		double t = (s + p );
		    		double g = (a+t);
		    		System.out.println("CS CARD CHARGE STATEMENT");
		    		System.out.println("========================");
		    		System.out.println(                             );
		    		System.out.println("Previous balance:    "+"$"+p);
		    		System.out.println(                             );
		    		System.out.println("Additional Charges:  "+"$"+g);
		    		System.out.println(                             );
		    		System.out.println(                             );
		    		System.out.println("New Balance:         "+"$"+c);
		    		System.out.println(                             );
		    		System.out.println("Minimum Payment:     "+"$"+g);
		    		} else {
		        		System.out.println("CS CARD CHARGE STATEMENT");
		        		System.out.println("========================");
		        		System.out.println(                             );
		        		System.out.println("Previous Balance:    "+"$"+p);
		        		System.out.println(                             );
		        		System.out.println("Additional Charges:  "+"$"+a);
		        		System.out.println(                             );
		        		System.out.println(                             );
		        		System.out.println("New Balance:         "+"$"+c);
		        		System.out.println(                             );
		        		System.out.println("Minimum Payment:     "+"$"+a);
		        
		    		}
		    	}	
			}
		}
	}
}
