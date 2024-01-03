
public class IsPaired {

	public static void main(String[] args) {
		int[] a= {1,1,2,2,2,3,3};
		System.out.println(isLayered(a));

	}
	
	static int isLayered(int[] a) {
		int countSameElements=0;
		if(a.length<2)
			return 0;
		else {
			for(int index=0; index<a.length-1;index++) {
				if(a[index]>a[index+1])
					return 0;
				if(a[index]==a[index+1])
					countSameElements++;
				else {
					if(countSameElements>=1) {
						countSameElements=0;
						continue;
					}
					
						return 0;
				}
			}
			
			
				
		}
					
		
		return 1;
	}

}
