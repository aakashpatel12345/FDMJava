package com.AakashPatel.JavaFDMAssessment.com.AakashPatel.JavaFDMAssessment;

public class Q3PensionCalculator {
	
	/*
 	•	For an array containing 9 values which were all 400, the method would return a pension of 0.0
	•	For an array containing 30 values which were all 400, the method would return a pension of 8000.0. 
	•	For an array containing 40 values which were all 600, the method would return a pension of 8000.0. The last 10 years and the contributions above 400 don’t increase the pension above the maximum of 8000.0
	•	For an array containing 10 values which were all above 400, the method would return a pension of 2666.66. This is 10/30 multiplied by the full amount of 8000.
	•	For an array containing 20 values which were all above 400, the method would return a pension of 5333.33. This is 20/30 x 8000.
	 */

	public static double statePensionCalculator(int[] annualContributions) {

		double entitledPension = 0;
		int numOfYearsContributed = 0;

		for (int yearContribution : annualContributions) {
			if (yearContribution >= 400) {
				numOfYearsContributed += 1;

			}

		}

		if (numOfYearsContributed < 10) {
			
			entitledPension = 0.0;
			
			return entitledPension;
			
		}	else if (numOfYearsContributed >= 10 && numOfYearsContributed < 30 ) {
			
			entitledPension = (8000.0/30.0) * numOfYearsContributed;
			
			return entitledPension;
			
		} else {
			entitledPension = 8000.0;
			
			return entitledPension;
		}
		
	

	}

	public static void main(String[] args) {

		int[] ex1 = {400,400,400,400,400,400,400,400,400};
		System.out.println(statePensionCalculator(ex1));
		
		int[] ex2 = {400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400};
		System.out.println(statePensionCalculator(ex2));

		int[] ex3 = {600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600};
		System.out.println(statePensionCalculator(ex3));
		
		int[] ex4 = {400,400,400,400,400,400,400,400,400,400};
		System.out.printf("%.2f",statePensionCalculator(ex4));
		
		int[] ex5 = {400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400,400};
		System.out.println(('\n'));
		System.out.printf("%.2f",statePensionCalculator(ex5));
	}

}
