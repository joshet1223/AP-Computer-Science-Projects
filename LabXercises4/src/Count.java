//************************************************************************
// Count.java
// Author: Matthew Moradi
// This program reads in strings (phrases) and counts the 
// number of blank characters and certain other letters
// in the phrse.
// ************************************************************************
import java.util.Scanner;

public class Count
{
    public static void main(String[] args)
    {
        String phrase;  // a string of characters
        int countBlank; // the number of blanks (spaces) in the phrase
        int length;     // the length of the phrase
        char ch;        // an individual characgter in the string
        
        Scanner scan = new Scanner(System.in);
        
        //Print a program header
        System.out.println();
        System.out.println("Character Counter");
        System.out.println();
        
        String quit = "";
     
        while ( !quit.equalsIgnoreCase("quit") )
        {        
            // Read in a string and find its length
            System.out.print ("Enter a sentence or phrase or 'quit' to quit: ");
            phrase = scan.nextLine();
            if (phrase.equalsIgnoreCase("quit") )
                break;
            length = phrase.length();
        
            //Initialize counts
            countBlank = 0;
            int countA = 0;
            int countE = 0;
            int countS = 0;
            int countT = 0;
        
            //a for loop to go through the string character by character
            // and count the blank spaces
            for(int i = 0; i < length; i++ )
            {
                ch = phrase.charAt(i);
                switch( ch )
                {
                    case 'a':
                    case 'A':   countA++;
                                break;
                    case 'e':
                    case 'E':   countE++;
                                break;
                    case 's':
                    case 'S':   countS++;
                                break;
                    case 't':
                    case 'T':   countT++;
                                break;
                    case ' ':   countBlank++;
                }
            }
            //Print the results
            System.out.println();
            System.out.println("Number of blank spaces: " + countBlank);
            System.out.println("Number of A's: " + countA);
            System.out.println("Number of E's: " + countE);
            System.out.println("Number of S's: " + countS);
            System.out.println("Number of T's: " + countT);
            System.out.println();
        }
    }
}