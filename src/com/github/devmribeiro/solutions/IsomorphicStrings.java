package com.github.devmribeiro.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 205. Isomorphic Strings
 * 
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings s and t are isomorphic if the characters in s can be replaced to
 * get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character, but a character may map to itself.
 */
public class IsomorphicStrings {

	public static boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length())
			return false;

		Map<Character, Integer> mapS = new HashMap<Character, Integer>();
		Map<Character, Integer> mapT = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			if (!mapS.containsKey(s.charAt(i)))
				mapS.put(s.charAt(i), i);

			if (!mapT.containsKey(t.charAt(i)))
				mapT.put(t.charAt(i), i);

			if (!mapS.get(s.charAt(i)).equals(mapT.get(t.charAt(i))))
				return false;
		}

		return true;
	}
}