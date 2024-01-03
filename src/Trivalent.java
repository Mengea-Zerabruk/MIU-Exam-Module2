import java.util.ArrayList;

public class Trivalent {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		ArrayList<Integer> list1= new ArrayList<Integer> ();
		
		System.out.println(isTrivalent(a));
	}
	
	static int isTrivalent(int[] a) {
		int countElements=1;
		int firstElement;

		if(a.length<3)
			return 0;
		for(int outer=0; outer<a.length; outer++) {
			for(int inner=outer+1; inner<a.length; inner++) {
				//sorting the array in Ascending order
				if(a[outer]>a[inner]) {
					int temp= a[outer];
					a[outer]=a[inner];
					a[inner]=temp;
					
				}
				
			}
			
		}
		countElements=1;
		firstElement=a[0];
		for(int arrayElements:a) {
			
			if(arrayElements!=firstElement) {
				
				firstElement=arrayElements;
				countElements++;
			}
			if(countElements>3)
				return 0;
		}
		if(countElements<3)
			return 0;
		
		return 1;
	}

}
