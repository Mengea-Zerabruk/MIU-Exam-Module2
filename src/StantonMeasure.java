
public class StantonMeasure {

	public static void main(String[] args) {
		int[] a= {};
		System.out.println("The Stanton measure of the given array is "+stantonMeasure(a));
	}
	
	static int stantonMeasure(int [] a) {
		int n=0, result=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==1)
				n++;
		}
		for(int j=0;j<a.length;j++) {
			if(a[j]==n)
				result++;
		}
		
		return result;
	}

}
