package practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProgram {

	public static void main(String[] args) {

//		 Find the duplicate characters and its count 

		String s = "testautomationamitcypress";

		char[] a = s.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();

		for (char test : a) {

			if (map.containsKey(test)) {

				map.put(test, map.get(test) + 1);

			} else {
				map.put(test, 1);
			}
		}

//		System.out.println(map);

		Set<Entry<Character, Integer>> entry = map.entrySet();

		for (Entry<Character, Integer> t : entry) {

			if (t.getValue() >= 2) {

				System.out.println(t.getKey() + " " + t.getValue());
			}
		}
	}

}
