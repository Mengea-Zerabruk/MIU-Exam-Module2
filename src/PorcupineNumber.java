
public class PorcupineNumber {

	public static void main(String[] args) {
		int n=919;
		int result=findPorcupineNumber(n);
		System.out.println("The porcupine number for n= "+n+" is "+result);
		

	}
	
	static int findPorcupineNumber(int n) {
		if(n<2)
			n=2;
		int porcupineNumber= ++n;// considering the porcupine number should greater than n
		while(porcupineNumber>2) {
			if(isPrime(porcupineNumber)==1) {//checking if the candidate for the porcupine number is prime or not
				if(porcupineNumber%10==9) {//checking if the candidate for the porcupine number ends with 9 or not
					int nextPorcupineNumber=porcupineNumber+1;
					while(nextPorcupineNumber>2) {
						if(isPrime(nextPorcupineNumber)==1) {//checking if the candidate for the next porcupine number is prime or not
							if(nextPorcupineNumber%10==9) //checking if the candidate for the next porcupine number ends with 9 or not
								return porcupineNumber;
							else break;
						}
						nextPorcupineNumber++;
					}
				}
			}
			porcupineNumber++;
		}
		
		
		return porcupineNumber;
	}
	
	static int isPrime(int porcupineNumber) {
		int countDivisor=0;
		if(porcupineNumber==2)
			return 1;
		else {
			for(int i=2; i<porcupineNumber;i++) {
				if(porcupineNumber%i==0)
					countDivisor++;
			}
			if(countDivisor>0)
				return 0;
			else return 1;
		}
	}
}
