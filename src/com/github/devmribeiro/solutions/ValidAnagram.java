package com.github.devmribeiro.solutions;

/**
 * 242. Valid Anagram
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * 
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * 
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false 
 */
public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
    if (s.length() != t.length())
        return false;

    int[] charCount = new int[128];

    for (int i = 0; i < s.length(); i++) {
        charCount[s.charAt(i)]++;
        charCount[t.charAt(i)]--;
    }

    for (int i = 0; i < charCount.length; i++)
        if (charCount[i] != 0)
            return false;

    return true;
	}
}