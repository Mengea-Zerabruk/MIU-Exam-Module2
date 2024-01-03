
public class IsNPrimeable {

	public static void main(String[] args) {
		int [] a= {};
		int n=4;
		System.out.println(isNPrimeable(a,n));
	}
		static int isNPrimeable(int[] a, int n) {
			boolean isPrime=false;
			for(int i=0; i<a.length;i++) {
				a[i]+=n;
				if(a[i]<0)
					return 0;
				else if(a[i]<=2)
					isPrime=true;
				else {
					for(int j=2;j<a[i];j++) {
						if(a[i]%2==0)
							return 0;
					}
				}
					
			}
			
			
			
			
			
			return 1;
		}

}
