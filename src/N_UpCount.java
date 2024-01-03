
public class N_UpCount {

	public static void main(String[] args) {
		int [] a = {1,2,-1,5,3,2,-3};
		int n=20;
		System.out.println(nUpCount(a,n));
	}
	
	static int nUpCount(int[] a, int n) {
		int previousValue=a[0];
		int partialSum=0;
		int upCount=0;
		for(int i=1;i<a.length;i++) {
			partialSum=previousValue+a[i];
			if(previousValue<=n&&partialSum>n) {
				upCount++;
			}
			previousValue=partialSum;
		}
		
		return upCount;
	}
}
