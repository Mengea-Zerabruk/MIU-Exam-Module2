
public class isMartianArray {

	public static void main(String[] args) {
		int[] a= {1,2,-18,-18,1,2};
		System.out.println(isMartian(a));
	}
	
	static int isMartian(int[] a) {
		int count1s=0,count2s=0;
		for(int i=0; i<a.length;i++) {
			if(a[i]==1)
				count1s++;
			if(a[i]==2)
				count2s++;
			if(a[i]==a[0])
				continue;
			else {
				if(a[i]==a[i-1])
					return 0;
			}
		}
		if(count1s<=count2s)
			return 0;
		
		
		
		
		
		return 1;
	}

}
