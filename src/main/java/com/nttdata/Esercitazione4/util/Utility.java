package com.nttdata.Esercitazione4.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Utility {

	public static long calculateAge(Date dateOfBirth) {
		Calendar calendar = new GregorianCalendar();
		Date age = new Date(new Date().getTime() - new Date().getTime());
		calendar.setTime(age);
		return calendar.get(Calendar.YEAR);
	}
}
