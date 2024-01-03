
public class GetExponent {

	public static void main(String[] args) {
		int p=4;
		int n=128;
		System.out.println(getExponent(n,p));

	}
	
	static int getExponent(int n, int p) {
		if(p<=1)
			return -1;
		int result=0;
		while(true) {
			int temp= (int) Math.pow(p, result);
			if(n%temp==0)
				result++;
			else
				break;
		}
		
		
		return result-1;
	}

}
