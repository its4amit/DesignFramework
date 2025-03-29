package practice;

public class ArmstrongNumber {

//	Find Armstrong number = 153---->    1*1*1  + 5*5*5 + 3*3*3---> 153
//	370,371,407
//   given number is = 0,1,153,200, ------> find which is an armstrong number?

//	output is 
//	Given number is 153
//	This is an armstrong number
//	Given number is 200
//	This is not an armstrong number
//	Given number is 1
//	This is an armstrong number
//	Given number is 0
//	This is an armstrong number

	public static void main(String[] args) {

		armstrongNumber(153);
		armstrongNumber(200);
		armstrongNumber(1);
		armstrongNumber(0);
	}

	public static void armstrongNumber(int num) {

		System.out.println("Given number is " + num);

		int cube = 0;
		int r;
		int t;
		t = num;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);

		}
		if (t == cube) {
			System.out.println("This is an armstrong number");
		} else {
			System.out.println("This is not an armstrong number");
		}
	}

}
