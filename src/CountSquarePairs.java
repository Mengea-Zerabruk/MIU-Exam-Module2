
public class CountSquarePairs {

	public static void main(String[] args) {
		int [] a={9,0,2,-5,7};
		int result= countSquarePairs(a);
		System.out.printf("%s%d%s\n","The given array have ",result," square pairs.");
	}
	static int countSquarePairs(int [] a) {
		//Checking length of given array is >2
		if(a.length<2) {
			return 0;
		}
		//Filter out non-zero integers from the array
		int posetiveInt=0, pSqCount=0, xy=0, perSqr=0;
		
		for(int i=0; i<a.length;i++) {
			if(a[i]>0)
				posetiveInt++;// important in making the size of filtered array
		}
		int[] filteredArray= new int[posetiveInt];//Creating a new array of non-zero integers
		int filteredIndex=0;// important in creating indices of the filtered array
		for(int i=0; i<a.length; i++) {
			if(a[i]>0)
				filteredArray[filteredIndex++]=a[i];
		}
		//Checking length of the filtered array is >2
		if(filteredArray.length<2)
			return 0;
		else {
			for(int i=0; i<filteredArray.length;i++) {
				for(int j=0; j<filteredArray.length; j++) {
				
					if(filteredArray[i]<filteredArray[j]) {
						xy=filteredArray[i]+filteredArray[j];
						int result= perfectSquare(xy);
						if(result==1)
							pSqCount++;
					}
				}
			}
		}
		
		return pSqCount;
	}
	
	static int perfectSquare(int xy) {
		int n= (int) Math.sqrt(xy);
		if((n*n)==xy)
			return 1;
		return 0;
	}

}
