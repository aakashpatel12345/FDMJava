package com.AakashPatel.JavaFDMAssessment.com.AakashPatel.JavaFDMAssessment;

public class Q2AttendanceScore {
	
	/*
	    •	For an array containing values 0, 0, 0, 1, 1, 1, 0, 0, the method would return a score of 3. One absence of 3 days = 3 x 1^2.
		•	For an array containing values 0, 1, 0, 1, 0, 1, 0 the method would return a score of 27. Three absences totalling 3 days = 3 x 3^2. 
		•	For an array containing values 0, 1, 1, 0, 0, 1, 1, 1, 0 the method would return a score of 20. Two absences totalling 5 days = 5 x 2^2.

	 */

	public static int attendanceScore(int[] attendanceHistory) {
		
		int totalDaysAbsent = 0;
		int numOfNonConsec = 0;
		
		
		for (int day: attendanceHistory) {
			if(day == 1) {
				totalDaysAbsent += 1;
			}
		}
		
		for (int i = 0; i < attendanceHistory.length -1 ; i++ ) {
			if (attendanceHistory[i] == 1) {
				if (attendanceHistory[i] != attendanceHistory[i + 1])  
					numOfNonConsec += 1; 	
			}
			 
		}
		
		int result = totalDaysAbsent * (numOfNonConsec*numOfNonConsec);
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] ex1 = {0, 0, 0, 1, 1, 1, 0, 0};
		System.out.println(attendanceScore(ex1));
		
		int[] ex2 = {0, 1, 0, 1, 0, 1, 0};
		System.out.println(attendanceScore(ex2));
		
		int[] ex3 = {0, 1, 1, 0, 0, 1, 1, 1, 0};
		System.out.println(attendanceScore(ex3));
		
		
	}

}
