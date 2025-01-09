package com.solutions;

import java.util.ArrayList;

/**
 * Given an array of string words, return all strings in words that is a substring of another word.
 * You can return the answer in any order.
 * 
 * Example 1:
 * Input: words = ["mass","as","hero","superhero"]
 * Output: ["as","hero"]
 * Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
 * ["hero","as"] is also a valid answer.
 *	
 * Example 2:
 * Input: words = ["leetcode","et","code"]
 * Output: ["et","code"]
 * Explanation: "et", "code" are substring of "leetcode".
 *		
 * Example 3:
 * Input: words = ["blue","green","bu"]
 * Output: []
 * Explanation: No string of words is substring of another string.
 */
public class StringMatchingInArray {

	public static ArrayList<String> stringMatching(String[] words) {
  	
  	ArrayList<String> answer = new ArrayList<String>();
    int n = words.length;
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            if (i != j && words[j].contains(words[i])) {
            	answer.add(words[i]);
                break;
            }
        }
    }
    return answer;
  }
}