/* author : Shafir Frazier
 * date : 02-28-22
 * Assignment : To pratice and use various methods of the String Class
 */
import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
		
		//Scanner Object for User Input
		Scanner stringIn = new Scanner(System.in);
		
		//User Input for String sentence a, and String word b
		String a = stringIn.nextLine();
		String b = stringIn.next();
		
		//Prints String Objects
		System.out.println(a);
		System.out.println(b);
		
		//Tests if String B's character sequence can be found within a, returns true if yes/false if no
		System.out.println(a.contains(b));
		
		//Creation of new String object to hold lowercase String sequence of a 
		//So if a is upper or lowercase, the startsWith method will return true
		String alowercase = a.toLowerCase();
		System.out.println(alowercase.startsWith("a"));
		
		//Tests if String sequence ends with the DCI characters
		System.out.println(a.endsWith("DCI"));
		
		//Tests if the String sequence UST can be found within the String sequence of B
		System.out.println(b.contains("UST"));
		
		//If/Else which tests to see if the string starts and ends with the letter r. 
		//Returns true if yes, and false if no
		if(a.charAt(0) == a.charAt(a.length()-1)) {
			System.out.println(a + " Starts and ends with the same letters");
		} else 
			System.out.println(a + " Doesn't start and end with the same letters.");
		
		//Will test if string a is equal to string b - the cases of the characters must be equal
		System.out.println(a.equals(b));
		
		//Converts B string sequence into lowercase and stores value in blowercase
		//Allows to test if strings have the same sequence of characters regardless of case
		String blowercase = b.toLowerCase();
		System.out.println(alowercase.equals(blowercase));
		
		String c = "apple";
		String d = "apple";
		
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
		stringIn.close();
	}

}
