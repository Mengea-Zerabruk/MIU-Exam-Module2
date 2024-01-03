
public class IsVanilla {

	public static void main(String[] args) {
		int[] a= {};
		System.out.println(isVanilla(a));
	}
	
	static int isVanilla(int[] a) {
		if(a.length==0)
			return 1;
		int referenceDigit=a[0]%10;
		for(int arrayElement:a) {
			if(arrayElement==0 && arrayElement!=referenceDigit)
				return 0;//having different digits
			while(arrayElement!=0) {
				int newDigit=arrayElement%10;
				if(newDigit!=referenceDigit)
					return 0;// having different digits 
				arrayElement/=10;
			}
		}
		
		
		return 1;
	}

}
