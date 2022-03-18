/*
 * author : Shafir Frazier
 * date : 02/25/22
 */

public class Array {
	
	static void sortArray(int[] array) {
		int max = array[0];
		for(int i = 1; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		System.out.println(max + " is the biggest number in the array.");
	}
	
	static void reverse(int[] array) {
		System.out.println("The array in reverse is :");
		for(int i = array.length-1; i > -1; i--) {
			System.out.println(array[i]);
		}
	}
	
	static void summation(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("The sum of all the integers in the array is: " + sum);
	}
	
	public static void main(String[] args) {
		
		int[] numbers = {5, 2, 7, 343, 21,};
		System.out.println("The length of the array is: " + numbers.length);
		Array.sortArray(numbers);
		Array.reverse(numbers);
		Array.summation(numbers);
	}

}
