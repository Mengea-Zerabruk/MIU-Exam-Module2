
public class IsOddHeavy {

	public static void main(String[] args) {
		int[] a= {-2,-4,-6,-8,-11};
		System.out.println(isOddHeavy(a));
	}
	
	static int isOddHeavy(int[] a) {
		boolean atleast1Odd=false;
		for(int eachElement: a) {
			if(eachElement%2 != 0) {
				atleast1Odd=true;
				break;
			}
		}
		if(!atleast1Odd)
			return 0; //no odd element in the array
		for(int outer=0; outer<a.length; outer++) {
			if(a[outer]%2 != 0) {// extracting odd elements for comparison
				for(int inner=0; inner<a.length;inner++) {
					if(a[inner]%2 == 0) {//extracting even element to compare with the odd element
						if(a[inner]>a[outer])
							return 0;// even element is greater than odd element
					}
				}
			}
		}
		
		return 1;
	}

}
