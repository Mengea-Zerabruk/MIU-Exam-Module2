
public class AllValuesTheSame {

	public static void main(String[] args) {
		int [] a= {1,1,1,1};
		System.out.println(allValuesTheSame(a));

	}
	
	static int allValuesTheSame(int [] a) {
		
		if(a.length==0)
			return 0;
		else {
			int firstElement=a[0];
			for(int arrayElements:a) {
				if(firstElement!=arrayElements)
					return 0;
			}
		}
		
		return 1;
	}

}
