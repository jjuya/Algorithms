package Warmup._10TimeConversion;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static String timeConversion(String s) {

		String result = null;

		String s_form = null;
		String ampm = s.substring(s.length() - 2, s.length());

		if(ampm.equals("AM")) {
			s_form = s.replace("AM", "오전");
		} else if(ampm.equals("PM")) {
			s_form = s.replace("PM", "오후");
		}

		SimpleDateFormat transFormat;
		Date time;

		try {
			transFormat = new SimpleDateFormat("hh:mm:ssaa");
			time = transFormat.parse(s_form);

			transFormat = new SimpleDateFormat("HH:mm:ss");
			result = transFormat.format(time);

		} catch (ParseException e) {

			e.printStackTrace();
		}


		return result;
	}

/*
	// submit code
	static String timeConversion(String s) {

		String result = null;

		SimpleDateFormat transFormat;
		Date time;

		try {
			transFormat = new SimpleDateFormat("hh:mm:ssaa");
			time = transFormat.parse(s);

			transFormat = new SimpleDateFormat("HH:mm:ss");
			result = transFormat.format(time);

		} catch (ParseException e) {

			e.printStackTrace();
		}

		return result;
	}
*/


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();
		String result = timeConversion(s);

		System.out.println(result);
	} //end main
} //end class