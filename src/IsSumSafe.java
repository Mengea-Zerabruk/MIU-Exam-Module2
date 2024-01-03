
public class IsSumSafe {

	public static void main(String[] args) {
		int [] a= {5,-2,1};
		System.out.println(isSumSafe(a));

	}
	
	static int isSumSafe(int[] a) {
		int sumOfElements=0;
		for(int eachArrayElement: a)
			sumOfElements+=eachArrayElement;
		for(int eachArrayElement:a) {
			if(eachArrayElement==sumOfElements)
				return 0;
		}
		return 1;
	}

}
