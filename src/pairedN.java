
public class pairedN {

	public static void main(String[] args) {
		int [] a= {1,4,1,4,5,6};
		int n=6;
		System.out.println(isPaired(a,n));

	}
	static int isPaired(int[] a,int n) {
		
		boolean checkPair=false;
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				int sum=0;
				if(i==j)
					continue;
				else {
					sum=i+j;
					if(sum>n){
						checkPair=true;
						break;
					}
					
				}
			}
		}
		if(checkPair) {
			for(int i=0;i<a.length;i++) {
				for(int j=0; j<a.length;j++) {
					if(i==j)
						continue;
					else {
						if(a[i]+a[j]==n && (i+j)==n)
							return 1;
					}
				}
			}
		}
		return 0;
	}

}
