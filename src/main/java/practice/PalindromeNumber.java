package practice;

public class PalindromeNumber {

//	 palindrome number ----> 151, 454, 222,121,78987 

	public static void main(String[] args) {

		PalindromeNumber number = new PalindromeNumber();
		number.palindromeNumberis(151);
		number.palindromeNumberis(78987);
		number.palindromeNumberis(121);
		number.palindromeNumberis(454);
		number.palindromeNumberis(220);

	}

	public void palindromeNumberis(int num) {

		System.out.println("Given number is :" + num);
		int r = 0;
		int sum = 0;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (t == sum) {
			System.out.println("This is palindrome number");
		} else {
			System.out.println("This is not a palindrome number");
		}

	}
}
