
public class SumFactor {

	public static void main(String[] args) {
		int [] a= {1};
		System.out.println("The sum factor of the given array is "+ sumFactor(a));

	}
	
	
	static int sumFactor(int[] a) {
		int sum=0, sumFactor=0;
		for(int i=0; i<a.length;i++) {
			sum+=a[i];
		}
		for(int j=0;j<a.length;j++) {
			if(sum==a[j])
				sumFactor++;
		}
		return sumFactor;
	}
}
