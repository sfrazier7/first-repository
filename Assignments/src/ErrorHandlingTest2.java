
public class ErrorHandlingTest2 {
	
	
	public static void main(String[] args) {
		
		try {
			String name = "Dci";
			System.out.println(name.repeat(3));
			System.out.println(name.repeat(-1));
			System.out.println(name.charAt(9));
		} 
		catch (IllegalArgumentException e) {
			System.out.println("Repeat only takes positive numbers as parameters. : " + e.getMessage());
		}
		
		try {
			int[] numbers = {1, 2, 3, 4, 5};
			System.out.println(numbers[7]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The given index is outside the length of the array. : " + e.getMessage());
		}
		
		try {
			String hello = null;
			hello.indexOf(3);
		}
		catch (NullPointerException e) {
			System.out.print("The given String is null. : " + e.getMessage());
		}
	}
}