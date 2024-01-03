import java.util.Arrays;

public class PairWiseSum {

	public static void main(String[] args) {
		int[] a= {2,1,18,-5};
		System.out.println(Arrays.toString(pairWiseSum(a)));

	}
	
	static int[] pairWiseSum(int[] a) {
		int [] resultArray;
		if(a.length==0||a.length%2!=0)
			return null;// the array is either no elements or odd number of elements
		else {
			int resultIndex=0;
			resultArray=new int[a.length/2];
			for(int index=0; index<a.length;index+=2) 
				resultArray[resultIndex++]=a[index]+a[index+1];
				
			
			
		}
		
		
		return resultArray;
	}

}
