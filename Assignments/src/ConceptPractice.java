/* author: Shafir Frazier
 * date: 02/15/22
 * 1. Write a program that converts hourOfDay from 24-hour format to a 12-hour format
 * 2. Write a program to calculate a number to the power 3 using for loop
 */

import java.util.Scanner;

public class ConceptPractice {

	public static void main(String[] args) {
		
		//Created scanner object input that allows input into the program.
		Scanner input = new Scanner(System.in);
		
		//Problem 1
		
		//Asks for time of day, which is set to the variable hourOfDay
		System.out.println("What time of day is it?");
		int hourOfDay = input.nextInt();
		
		//If hourOfDay is In between 12 & 24 military time, then 12 is subtracted from value to return 12-hour format time.
		if(hourOfDay > 12 && hourOfDay < 24) {
			hourOfDay = hourOfDay - 12;
			System.out.println("It is currrently " + hourOfDay + "PM in standard time.");
		}
		
		//If hour is 12 then it will just print it is 12PM. 
		//12 has to be excluded, since if it was in the equation above it would return 0PM.
		else if(hourOfDay == 12) {
			System.out.println("It is currently 12PM in standard time.");
		
		//If the hour is less than 12, then it returns the value in an AM value
		}
		else if(hourOfDay > 0 && hourOfDay < 12) {
			System.out.println("It is currently " +  hourOfDay + "AM in standard time");
		}
		
		//If the hour is = 0, it is midnight, or 12AM, so it will output it is 12AM.
		else if(hourOfDay == 0) {
			System.out.println("It currently is 12AM in standard time.");
		}
		
		//Problem 2
		
		//Asks for input of the number to be cubed.
		System.out.println("What number would you like to cube?");
		int number = input.nextInt();
		
		//Sets original number as a multiplier
		int og_number = number;
		
		//for loop that multiplies the number value 3 times
		//only two passes are needed: the number needs to be multiplied by itself twice to become its cubed value
		for(int j = 1; j < 3; j++) {
			number = og_number * number;
		}
		
		//returns the cubed value of the number input.
		System.out.println(og_number + " to the third power is " + number + ".");
		input.close();
	}
	
}
