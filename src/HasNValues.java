import java.util.Arrays;

public class HasNValues {

	public static void main(String[] args) {
		int[] a= {8,1,1,8,8,1,8,8,1,1};
		int n=2;
		System.out.println(hasNValues(a,n));

	}
	
	static int hasNValues(int[] a, int n) {
		int temp=0, countDifferentValues=1;
		for(int outerLoopIndex=0; outerLoopIndex<a.length; outerLoopIndex++ ) {
			//to sort the array in ascending order, use nested for loop
			for(int innerLoopIndex=outerLoopIndex; innerLoopIndex<a.length;innerLoopIndex++ ) {
				if(a[outerLoopIndex]>a[innerLoopIndex]) {
					temp=a[innerLoopIndex];
					a[innerLoopIndex]=a[outerLoopIndex];
					a[outerLoopIndex]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		int previousValue=a[0];
		
		for(int index=0;index<a.length;index++) {
			if(a[index]!=previousValue) {
				countDifferentValues++;
				previousValue=a[index];
				
			}
		}
		if(countDifferentValues!=n)
			return 0;// number of different elements and n are different
		
		return 1;
	}

}
