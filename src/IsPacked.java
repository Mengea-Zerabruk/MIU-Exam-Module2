
public class IsPacked {

	public static void main(String[] args) {
		int [] a= {};
		System.out.println(isPacked(a));

	}
	
	static int isPacked(int[] a) {
		if(a.length==0)
			return 1;
		
		int index=0;
		while(index<a.length) {
			if(a[index]<=0)
				return 0;
			int countN=1, temp=0;
			boolean isConsecutive=true;
			for(int inner=index+1; inner<a.length; inner++ ) {
				if(a[index]==a[inner] && isConsecutive)
					countN++;
				else if(a[index] != a[inner]) {
					temp=inner-1;
					isConsecutive=false;
				}
				else if(a[index] == a[inner] && !isConsecutive)
					return 0;
				//else break;
			}
			if(countN == a[index])
				return 1;
			
			index=temp+1;
		}
		
		return 0;
	}

}
