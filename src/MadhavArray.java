
public class MadhavArray {

	public static void main(String[] args) {
		int[] a= {6,2,4,2,2,2,1,5,0,0};
		
		System.out.printf("%s%s%s\n","The array ",isMadhavArray(a)==1?"is ":"is not "," Madhav array.");
	}
	static int isMadhavArray(int[] a) {
		int len=a.length;
		int sum=0,someNumber=0;
		
		for(int i=2; ;i++) {
			sum=i*(i+1)/2;
			if(sum==len) {
				someNumber=i;
				System.out.println("The some number is: "+someNumber);
				break;
			}
				
			if(sum>len)
				return 0;
		}
		//Option1:
		int k=1;//this variable allows to access each indices of the array
		for(int i=1;i<someNumber;i++) {
			sum=0;
			for(int j=0;j<i+1;j++) {
				sum=sum+a[k];
				k++;
			}
			if(sum!=a[0])
				return 0;
		}
		
		//Option2:
//		for(int i=1;i<=someNumber;i++) {
//			sum=0;
//			for(int j=i;j<=i+1;j++) {
//				sum=sum+a[j];
//			}
//			if(sum!=a[0]) {
//				return 0;	
//				}
//			i++;
//			}
		
		
		return 1;
	}
}
