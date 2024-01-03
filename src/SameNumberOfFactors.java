
public class SameNumberOfFactors {

	public static void main(String[] args) {
		int argumentOne=0;
		int argumentTwo=0;
		System.out.println(sameNumberOfFactors(argumentOne,argumentTwo));

	}
	
	static int sameNumberOfFactors(int argumentOne, int argumentTwo) {
		if(argumentOne<0 || argumentTwo<0)
			return -1;// either of the argument is negative number
		else if(argumentOne==argumentTwo)
			return 1;//always same number of factors
		else {
			int numberOfFactors4Argument1=0, numberOfFactors4Argument2=0;
			for(int factors=1;factors<=Math.sqrt(argumentOne);factors++) {
				if(argumentOne%factors==0)
					numberOfFactors4Argument1++;
			}
			
			for(int factors=1; factors<=Math.sqrt(argumentTwo);factors++) {
				if(argumentTwo%factors==0)
					numberOfFactors4Argument2++;
			}
			
			if(numberOfFactors4Argument1!=numberOfFactors4Argument2)
				return 0;// different number of factors
		}
		
		
		
		return 1;
	}

}
