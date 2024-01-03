
public class GutherieIndex {

	public static void main(String[] args) {
		int n=100;
		System.out.println("The Gutherie Index of the argument is "+gutherieIndex(n));

	}
	
	static int gutherieIndex(int n) {
		int length=0, newValue=0;
		if(n<=1)
			return length;
		while(n>1) {
			if(n%2==0) {
				newValue=n/2;
				length++;
			}
			else {
				newValue=n*3+1;
				length++;
			}
			n=newValue;
		}
		return length;
	}

}
