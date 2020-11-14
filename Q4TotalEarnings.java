package com.AakashPatel.JavaFDMAssessment.com.AakashPatel.JavaFDMAssessment;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Q4TotalEarnings {
	/*
	 *  •	For an hourly rate of 10.0, and a HashMap containing “Wednesday”:7.5, “Saturday”:4.0, “Sunday”:5.0. The method would return 235.0 (Wednesday 10 x 7.5 = 75.0, Saturday 15 x 4.0 = 60, Sunday 20 x 5.0 = 100)
		•	For an hourly rate of 12.50, and a HashMap containing “Monday”:9.5, “Tuesday”:6.25. The method would return 196.87 (Monday 12.50 x 9.5 = 118.75, Tuesday 12.50 x 6.25 =  78.12)

	 */

	public static double totalEarning(double hourlyRate, HashMap<String, Double> hoursPerDay) {
		double total = 0;
		for (Map.Entry<String, Double> entry : hoursPerDay.entrySet()) {
			
		    String day = entry.getKey();
		    Double hoursInDay = entry.getValue();
		    
		    if (day.equals("Saturday")  ){
		    	
		    	 total += hoursInDay*hourlyRate*1.5;
		    	
		    } else if(day.equals("Sunday")) {
		    	total += hoursInDay*hourlyRate*2;
		    
		    	
		    } else {
		    	total += hourlyRate * hoursInDay;
		    }
		    
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		
		HashMap<String,Double> map1 = new HashMap<String, Double>();
		map1.put("Wednesday", 7.5);
		map1.put("Saturday", 4.0);
		map1.put("Sunday", 5.0);
		
		
		System.out.printf("%.2f",totalEarning(10,map1));
		
		HashMap<String,Double> map2 = new HashMap<String, Double>();
		map2.put("Monday", 9.5);
		map2.put("Tuesday", 6.25);
		
		System.out.println("\n");
		System.out.printf("%.2f", totalEarning(12.50,map2));
		
		

	}

}
