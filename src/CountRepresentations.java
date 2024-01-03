
public class CountRepresentations {

	public static void main(String[] args) {
		int numRupees=18;
		System.out.println(countRepresentation(numRupees));

	}
	
	static int countRepresentation(int numRupees) {
		int result=0;
		if(numRupees<=0)
			return 0;
		for(int rupees20=0; rupees20<=numRupees/20; rupees20++) {
			
			for(int rupees10=0; rupees10<=numRupees/10; rupees10++) {
				
				for(int rupees5=0; rupees5<=numRupees/5; rupees5++) {
					
					for(int rupees2=0; rupees2<=numRupees/2; rupees2++) {
						
						for(int rupees1=0; rupees1<=numRupees; rupees1++) {
							
							int checker=20*rupees20+10*rupees10+5*rupees5+2*rupees2+rupees1;
							if(checker==numRupees)
							  result++;
						}
					}
				}
			}
		}
		return result;
			
		}
		
	}


