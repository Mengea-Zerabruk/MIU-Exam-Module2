
public class GuthrieSequence {

	public static void main(String[] args) {
		int n=8;
		int [] a= {8,4,2};
		int result= isGutherieSequence(a);
		System.out.printf("%s%s%s\n","The sequence ",result==1?"is ":"isn't ","Gutherie Sequence");
	}
	static int isGutherieSequence(int[] a) {
		int n=a[0], newValue=n, indexCounter=0;
		if(n<=0 || a.length<2|| a[a.length-1]!=1 )
			return 0;
		while(n>1) {
			if(n%2==0) {
				newValue=n/2;
				if(newValue!=a[++indexCounter])
					return 0;
			}
			else {
				newValue=n*3+1;
				if(newValue!=a[++indexCounter])
					return 0;
			}
			n=newValue;
				
		}
		return 1;
	}
	
}
