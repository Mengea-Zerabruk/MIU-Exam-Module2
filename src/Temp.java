
public class Temp {

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
		
		return 1;
	}

}
