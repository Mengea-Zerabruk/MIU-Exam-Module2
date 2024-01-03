
public class IsHenry {

	public static void main(String[] args) {
		int i = 1;
		int j = 4;
		System.out.println(isHenry(i, j));

	}

	static int isHenry(int i, int j) {
		int ithPerfectNum = 0, jthPerfectNum = 0, number = 1, countPerfectNum = 0;
		if (j <= i)
			return 0;
		else {
			while (number < Integer.MAX_VALUE) {
				int sum = 0;
				for (int x = 1; x < number; x++) {
					if (number % x == 0) 
			
							sum += x;
				}
				if (sum == number) {
					countPerfectNum++;
					if (countPerfectNum == i) {
						ithPerfectNum = number;
						System.out.println(ithPerfectNum);
						continue;
					} else if (countPerfectNum == j) {
						jthPerfectNum = number;
						System.out.println(jthPerfectNum);
						break;
					}
				}
				number++;
			}
			return ithPerfectNum + jthPerfectNum;
		}
	}
}
