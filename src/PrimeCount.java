
public class PrimeCount {

	public static void main(String[] args) {
		int start=140;
		int end=148;
		System.out.println(primeCount(start,end));
	}
	static int primeCount(int start, int end) {
		/*The function returns the number of primes between start and end inclusive. Recall that a prime is
			a positive integer greater than 1 whose only integer factors are 1 and itself.
		 * 
		 */
		int numberOfPrimes=0;
		//Option1: old way
//		while(start<=end) {
//			if(start>1) {
//				if(start>1&&start<9) {
//					if(start==2||start==3||start==5||start==7) {
//						numberOfPrimes++;
//					}
//				}
//				if(start%2!=0&&start%3!=0&&start%4!=0&&start%5!=0&&start%6!=0&&start%7!=0&&start%8!=0&&start%9!=0) {
//					numberOfPrimes++;
//				}
//				
//			}
//			start++;
//		}
		//Option2: efficient way
		while(start<=end) {
			//Option 2.1:
//			int flag=1;//Checking how many of the variable i gives modulo of zero.
//			if(start>1) {
//				for(int i=2;i<=Math.sqrt(start);i++) {
//					if(start%i==0) {
//						break;
//					}
//					else flag++;
//				}
//				if(flag==(int)Math.sqrt(start)) {
//					System.out.print(start+", ");
//					numberOfPrimes++;
//				}
//			
//				
//			}
			//Option 2.2:
				int count=0;
				if(start>1) {
					if(start==2) {// because a prime number starts from 2
						numberOfPrimes++;	
						
					}
					else {
						for(int i=2;i<start;i++ ) {
							if(start%i==0) {//checking if there is a number i, which results remainder of zero
								count++;
							}
						}
						if(count==0) {// when there isn't a number i which is divided by start , we meant that the number is primeNumber
							numberOfPrimes++;
						}
					}
				}
				
				start++;
			}
		return numberOfPrimes;
		}
}		
			
		
		
	


