
public class IsLegalNumber {

	public static void main(String[] args) {
		int[] a= {3,7,1};
		int base=6;
		System.out.println(convertToBase10(a,base));

	}
	
	static int isLegalNumber(int[] a, int base) {
		if(base==10)
			return 0;// already in base 10
		else {
			int base10Result=0;
			int superScript=0;
			boolean isNotLegalNumber=false;
			for(int index=a.length-1; index>=0;index--) {
				if(a[index]>=base) {
					isNotLegalNumber=true;
					return 0;// the digit is greater than the base
				}
		}
		return 1;//isLegal number
	}
	}
	
	static int convertToBase10(int[] a, int base) {
		int result=0, superScript=0;
		if(isLegalNumber(a,base)!=1)
			return -1;//not legal number
		else {
			for(int index=a.length-1;index>=0;index--)
			 result+=(a[index]*Math.pow(base, superScript++));
		}
			
		return result;
	}
}
