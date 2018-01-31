// ************************************************************
// Temps.java
// Author: Matthew Moradi
// This program reads in a sequence of hourly temperatur readings (beginning 
// with midnight) and prints the maximum teperature (along with the hour, 
// on a 24-hour clock, it occurred) and the minimum temperature (along with 
// the hours it occurred).
// ************************************************************

import java.util.Scanner;

public class Temps
{
    //-------------------------------------------------
    // Reads in a sequence of temperatures and finds the 
    // maximum and minimum read in.
    //-------------------------------------------------
    public static void main (String[] args)
    {
        final int HOURS_PER_DAY = 24;
        int temp; // a temperature reading
        int maxTemp = -1000;
        int timeOfMax = -1;
        int minTemp = 1000;
        int timeOfMin = -1;
        Scanner scan = new Scanner(System.in);
        
        //print program heading
        System.out.println();
        System.out.println("Temperature Readings for 24 Hour Period");
        System.out.println();
        
        for (int hour = 0; hour < HOURS_PER_DAY; hour++ )
        {
            System.out.print("Enter the temperature reading at " + hour + " hours: ");
            temp=scan.nextInt();
            if ( temp > maxTemp )
            {
                maxTemp = temp;
                timeOfMax = hour;
            }
            if ( temp < minTemp )
            {
                minTemp = temp;
                timeOfMin = hour;
            }
        }
        
        //Print the results
        System.out.println("The maximum temperature was " + maxTemp + " degrees. It occurred at " + timeOfMax + " o'clock.");
        System.out.println("The minimum temperature was " + minTemp + " degrees. It occurred at " + timeOfMin + " o'clock.");
    }  
}