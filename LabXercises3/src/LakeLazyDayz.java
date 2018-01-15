//****************************************************************
//LakeLazyDayz.java
//Assignment: LabXercises 3
//Author: Matthew Moradi
//Gives bored people suggestions on what they should do at the 
//resort depending on the specified temperature.
//****************************************************************

import java.util.Scanner;
public class LakeLazyDayz {

	public static void main(String[] args) {
		int temp;
		boolean tempBool;
		System.out.println("Welcome to da Lazy Lake Resort!!!");
		System.out.print("Please specify the temerature: ");
		Scanner userInput = new Scanner(System.in);
		temp = userInput.nextInt();
		
		if(20 > temp || temp > 95){
			tempBool = true;
			System.out.println("Visit our shops ma dude!");
		}
		else if(temp >= 80) {
			System.out.println("You should go for a swim ma dude...");
		}
		else if(60 <= temp && temp < 80) {
			System.out.println("You should play some tennis ma dude...");
		}
		else if(40 <= temp && temp < 60) {
			System.out.println("You should play some golf ma dude...");
		}
		else if(temp < 40) {
			System.out.println("You should go for a ski ma dude...");
		}
	}
}
