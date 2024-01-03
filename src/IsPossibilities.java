
public class IsPossibilities {

	public static void main(String[] args) {
		int [] a= {};
		System.out.println(isAllPossibilities(a));

	}
	
	static int isAllPossibilities(int[] a) {
		if(a.length==0)
			return 0;
		else {
			for(int possibleNumbers=0; possibleNumbers<a.length; possibleNumbers++) {
				boolean isPossibleNumberExist=false;
				for(int arrayElement:a) {
					if(arrayElement==possibleNumbers)
						isPossibleNumberExist=true;
				}
				if(!isPossibleNumberExist)
					return 0;
			}
		}
		
		return 1;
	}

}
