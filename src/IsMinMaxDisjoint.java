
public class IsMinMaxDisjoint {

	public static void main(String[] args) {
		int[] a= {5,4,1,3,2};
		System.out.println(isMinMaxDisjoint(a));

	}
	
	static int isMinMaxDisjoint(int[] a) {
		if(a.length<2)
			return 0;// doesn't have atleast two elements to compare
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int countMax=1;
		int countMin=1;
		for(int element: a) {
			if(element<min)
				min=element;
			if(element>max)
				max=element;
				
		}
//		System.out.println(min);
//		System.out.println(max);
		
		if(min==max || max==min-1 || max==min+1)
			return 0;
		for(int elements: a) {
			if(elements==max)
				countMax++;
			if(elements==min)
				countMin++;
		}
//		System.out.println(countMin);
//		System.out.println(countMax);
		if(countMin>2 || countMax>2)
			return 0;
		
		return 1;
	}

}
