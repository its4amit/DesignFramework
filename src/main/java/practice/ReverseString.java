package practice;

public class ReverseString {

	public static void main(String[] args) {

//		reverse a string
//		Difference b/w string and StringBuffer------> String is a immutable object so we can not direct reverse the string 
//		But String Buffer is a mutable ...so we have direct reverse method through String buffer

		String s = "Hello World";

		int len = s.length();
		String rev = "";

//		reverse a string using for loop
		for (int i = len - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}

		System.out.println(rev);
		
//		reverse a string using StringBuffer class
		
		StringBuffer t= new StringBuffer(s);
		System.out.println(t.reverse());
		
	}
}
