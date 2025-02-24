package com.solutions;

public class Factorial {
	public static long calculateFactorial(int num) {

		if (num < 0)
			throw new IllegalArgumentException("The input must be non-negative");

		long result = 1;
		for (int i = num; i > 1; i--)
			result *= i;

		return result;
	}
}