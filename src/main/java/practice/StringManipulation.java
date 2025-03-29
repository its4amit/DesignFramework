package practice;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "The rains will started here again";
		String str1 = "The rains will started here again";
//		
//		System.out.println(str.length());
//		System.out.println(str.charAt(10));
//		System.out.println(str.indexOf("will"));
		System.out.println(str.indexOf('e'));
		System.out.println(str.indexOf('e', str.indexOf('e') + 16));

		System.out.println(str.indexOf("hello"));// output always -1 if string is not present on existing string

//        	Comparison method

		System.out.println(str.equals(str1));

		System.out.println(str.equalsIgnoreCase(str1));

//        	trim method 

		String s = " hello world   ";

		System.out.println(s.trim());

		String date = "1-10-2009";

		System.out.println(date.replace("-", "/"));

//        	split method 

		String t = "Hello my world this is automation testing";

		String[] r = t.split(" ");

		for (int i = 0; i < r.length; i++) {

			System.out.println(r[i]);
		}
		
//		 concat method 
		
		String z= "Who cares";
      System.out.println(z.concat(" "+str1));		

	String x= "Hello";
	String y= "World";
	int a= 100;
	int b= 200;
	
	System.out.println(x+y+a+b);//  HelloWorld100200
	System.out.println(a+b+x+y);// 300HelloWorld
	System.out.println(x+y+(a+b));// HelloWorld300
	
		
		
	}

}
