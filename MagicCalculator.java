
public class MagicCalculator extends Calculator {
	
	public static double squareRoot(double num1) {
		return Math.sqrt(num1);
	}
	public static double sin(double num1) {
		return Math.sin(num1);
	}
	public static double cosine(double num1) {
		return Math.cos(num1);
	}
	public static double tangent(double num1) {
		return Math.tan(num1);
	}
	public static double factorial(int num1) {
		double result = 1;
		for(int i = num1; i > 1; i--) {
			result *= i;
		}
		return result;
	}
}
