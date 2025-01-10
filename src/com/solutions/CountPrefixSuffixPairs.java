package com.solutions;


/**
 * 3042. Count Prefix and Suffix Pairs I
 * 
 * Return an integer denoting the number of index pairs (i, j) such that i < j,
 * and isPrefixAndSuffix(words[i], words[j]) is true.
 * 
 * Example 1:
 * Input: words = ["a","aba","ababa","aa"]
 * Output: 4
 * 
 * Explanation: In this example, the counted index pairs are:
 * i = 0 and j = 1 because isPrefixAndSuffix("a", "aba") is true.
 * i = 0 and j = 2 because isPrefixAndSuffix("a", "ababa") is true.
 * i = 0 and j = 3 because isPrefixAndSuffix("a", "aa") is true.
 * i = 1 and j = 2 because isPrefixAndSuffix("aba", "ababa") is true.
 * Therefore, the answer is 4.
 * 
 */
public class CountPrefixSuffixPairs {

	public static int countPrefixSuffixPairs(String[] words) {

		int wLen = words.length;
		int qt = 0;

		for (int i = 0; i < wLen; i++) {
			for (int j = i + 1; j < wLen; j++) {
				if (isPrefixAndSuffix(words[i], words[j]))
					qt += 1;
			}
		}
		return qt;
  }

	private static boolean isPrefixAndSuffix(String str1, String str2) {
		return str1.length() <= str2.length() && str2.startsWith(str1) && str2.endsWith(str1);
	}
}