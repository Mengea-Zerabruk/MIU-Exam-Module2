
public class One21Array {

	public static void main(String[] args) {
		int[] a= {1,1,2,2,1,1,2,1,3};
		System.out.println(is121Array(a));

	}
	
	
	static int is121Array(int[] a) {
		if(a.length<3|| a[0]!=1 || a[a.length-1]!=1)
			return 0;
		else {
			int beginningOnes=0;
			int followedTwos=0;
			int lastOnes=0;
			int beginningOnesEndIndex=0;
			
			for(int index=0; index<a.length; index++) {
				if(a[index]!=1 && a[index]!=2)
					return 0;// the array contains a number other than 1 and 2
				else {
					if(a[index]==1 && beginningOnesEndIndex==index) {
						beginningOnes++;
						beginningOnesEndIndex++;
					}
					else if(a[index]==2)
						followedTwos++;
					else
						break;
					
				}
			}
			for(int index=a.length-1;index>=0;index--) {
				if(a[index]==1)
					lastOnes++;
				else
					break;
			}
			
			if(beginningOnes!=lastOnes || followedTwos<1)
				return 0;
		}
		
		
		
		
		
		return 1;
	}
}
