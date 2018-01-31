import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// **********************************************************
		// Temps.java
		//
		// This program reads in a sequence of hourly temperature 
		// readings (beginning with midnight) and prints the maximum
		// temperature (along with the hour, on a 24-hour clock, it 
		// occurred) and the minimum temperature (along with the hour
		// it occurred).
		// *******************************************************0***
		final int HOURS_PER_DAY = 10;

		int temp; //a temperature reading
		int maxTemp = -1000;	//maximum temperature
		int miniTemp = 1000;	//minimum temperature
		int timeOfMax;	//time of maximum temperature
		int timeOfMin;	//time of minimum temperature

		Scanner scan = new Scanner(System.in);

		// print program heading
		System.out.println ();
		System.out.println ("Temperature Readings for 24 Hour Period");
		System.out.println ();

		for (int hour = 0; hour < HOURS_PER_DAY; hour++)
		{
		System.out.print ("Enter the temperature reading at " + hour +
		" hours: ");
		temp = scan.nextInt();
		if (temp > maxTemp)
		{
		maxTemp = temp;
		timeOfMax = hour;
		}
		System.out.println("");
		}

		// Print the results
		}
		}
	


