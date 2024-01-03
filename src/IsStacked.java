
public class IsStacked {

	public static void main(String[] args) {
		int n=7;
		System.out.println(isStacked(n));

	}
	
	static int isStacked(int n) {
		
		int sumOfNumb=0;
		int numb=1;
		while(true) {
			sumOfNumb+=numb;
			if(sumOfNumb==n)
				break;
			else if(sumOfNumb>n)
				return 0;
			else
				numb++;
		}
		return 1;
	}

}
