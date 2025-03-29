package practice;

public class AlphabetPattern {

	public static void main(String[] args) {

//		Ascii range A-Z---> 65 to 90
//		Ascii range a-z----> 97 to 122

		int alpha = 65;
		int size = 6;

		for (int row = 0; row <= size; row++) {
			for (int col = 0; col <=row; col++)
				System.out.print((char) (alpha + col) + " ");
			System.out.println();
		}
//		Output is 
//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 
//		A B C D E F 
//		A B C D E F G 

//	Print  alphabet	

		int alpha1 = 66;
		int size1 = 5;

		for (int row = 0; row <= 5; row++) {
			for (int col = 0; col <= row; col++)

				System.out.print((char) alpha1 + " ");
			alpha++;
			System.out.println();
		}
		
		
//		Output is  
//		B 
//		C C 
//		D D D 
//		E E E E 
//		F F F F F 
//		G G G G G G 
		
	}

}
