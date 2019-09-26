package com.stackroute.main;
import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0); // ! clear would not reset the hour of day !
		cal.clear(Calendar.MINUTE);
		cal.clear(Calendar.SECOND);
		cal.clear(Calendar.MILLISECOND);

		// get start of this week in milliseconds
		cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
		
		cal.add(Calendar.DAY_OF_WEEK, 1);
		System.out.println("Start of this week:       " + cal.getTime());
		

		cal.add(Calendar.DAY_OF_WEEK, 6);
		System.out.println("End of this week:       " + cal.getTime()); 
		
		

	}

}
