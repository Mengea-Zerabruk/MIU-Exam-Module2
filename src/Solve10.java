import java.util.Arrays;

public class Solve10 {

	public static void main(String[] args) {
		System.out.println("The solve10 value is"+ Arrays.toString(solve10()));

	}
	static int factorial(int value) {
		int result=1;
		if(value<=1)
			return 1;
		else {
			result=value*factorial(value-1);
		
		}
		return result;
	}
	static int[] solve10() {
		int factorialFound=0;
		int[] a= new int[2];
		for(int x=0; x<10; x++) {
			for(int y=0; y<10; y++) {
				if(factorial(x)+factorial(y)==factorial(10)) {
					a[0]=x;
					a[1]=y;
					factorialFound=1;
					break;
				}
				
			}
			if(factorialFound==1)
				break;
		}
		
		return a;
	}
	
	
}

