package practice;

public class MissingNumber {

	public static void main(String[] args) {

		int s[] = { 1, 2, 3,4, 5, 6, 7,8 };
//		find missing number 

		int sum = 0;

		for (int i = 0; i < s.length; i++) {
			sum = sum + s[i];
		}

		System.out.println(sum);

		int sum1 = 0;
		for (int j = 1; j <= 9; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		System.out.println("Missing Number is :::" + (sum1 - sum));
	}

}
