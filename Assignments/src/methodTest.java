/*
 * author :Shafir Frazier
 * date : 02/16
 *  Write a program to declare two number in main function, pass these number to function as a parameter. The function displays the maximum number.
 Write a program to declare a number in main function, pass this number to a function as a parameter. The function display the number is even or odd.
 Write a program to declare two number in main function, pass these number to function. The function return the sum of these two number.
 */

public class methodTest {
	
	public static void main(String args[]) {
		
		System.out.println("Program Start \n");
		
		int num1 = 7;
		int num2 = 14;
		maxNum(num1,num2);
		
		int num3 = 21;
		evenOrOdd(num3);
		
		int num4 = 28;
		int num5 = 35;
		int answer = sum(num4,num5);
		System.out.println("The sum of " + num4 + " & " + num5 + " is " + answer);
	
		System.out.println("\nProgram End");
	}
	
	public static void maxNum(int a, int b) {
		if(a > b) {
			System.out.println(a + " is greater than " + b);
		} else {
			System.out.println(b + " is greater than " + a);
		}
	}
	
	public static void evenOrOdd(int a) {
		if(a%2 == 0) {
			System.out.println(a + " is even.");
		} else {
			System.out.println(a + " is odd.");
		}
	}
	
        static int sum(int a, int b) {
		int ans = a + b;
		return ans;
	}
}
