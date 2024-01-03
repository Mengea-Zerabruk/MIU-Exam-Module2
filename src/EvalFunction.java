
public class EvalFunction {

	public static void main(String[] args) {
		int [] a= {3,-2,-1};
		double x=2.0;
		System.out.println(resultOfEvalFunction(a,x));

	}
	
	static double resultOfEvalFunction(int[] a, double x) {
		double totalSum=0.0;// holds values of the sum of the function
		for(int index=0; index<a.length; index++) {
			totalSum+=(a[index]*Math.pow(x,index));// I use the Math class to calculate x the power of index
		}
		return totalSum;
	}

}
