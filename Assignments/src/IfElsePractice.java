/* author: Shafir Frazier
 * date: 02/14/22
 * 1.  Create a variable called count, if count value is 10 print "The Count is 10", 
 * for any other value print "The count is not 10". 
2. Declare a string variable called carColor and assign it a color of your choice. 
(page number:153, Note: instead of using ".equals" use relational operator "==")
3. Declare a boolean variable called raining and set it to either true or false. 
Take another float variable called temperature if  raining is true and temperature is less than 50 print "take your umbrella" else print " don't take your umbrella. (page number: 159) 
 */

import java.util.Scanner;
public class IfElsePractice {
	
	public static void main(String args[]) {
		
		int count = 7;
		if(count == 10) {
			System.out.println("The Count is 10.");
		}
		else {
			System.out.println("The Count isn't 10.");
		}
		
		String carColor = "Silver";
		Scanner whatColor = new Scanner(System.in);
		
		if(carColor == ("Red"))
		{
		 System.out.println("the car color is Red");
		}
		else if(carColor == ("Green"))
		{
		 System.out.println("the car color is Green");
		}
		else if(carColor == ("Blue") )
		{
		 System.out.println("the car color is Blue");
		}
		else {
			System.out.println("What color is your car?");
			System.out.println("Very nice!");
		}
		 
		boolean raining = true;
		float temperature = 67.3f;
		if(raining == true && temperature < 50) {
			System.out.println("Take your umbrella when you leave.");
		}
		else {
			System.out.println("You won't need an umbrella.");
		}
		whatColor.close();
	}

}
