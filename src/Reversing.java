
public class Reversing {

	public static void main(String[] args) {
		int number=123456;
		String text="amanaP ,lanac a ,nalp a ,nam A";
		System.out.println(reversedNumber(number));
		System.out.println(reversedText(text));
		
	}
	
	static int reversedNumber(int number) {
		int result=0;
		if(number==0)
			return result;
		while(number!=0) {
			result= result*10 + number%10;
			number/=10;
		}
		return result;
	}
	
	static String reversedText(String text) {
		String result="";
		int stringLength=text.length();
		if(stringLength==0)
			return result;
		for(int index=stringLength-1; index>=0; index--) {
			result=result + text.charAt(index);
			
		}
		return result;
	}

}
