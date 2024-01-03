
public class Hollow {

	public static void main(String[] args) {
		int[] a= {0,0,0};
		System.out.println(isHollow(a));
		
		
		
	}
	static int isHollow(int[] a) {
		int preZeroes=0, countZeroes=0, postZeroes=0, temp=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]!=0)
				preZeroes++;
			else break;
		}
		for(int j=preZeroes; j<a.length;j++) {
			if(a[j]==0)
				countZeroes++;
			else break;
		}
		temp=preZeroes+countZeroes;
		for(int k=temp; k<a.length;k++) {
			if(a[k]==0)
				return 0;
			else 
				postZeroes++;
			
		}
		if(preZeroes!=postZeroes || countZeroes<3) {
			return 0;
		}
		
		
		
		return 1;
	}

}
