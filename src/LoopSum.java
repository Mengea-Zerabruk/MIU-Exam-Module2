
public class LoopSum {

	public static void main(String[] args) {
		
		int[] a= {-1,2,-1};
		int n=7;
		System.out.println(allValuesTheSame(a,n));
	}
	
	
	static int allValuesTheSame(int[]a, int n) {
		if(a.length==0)
			return 0;
		else {
			int result=0, countElement=0;
			for(int index=0; index<a.length;index++) {
				countElement++;
				result+=a[index];
				if(countElement>=n)// 
					return result;//we reached same number of elements as n
				if(index==a.length-1)
					index=-1;//to restart the loop from the beginning
			}
			return result;
		}
		
	}

}
