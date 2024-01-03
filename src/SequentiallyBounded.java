
public class SequentiallyBounded {

	public static void main(String[] args) {
		int[] a= {2,3,3,4,4,4,5,5,5};
		System.out.println(isSequentiallyBounded(a));

	}
	
	static int isSequentiallyBounded(int[] a) {
		
		for(int outer=0; outer<a.length; outer++) {
			int countSameElements=1;
			for(int inner=outer+1; inner<a.length; inner++) {
				if(a[outer]<0 || a[inner]<0 || a[outer]>a[inner])
					return 0;// array contains negative number or it's not in ascending order
				else if(a[outer]==a[inner])
					countSameElements++;
				
			}
			if(countSameElements>a[outer])
				return 0;// occurance of greater than or equal to it self
		}
		
		return 1;
	}

}
