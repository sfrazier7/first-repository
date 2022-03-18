/* author: Shafir Frazier
 * date: 02/11/22
 *
 * 1. Create a counter that prints numbers from 8 through 20
 * 2. Print all even numbers between 1 & 25
 * 3. Print all odd numbers between 50 & 100 */

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration of counter variable a which is set to the beginning value of 8
		int a = 8;
		
		//counter loop that increments prints the value of a
		//a is incremented until all value between 8 and 20 are printed
		while(a <= 20) {
		System.out.println("The value of a is " + a + ".");
		++a;
		}
		
		//declaration of number value b
		int b;
		
		//for loop that tests if the values of b are even using equation b mod 2
		//if the value is returned is 0, b is even and printed.
		//this is incremented and tested until b is equal to 25
		for(b=1; b<=25; b++) {
			if(b%2 == 0) {
				System.out.println(b + " is even.");
			}
		}
		
		//declaration of number value c
		int c;
		
		//if the value returned doesn't equal 0, c is odd and printed.
		//this is incremented and tested until c is equal to 100.
		for(c=50; c<=100; c++) {
			if(c%2 != 0) {
				System.out.println(c + " is odd.");
			}
		}
	}

}
