
public class Factorial {

	public static void main(String[] args) {
		int value=10;
		System.out.println("Factorial= "+factorial(value));

	}
	static int factorial(int value) {
		int result=1;
		if(value==1)
			return 1;
		else {
			result=value*factorial(value-1);
		}
		return result;
	}

}
