
public class InertialArray {

	public static void main(String[] args) {
		int [] a= {-2,-4,-6,-8,-11};
		int result=isInertial(a);
		System.out.printf("%s%s","The given array ",result==1? "is Inertial array.":"isn't Inertial array.");
	}
	
	static int isInertial(int [] a) {
		int oddCount=0,evenCount=0;
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {//finding maximum value within the array 
				max=a[i];
			}
			if(a[i]%2!=0) {
				oddCount++;
			}
			else evenCount++;
		}
		if(oddCount<=0||max%2!=0) {
			return 0;
		}
		//Creating array of even and odd number to check the third condition of Inertial Array
		int[] oddArray= new int[oddCount];
		int[] evenArray= new int[evenCount];
		int oddIndex=0,evenIndex=0;
		for(int j=0; j<a.length; j++) {
			if(a[j]%2==0) {
				if(a[j]==max) {
					continue;// third condition doesn't consider the maximum value i.e. not compulsory in the comparison
				}
				evenArray[evenIndex++]=a[j];
			}
			else oddArray[oddIndex++]=a[j];
		}
		//checking every odd element is greater than even elements
		for(int  k=0; k<oddArray.length;k++) {
			for(int l=0; l<evenArray.length; l++) {
				if(evenArray[l]>=oddArray[k]) {
					return 0;
				}
			}
		}
				
		
		
		
		return 1;
	}

}
