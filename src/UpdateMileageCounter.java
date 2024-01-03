import java.util.Arrays;

public class UpdateMileageCounter {

	public static void main(String[] args) {
		
		int [] a= {9,9,9,9,9,9,9,9,9,9};
		int miles=13;
		updatedMileageCounter(a,miles);
	}
	
	static void updatedMileageCounter(int[] a, int miles) {
		long mileageCounter=0, updatedMileageCounter=0;
		for(int index=a.length-1; index>=0;index--)
			mileageCounter=mileageCounter*10+a[index];
		while(miles>0) {
			updatedMileageCounter=helperFunction(mileageCounter);
			mileageCounter=updatedMileageCounter;
			miles--;
		}
		
		int[] updatedArray=new int[a.length];
		for(int updatedIndex=0; updatedIndex<a.length; updatedIndex++) {
			updatedArray[updatedIndex]=(int) (updatedMileageCounter%10);
			updatedMileageCounter/=10;
		}
		System.out.println(Arrays.toString(updatedArray));
		
		//System.out.println(Arrays.toString(updatedMileageCounter));
	}
	
	static long helperFunction(long mileageCounter) {
		
		return mileageCounter+1;
	}
}
