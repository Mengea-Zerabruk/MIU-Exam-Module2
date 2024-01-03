
public class Centered15 {

	public static void main(String[] args) {
		int [] a= {1,1,8,3,1,1};
		System.out.println(centered15(a));
	}
	static int centered15(int[] a) {
		int precededElements=0, followedElements=0, sumOfElements=0;
		for(int outerIndex=0; outerIndex<a.length; outerIndex++) {
			sumOfElements=a[outerIndex];
			for(int innerIndex=outerIndex; innerIndex<a.length; innerIndex++) {
				if(innerIndex==outerIndex)
					continue;
				else {
					sumOfElements+=a[innerIndex];
					if(sumOfElements>15)
						break;
					if(sumOfElements==15) {
						followedElements=a.length-1-innerIndex;
						precededElements=outerIndex;
						break;
					}
						
				}
			}
			
			if(followedElements==precededElements)
				return 1;
		}
		
		return 0;
	}

}
