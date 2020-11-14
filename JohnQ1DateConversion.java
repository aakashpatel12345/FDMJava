package com.AakashPatel.JavaFDMAssessment.com.AakashPatel.JavaFDMAssessment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Convert “9 April 2020” to a String in the following format: “9/4/20”.

public class JohnQ1DateConversion {

	public String DateConversion(String date) throws ParseException {

		String OLD_FORMAT = "dd MMMM yyyy";
		String NEW_FORMAT = "d/M/yy";

		String newDateString;

		SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
		Date d = sdf.parse(date);
		sdf.applyPattern(NEW_FORMAT);
		newDateString = sdf.format(d);
		return newDateString;

	}

	public static void main(String[] args) throws ParseException {
		JohnQ1DateConversion q1 = new JohnQ1DateConversion();

		System.out.println(q1.DateConversion("9 April 2020"));

	}

}
