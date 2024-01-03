
public class NUnique {

	public static void main(String[] args) {
		int[] a= {7,3,3,2,4};
		int n=3;
		System.out.println(isNUnique(a,n));

	}
	
	static int isNUnique(int[] a, int n) {
		if(a.length<2)
			return 0;
		else {
			int countPairs=0;
			for(int outer=0;outer<a.length;outer++) {
				int temp= 0;
				for(int inner=outer+1; inner<a.length; inner++) {
						 temp= a[inner]+ a[outer];
						 if(temp==n)
							 countPairs++;
						 if(countPairs>1)
							 return 0;// having more than 1 pairs sum to n
					
				}
			}
			
			if(countPairs==1)
				return 1;
		}
		return 0;
	}

}
