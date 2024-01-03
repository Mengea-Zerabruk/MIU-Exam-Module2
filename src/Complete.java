
class Complete {

	public static void main(String[] args) {
		int[] a= {2,6,9};
		System.out.println(complete(a));

	}
	
	static int complete(int[] a) {
		
		if(a.length<2)
			return 0;
		else {
			int countEvens=0;
			boolean isPerfectSquare=false, isSum8=false;
			for(int index=0; index<a.length;index++) {
				if(a[index]%2==0)
					countEvens++;// having an even element
				if(index<a.length-1) {// executes before the last element of the array, after that it lead to array out of bounds
					if(a[index]+a[index+1]==8)
						isSum8=true;	
				}
				if(isPerfect(a[index]))
					isPerfectSquare=true;
					
			}
			
			if(countEvens>0 && isPerfectSquare && isSum8)
				return 1;
			return 0;
		}
		
		
		
	}
	
	static boolean isPerfect(int num) {
		if(num<0)
			return false;
		else {
			for(int result=0; result<=num; result++) {
				if(result*result==num)
					return true;
			}
		}
		return false;
	}

}
