package Salary;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
public class worker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JDialog.setDefaultLookAndFeelDecorated(true);
		    Object[] selectionValues = { "Pandas", "Dogs", "Horses" };
		    String initialSelection = "Dogs";
		    Object selection = JOptionPane.showInputDialog(null, "What are your favorite animals?",
		        "Zoo Quiz", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
		    System.out.println(selection);
	                                                                        // default
	                                                                        // icon
			
	}

}
