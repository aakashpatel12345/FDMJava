package com.AakashPatel.JavaFDMAssessment.com.AakashPatel.JavaFDMAssessment;

import java.util.HashSet;

public class JohnQ4SmallestMissingPositive {

	// • If the argument is [6,2,6,4,1,3] the method should return 5
	// • If the argument is [2,3,1] the method should return 4
	// • If the argument is [-3,-1,-2] the method should return 1

	public int smallestMissingPositiveNumber(int[] numbers) {

		int numbersmax = 0;
		HashSet<Integer> set1 = new HashSet<Integer>();

		for (int num : numbers) {

			if (num > numbersmax) {
				numbersmax = num;
			}

			if (num > 0) {
				set1.add(num);
			}
		}

		for (int smallestPositiveNumber = 1; smallestPositiveNumber <= numbersmax + 1; smallestPositiveNumber++) {
			if (!set1.contains(smallestPositiveNumber)) {
				return smallestPositiveNumber;
			}
		}
		return 0;

	}

	public static void main(String[] args) {
		JohnQ4SmallestMissingPositive q4 = new JohnQ4SmallestMissingPositive();

		int[] ex1 = { 6, 2, 6, 4, 1, 3 };
		System.out.println(q4.smallestMissingPositiveNumber(ex1));

		int[] ex2 = { 2, 3, 1 };
		System.out.println(q4.smallestMissingPositiveNumber(ex2));

		int[] ex3 = { -3, -1, -2 };
		System.out.println(q4.smallestMissingPositiveNumber(ex3));

	}

}
