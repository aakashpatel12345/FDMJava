package com.AakashPatel.JavaFDMAssessment.com.AakashPatel.JavaFDMAssessment;

import java.util.Collections;
import java.util.HashMap;

public class JohnQ3MostCommonDigitOccurance {

	// • if the argument is 12341, the method should return 2 (1 is the most common
	// number and it occurs twice)
	// • if the argument is 2144454040, the method should return 5 (4 is the most
	// common number and it occurs 5 times)

	public int occurrencesOfMostCommonDigit(int number) {
		String num = String.valueOf(number);
		String[] digits = num.split("(?<=.)");

		HashMap<Integer, Integer> mostCommonDigit = new HashMap<Integer, Integer>();

		for (String digit : digits) {

			int num1 = Integer.parseInt(digit);

			mostCommonDigit.putIfAbsent(num1, 0);
			mostCommonDigit.put(num1, mostCommonDigit.get(num1) + 1);
		}
		int maxValueInMap = (Collections.max(mostCommonDigit.values()));
		/*
		 * Integer answer = 0; for (Entry<Integer, Integer> entry :
		 * mostCommonDigit.entrySet()) { if (entry.getValue()==maxValueInMap) { answer =
		 * entry.getKey(); } }
		 * 
		 * int finalAnswer = answer;
		 */

		return maxValueInMap;
	}

	public static void main(String[] args) {
		JohnQ3MostCommonDigitOccurance q3 = new JohnQ3MostCommonDigitOccurance();

		System.out.println(q3.occurrencesOfMostCommonDigit(12341));

		System.out.println(q3.occurrencesOfMostCommonDigit(2144454040));

	}

}
