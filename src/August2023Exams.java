import java.util.Arrays;

public class August2023Exams {

	public static void main(String[] args) {
		int[] a1= {1,2,3,4,5,6};
		int[] b1= {3,4,5,6,7,8,9};
		int[] result=returnMegrdArray(a1,b1);
		System.out.println(Arrays.toString(result));
		int number=3344555;
		System.out.println(maxOccurDigit(number));

	}
	
	
	static int[] returnMegrdArray(int[] a1, int[] b1) {
		int mergedLength=a1.length+b1.length;
		int[] mergedArray= new int[mergedLength];
		int temp=0;
		int indexOfA1=0;
		int indexOfB1=0;
		
		while(temp<mergedLength) {
			if(indexOfA1<a1.length && indexOfB1<b1.length) {
				if(a1[indexOfA1]<=b1[indexOfB1])
					mergedArray[temp++]=a1[indexOfA1++];
				else
					mergedArray[temp++]=b1[indexOfB1++];
			}
			else if(indexOfA1<a1.length && indexOfB1>=b1.length)
				mergedArray[temp++]=a1[indexOfA1++];
			else if(indexOfA1>=a1.length && indexOfB1<b1.length)
				mergedArray[temp++]= b1[indexOfB1];
		}
		
		return mergedArray;
	}
	
	
	static int maxOccurDigit(int number) {
		
		int max=0;
		int maxOccurDigit=0;
		int temp=0;
		int digit1;
		int digit2;
		int countSameDigits;
		boolean checker=true;
		
		if(number==0)
			return maxOccurDigit;
		while(number!=0) {
			countSameDigits=0;
			temp=number;
			digit1=temp%10;
			while(temp!=0) {
				digit2=temp%10;
				if(digit1==digit2)
					countSameDigits++;
				temp/=10;
			}
			
			if(countSameDigits>max) {
				//checker=true;
				max=countSameDigits;
				maxOccurDigit=digit1;
			}
			else if(countSameDigits==max)
				checker=false;
			number/=10;
			
		}
		if(!checker)
			return -1;
		return maxOccurDigit;
	}

}
