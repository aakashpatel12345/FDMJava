package com.AakashPatel.JavaFDMAssessment.com.AakashPatel.JavaFDMAssessment;

import java.util.Arrays;
import java.util.Collections;

public class JohnQ2RearrangeDigits {

	// • If the argument is 123, the method should return 321
	// • If the argument is 5867, the method should return 8765
	// • If the argument is 50703, the method should return 75300

	public int rearrangeDigitsToMakeHighestNumber(int number) {
		String num = String.valueOf(number);

		String[] digits = num.split("(?<=.)");

		Arrays.sort(digits, Collections.reverseOrder());

		int highestNum = Integer.parseInt(String.join("", digits));

		return highestNum;
	}

	public static void main(String[] args) {

		JohnQ2RearrangeDigits q2 = new JohnQ2RearrangeDigits();

		System.out.println(q2.rearrangeDigitsToMakeHighestNumber(123));

		System.out.println(q2.rearrangeDigitsToMakeHighestNumber(5867));

		System.out.println(q2.rearrangeDigitsToMakeHighestNumber(50703));

	}

}
