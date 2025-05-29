package com.github.devmribeiro.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 387. First Unique Character in a String
 * 
 * Given a string s, find the first non-repeating character in it and return its
 * index. If it does not exist, return -1.
 * 
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 * 
 * Explanation:
 * The character 'l' at index 0 is the first character that does not occur at
 * any other index.
 * 
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 * 
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 */
public class FirstUniqueCharacterString {
	public int firstUniqChar(String s) {
		Map<Character, Integer> hmFreq = new HashMap<>();
        
        // count character freq
        for (char c : s.toCharArray())
            hmFreq.put(c, hmFreq.getOrDefault(c, 0) + 1);
        
        // find the first unique character
        for (int i = 0; i < s.length(); ++i)
            if (hmFreq.get(s.charAt(i)) == 1)
                return i;

        return -1;
	}
}