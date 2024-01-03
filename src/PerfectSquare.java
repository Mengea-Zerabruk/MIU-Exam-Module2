import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
//1. Write a function named nextPerfectSquare that returns the first perfect square that is greater than its integer argument. 
		//A perfect square is an integer that is equal to some integer squared e.g. 16 is perfect square b/c 16=4*4, but not 15!=n*n
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter an integer argumnet...");
		int n= scan.nextInt();
		System.out.println("the first perfect square that is greater than its integer argument "+isPerfectSquare(n));
		
		
		
		
		
		
		
		System.out.println("Thank you for your time!");
	}
	static int isPerfectSquare(int n) {
		
		//Option 1:
//		int sqrt= (int) Math.sqrt(n); //cast the sqrt to int 
//		int fisrtPs=0;
//		// checking if the square root of n is integer or not
//			if(sqrt*sqrt==n) {
//				fisrtPs=n;
//			}
//			
//			n++;
//			sqrt= (int) Math.sqrt(n);
//		while(sqrt*sqrt!=n) {
//			 
//			 n++;
//			 sqrt= (int) Math.sqrt(n);
//		}
//		fisrtPs=n;
//		
//		return fisrtPs;
		
		//Option 2: more efficient way
		if(n<0) {
			return 0;
		}
		else {
			int sqrtOfN=(int) Math.sqrt((n));
			int nextPerfectSquare=(int) Math.pow((sqrtOfN+1), 2);
			return nextPerfectSquare;
		}
	}

}
