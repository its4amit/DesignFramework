package practice;

public class FactorialNumber {

//	 fact of 5----->  5*4*3*2*1= 120
//	

// output ---->
//	720
//	120
//	24
//	1

	public static void main(String[] args) {

		System.out.println(factorial(6));
		System.out.println(factorial(5));
		System.out.println(factorial(4));
		System.out.println(factorial(1));

	}

	public static int factorial(int num) {

		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		return fact;

	}

}
