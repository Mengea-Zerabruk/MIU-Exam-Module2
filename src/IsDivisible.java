
public class IsDivisible {

	public static void main(String[] args) {
		int [] a= {6,12,24,36};
		int divisor= 3;
		System.out.println(isDivisible(a,divisor));

	}
	
	static int isDivisible(int[] a, int divisor) {
		for(int x=0; x<a.length;x++) {
			if(a[x]%divisor!=0)
				return 0;
		}
		return 1;
	}

}
