
public class Weather {
	public static void main(String []args){
		
		int weatherInF = 77;
		
		if(weatherInF< 55) {
			System.out.println("You need a coat, it's cold!");
			if(weatherInF < 32) {
				System.out.println("Temperatures are below freezing! "
						+ "\nMake sure your wear a scarf,hat and gloves :).");
			}
		}
		
		if(weatherInF<70) {
			System.out.println("A sweater will be fine, it's warm out!");
			if(weatherInF == 70) {
				System.out.println("Its almost summer time! :D");
			}
		}
		if(weatherInF<100) {
			System.out.println("It's summer time! Ice Cream Time!");
			if(weatherInF > 100) {
				System.out.println("Its extremely hot outside. \nDress light and drink water!");
			}
		}
	}

}
