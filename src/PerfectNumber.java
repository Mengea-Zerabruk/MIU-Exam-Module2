
public class PerfectNumber {

	public static void main(String[] args) {
		int i = 1;
		int j = 3;
		System.out.println(henry(i, j));
	}

	static int henry(int i, int j) {
		int number = 6;
		int sumOfIthandJth = 0;
		int countPn = 0;
		int ith = 0;
		int jth = 0;
		boolean ithFound = false;
		boolean jthFound = false;

		while (number<Integer.MAX_VALUE) {
			int sumOfPn = 0;
			for (int k = 2; k <= number / 2; k++) { // finding factors of number
				if (number % k == 0) {
					sumOfPn += k;
				}
			}
			if (sumOfPn == number) {
				countPn++;
				if (countPn == i) {
					ithFound = true;
					ith = number;
				}
				else if (countPn == j) {
					jthFound = true;
					jth = number;
				}
			}

			if (ithFound && jthFound) {
				sumOfIthandJth = ith + jth;
				break;
			}

			number++;
		}

		return sumOfIthandJth;
	}
}