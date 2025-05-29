package com.github.devmribeiro.solutions;

public class MissingNumber {
	public static int missingNumber(int[] nums) {
		
		int n = nums.length;
    int calc = (n * (n + 1)) / 2;

    for (int num : nums)
        calc -= num;
    
    if (calc != 0)
        return calc;

    return 0;
	}
}