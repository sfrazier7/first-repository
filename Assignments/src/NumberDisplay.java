
public class NumberDisplay {
	
	public static void main(String []args) {
		
		int num = 1;
		
		while(num <= 10) {
			System.out.println(num);
			num++;
		}
		
		int testval = 7;
		int multiplier = 1;
		
		while(multiplier <= 10) {
			System.out.print(" " + testval * multiplier);
			multiplier++;
		}
		
		int val = 1;
		
		while(val <= 5) {
			int squarenum = val * val;
			System.out.println("\nThe square of " + val + " is " + squarenum);
			val++;
		}
		
		int rangeStart = 7;
		int rangeEnd = 343;
		
		while(rangeStart < rangeEnd) {
			if(rangeStart%2 == 0) {
				System.out.println(rangeStart + " is even.");
			}
			rangeStart++;
		}
	}

}
