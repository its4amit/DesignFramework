package practice;

public class Parallelogram {

	public static void main(String[] args) {

		int size = 4;

		for (int row = 0; row < size; row++) {
//			print space
			for (int sp = 0; sp <=row; sp++)
				System.out.print(" ");
//      print star

			for (int st = 0; st < size - row; st++)
				System.out.print("*");

//			print stars
			for (int st = 0; st <= row; st++)
				System.out.print("*");
			System.out.println();

		}
		
//		Output is
		
//		 *****
//		  *****
//		   *****
//		    *****


	}

}
