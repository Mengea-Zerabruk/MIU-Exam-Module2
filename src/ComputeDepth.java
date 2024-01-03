
public class ComputeDepth {

	public static void main(String[] args) {
		int n=25;
		System.out.println(computeDepth(n));

	}
	
	static int computeDepth(int n) {
		int multiples=1;
		int value=0;
		int index=0;//for adding values to the trackDigits array
		boolean [] trackDigits= new boolean[10];
		while(true) {
			value=n*multiples;
			while(value>0) {
				int newDigit=value%10;
				if(!trackDigits[newDigit]) {
					trackDigits[newDigit]=true;
					index++;
					if(index==10)
						return multiples;
				}
				value/=10;
			}
			
			multiples++;
		}
	}
}