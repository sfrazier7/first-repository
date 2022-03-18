
public class t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Variable declarations and Values for a,b, & c
		int a = 27;
		double b = 34.0;
		float c = 21.7f;
		
		//Conditional test to check which variable has the greatest number
		//The greatest number is returned
		if(a>b && a>c) {
			System.out.println("The greatest number is " + a);
		}
		else if(b>c) {
			System.out.println("The greatest number is " + b);
		}
		else {
			System.out.println("The greatest number is " + c);
		}
		
		//RPM Value Declaration
		int rpm = 4500;
		
		//RPM conditional Test
		//Will return if the engine is off, running too fast, or running normally
		if(rpm == 0 || rpm > 3000) {
			System.out.println("Your engine has stopped, or its running too quickly.");
		}
		else {
			System.out.println("Your engine is running fine.");
		}
		
		//Variable newUsers and appDownloads Declaration
		int newUsers = 77;
		int appDownloads = 210;
		
		if(newUsers>100 && appDownloads >= 200 || newUsers >= 500 || newUsers >= 600) {
			System.out.println("You have reached your application's weekly goal! Well done!");
		}
		else if(newUsers >= 500 || appDownloads >= 100) {
			System.out.println("Almost there! Keep trying!");
		}
		else {
			System.out.println("Your application didn't do great this week. \nBetter luck next time!");
		}
	}

}
