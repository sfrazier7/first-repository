/* author :Shafir Frazier
 * date : 02/14/22
 * ForLoop Asisgnment :
 * 1. Create a program that prints number from 1 to 15.

2. Create a program that display all odd number from 1 to 10.

3. Create a program that display back-counting from 20 to 1.

4. Create a program that can print the following series: 1,4,7,10...20.

5. Create a program to display the product of all odd number from 1 to 10 using for loop (Optional Question).
 */

public class ForLoop {

	public static void main(String[] args) {
		
		//for loop initializing counter which increases and prints its value until counter is equal to 15.
		for(int counter = 1; counter <= 15; counter++) {
			System.out.println("The current counter value is " + counter);
		}
		
		//for loop initializing counter2 and prints its value if its odd until it is equal to 10.
		//logic: all even numbers / 2 = 0. If this is false the the number is odd.
		for(int counter2 = 1; counter2 <= 10; counter2++) {
			if(counter2 % 2 != 0) {
				System.out.println("The number " + counter2 + " is odd.");
			}
		}
		
		//for loop initializing counter3 which decreases and prints its value until it is equal to 1.
		for(int counter3 = 20; counter3 >=1; counter3--) {
			System.out.println("The current counter value is " + counter3);
		}
		
		//for loop initializing counter4 which prints its value and adds 3 to satisfy the series
		//repeats until coounter4 value is greater than 20
		for(int counter4 = 1; counter4 < 20; counter4++) {
			System.out.println("The current number in the series is " + counter4);
			counter4 = counter4 + 2;
		}
		// Initialized product variable as int, will be the container for the product of all the odd numbers
		// logic: any number multiplied by one will retain its value, so this will not conflict with any calculations
		int product = 1;
		
		//for loop initializing counter5 and, if counter5 is odd, it is multiplied with the product variable
		//logic: all even numbers / 2 = 0. If this is false the the number is odd.
		for(int counter5 = 1; counter5 < 10; counter5++) {
			if(counter5 % 2 != 0) {
				product = product * counter5;
			}
		}
		
		System.out.println("The product of all odd numbers between 1 and 10 is equal to " + product);

	}

}
