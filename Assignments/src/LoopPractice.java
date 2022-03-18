/*
 * 3. Declare two integer variables starNo and endNo and print all odd numbers between the range using do while loop.
 */

public class LoopPractice {
	
	public static void main(String args[]) {
		
		int i;
		int beginValue = 10;
		int endValue = 50;
		int tableValue = 5;
		for(i=beginValue; i<=endValue; i=i+tableValue){
		System.out.println(i + " ");
		}

		
		double n = 1.2;
		while(n != 5.6) {
			System.out.println(Math.sqrt(n));
			 n = n + 1.1;
			}
		int starNo = 343;
		int endNo = 2401;
		
		do {
			if(starNo%2 != 0) {
				System.out.println(starNo + " is odd.");
			}
			starNo++;
		} while(starNo <= endNo);
			
		
	}
}

