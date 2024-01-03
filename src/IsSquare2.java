
public class IsSquare2 {

	public static void main(String[] args) {
		int n=0;
		System.out.println(isSquared(n));

	}
	
	static int isSquared(int n) {
		if(n<0)
			return 0;// there is no negative-integer resulted as a squared of numbers
		else {
			for(int someInteger=0;someInteger<n; someInteger++) {
				if(someInteger*someInteger==n)
					return 1;// satifying the condition
			}
		}
		return 0;// there is no someInteger squared gives n
	}

}
