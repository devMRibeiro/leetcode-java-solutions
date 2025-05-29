package com.github.devmribeiro.solutions;


/**
 * You are given an array of strings words and a string pref.
 * Return the number of strings in words that contain pref as a prefix.
 *  
 * Example 1:
 * Input: words = ["pay","attention","practice","attend"], pref = "at"
 * Output: 2
 * Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
 * 
 * Example 2:
 * Input: words = ["leetcode","win","loops","success"], pref = "code"
 * Output: 0
 * Explanation: There are no strings that contain "code" as a prefix.
 *
 * @return the number of strings in words that contain pref as a prefix.
 */
public class CountingWordsWithAPrefix {

	public int prefixCount(String[] words, String pref) {

		int ans = 0;

		for (int i = 0; i < words.length; i++)
			if (words[i].startsWith(pref))
				ans += 1;

		return ans;
  }
}