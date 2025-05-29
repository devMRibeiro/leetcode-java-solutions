package com.github.devmribeiro.solutions;

import java.util.HashMap;


/**
 * 1941. Check if All Characters Have Equal Number of Occurrences
 * 
 * Given a string s, return true if s is a good string, or false otherwise.
 * A string s is good if all the characters that appear in s have the same number of occurrences
 * (i.e., the same frequency).
 * 
 * Example 1:
 * Input: s = "abacbc"
 * Output: true
 * Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
 */
public class CharacterFrequencyChecker {

	public static boolean areOccurrencesEqual(String s) {

		HashMap<Character, Integer> hmOcurrences = new HashMap<Character, Integer>(); 

		for (char c : s.toCharArray())
				hmOcurrences.put(c, hmOcurrences.getOrDefault(c, 0) + 1);

		Integer firstValue = hmOcurrences.values().iterator().next();

		for (Integer value : hmOcurrences.values())
			if (!firstValue.equals(value))
				return false;

		return true;
  }
}