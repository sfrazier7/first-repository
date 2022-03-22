import java.lang.Math;
public class MathMethods {
	
	static double circleArea(double r) {
		double area = Math.PI * Math.pow(r, 2); 
		return area;
	}

	public static void main(String[] args) {
		
		double a = 7;
		double b = 21;
		
		System.out.println(Math.PI);
		System.out.println("The largest number of the pair " + a + " & " + b + " is " + Math.max(a, b));
		System.out.println("The circle with a radius of " + a + " has an area of " + circleArea(a));
		System.out.println("The square root of " + a + " is " + Math.sqrt(a));
		System.out.println("The square root of " + b + " is " + Math.sqrt(b));
		System.out.println("The natural logarithm of " + a + " is " + Math.log(a));
		System.out.println("The natural number 'e' raised to the exponent " + b + " is " + Math.exp(b));
	}

}
