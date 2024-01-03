
public class Matches {

	public static void main(String[] args) {
		int[] a= {1,2,3,-5,-5,2,3,18};
		int[] p= {3,-2,3};
		System.out.println(matches(a,p));

	}
	static int matches(int[] a, int[] p ) {
		int temp=0;
		if(p.length!=p[0] || p[0]>a.length)
			return 0;// the array has p[0] elements which exceeds the limit of array p
		for(int n: p) {
			if(n==0)
				return 0;// each element of array p should not be zero
			if(n<0)
				n*=-1;
			temp+=n;
		}
		if(temp!=a.length)
			return 0;// absolute sum of each n must equal to a.length
		
		int lengthOfA= 0;
		for(int outer=0; outer<p.length; outer++) {
			if(p[outer]>0) {
				for(int inner=0; inner<p[outer];inner++) {
					if(a[lengthOfA++]<0)
						return 0;// the sequence should be positive
				}
			}
			else {
				int abs=p[outer]*-1;
				for(int inner=0; inner<abs;inner++) {
					if(a[lengthOfA++]>0)
						return 0;//the sequence should be negative
				}
				
			}
		}
		
		
		return 1;
	}

}
