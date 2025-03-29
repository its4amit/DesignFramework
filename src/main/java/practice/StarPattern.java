package practice;

public class StarPattern {

	public static void main(String[] args) {
	
//     Increasing Triangle Program
		
//		int size = 5;
//		for(int row= 1; row<=size;row++) {
//			
//			for(int col=1; col<=row;col++) {
//				
//				System.out.print("* ");
//				
//			}
//			System.out.println();
//		}
//		Output is 
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
	
	
//		Decreasing Triangle program
		
//		int size= 4;
//		
//		for(int row=0;row<size;row++) {
//			
//			for(int col=1;col<=size-row;col++)
//			System.out.print(" * ");
//			System.out.println(); 
//	}
		//      output is  
//			                                             *  *  *  * 
//			                                             *  *  * 
//			                                             *  * 
//			                                             * 

		
		
	
		
//   mix triangle Program
		
		int size =4;
		
		for(int row=0;row<=size;row++) {
			
			for(int col=0;col<=row;col++) {
				System.out.print(" * ");
			}
				System.out.println();	
				
		}
		
		for(int row=0;row<size;row++) {
			
			for(int col=1;col<=size-row;col++) {
				
				System.out.print(" * ");
			}
			System.out.println();
			
		}
		
//		Output is 
//		 * 
//		 *  * 
//		 *  *  * 
//		 *  *  *  * 
//		 *  *  *  *  * 
//		 *  *  *  * 
//		 *  *  * 
//		 *  * 
//		 * 
		
		
}
}

