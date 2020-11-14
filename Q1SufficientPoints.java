package com.AakashPatel.JavaFDMAssessment.com.AakashPatel.JavaFDMAssessment;

import java.util.HashMap;

public class Q1SufficientPoints {
	
	/*
	•	For an array of grades containing ‘A’, ‘B’ and ‘C’ and a points requirement of 100 the method would return true as the candidate would have 120 points.
	•	For an array of grades containing ‘A’, ‘B’ and ‘C’ and a points requirement of 130 the method would return false as the candidate would have 120 points.
	•	For an array of grades containing ‘E’, ‘E’ and ‘E’ and a points requirement of 100 the method would return false as the candidate would have 30 points.
	•	For an array of grades containing ‘E’, ‘E’ and ‘E’ and a points requirement of 30 the method would return true as the candidate would have 30 points.
	 */

	public static boolean sufficientPoints (char[] aLevelResults, int entryRequirement) {

		int totalScore = 0;
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		
		map1.put('A', 50);
		map1.put('B', 40);
		map1.put('C', 30);
		map1.put('D', 20);
		map1.put('E', 10);
		
		for (char grade: aLevelResults) {
			totalScore += map1.get(grade);
		}
		
		if (totalScore >= entryRequirement) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		char[] ex1 = {'A', 'B', 'C'};
		System.out.println(sufficientPoints(ex1, 120));
		
		char[] ex2 = {'A', 'B', 'C'};
		System.out.println(sufficientPoints(ex2, 130));
		
		char[] ex3 = {'E', 'E', 'E'};
		System.out.println(sufficientPoints(ex3, 100));
		
		char[] ex4 = {'E', 'E', 'E'};
		System.out.println(sufficientPoints(ex4, 30));
		

	}

}
