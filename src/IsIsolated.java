
public class IsIsolated {

	public static void main(String[] args) {
		long n=25;
		System.out.println(isIsolated(n));
	}
	
	static int isIsolated(long n) {
		long maximum=Long.MAX_VALUE;
		long squareOfN;
		long cubeOfN;
		int cubeDigits;
		int squareDigits;
		if(n<1 || n>maximum)
			return -1;
		else {
			squareOfN= n*n;
			cubeOfN=n*n*n;
			while(squareOfN>0) {
				squareDigits=(int) squareOfN %10;
				while(cubeOfN>0) {
					cubeDigits= (int) cubeOfN%10;
					if(cubeDigits==squareDigits)
						return 0;//same digits occur in square and cube of n
					cubeOfN/=10;
				}
				squareOfN/=10;
			}
		}
		return 1;
	}

}
