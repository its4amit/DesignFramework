package practice;

public class RemoveJunkAndSpecialChar {

	public static void main(String[] args) {

//		Remove the Special characters and spaces

		String s = "$#%$##^#$#& selenium%$ java^%&^% Automation";

//		By using Regular Expression= [^a-zA-Z0-9]

		s = s.replaceAll("[^a-z A-Z 0-9]", "");
		System.out.println(s);

	}

}
