package practice;

public class PyramidStarPattern {

	public static void main(String[] args) {

		int size = 5;

		for (int row = 0; row < size; row++) {
//			print spaces
			for (int sp = 0; sp < size - row - 1; sp++)
				System.out.print(" ");
//         print stars

			for (int st = 0; st <= 2 * row; st++)
				System.out.print("*");
			System.out.println();
		}
		
//		Output is 
//	     *
//	    ***
//	   *****
//	  *******
//	 *********

	}
}
