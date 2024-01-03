
public class IsSquare {

	public static void main(String[] args) {
		int n=4;
		System.out.println(isSquare(n));

	}
	
	static int isSquare(int n) {

		//Option1: less efficient way
//		if(n<0)
//			return 0;//there is no negative integer which is squared 
//		else if(n==0 || n==1)
//			return 1;// 1*1==1 and 0*0==0 
//		else {
//			int countFactors=0;
//			int factorsIndex=0;
//			for(int factors=1;factors<=n;factors++) {
//				if(n%factors==0)
//					countFactors++;// how many factors does the number have
//			}
//			if(countFactors<=2)
//				return 0;// means the number is divided by 1 and itself, so it does'nt satisfy isSquare
//			int[] arrayOfFactors=new int[countFactors];
//			
//			for(int factors=1; factors<=n; factors++) {
//				if(n%factors==0)
//					arrayOfFactors[factorsIndex++]=factors;//adding the factors to an arrayOfFactors
//			}
//			for(int element: arrayOfFactors) {
//				if(element*element==n)// checking if each element of the arrayOfFactors multiplied by itself gives n
//					return 1;
//			}	
//		}
//		return 0;
		
		//Option2: most efficient way
		
		if(n<0)
			return 0;
		else {
			for(int possibleSquareRoot=0; possibleSquareRoot<=n;possibleSquareRoot++) {
				if((possibleSquareRoot*possibleSquareRoot)==n)
					return 1;
				
			}
			return 0;
		}
	}

}
