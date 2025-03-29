package practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProgram {

	public static void main(String[] args) {
		
		
		
		getCharCount("selenium");
		

//		 Find the duplicate characters and its count 

//		String s = "testautomationamitcypress";
//
//		char[] a = s.toCharArray();
//
//		HashMap<Character, Integer> map = new HashMap<>();
//
//		for (char test : a) {
//
//			if (map.containsKey(test)) {
//
//				map.put(test, map.get(test) + 1);
//
//			} else {
//				map.put(test, 1);
//			}
//		}
//
////		System.out.println(map);
//
//		Set<Entry<Character, Integer>> entry = map.entrySet();
//
//		for (Entry<Character, Integer> t : entry) {
//
//			if (t.getValue() >= 2) {
//
//				System.out.println(t.getKey() + " " + t.getValue());
//			}
//		}
	}
	
	
	public static void getCharCount(String name) {
		
		HashMap<Character, Integer> charmap= new HashMap();
	char []	strArray = name.toCharArray();

	for(char c: strArray) {
		if(charmap.containsKey(c)) {
			charmap.put(c, charmap.get(c) +1);
		}
		else {
			charmap.put(c, 1);
			
		}
		
	}
		System.out.println(name + ":" + charmap);
	
	}

}
