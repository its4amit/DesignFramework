package practice;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int s = 1234567;
		int rev=0;
		
		while(s!=0) {
			
			rev= rev*10 + s%10;
			s= s/10;
			
		}
		System.out.println(rev);
	}
}
