package coreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Calender {

	public static void main(String[] args) {
		
		//Current date..current time
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		SimpleDateFormat ad = new SimpleDateFormat("MM/dd/y h:m:s:S z");
		
		System.out.println(d.toString());
		System.out.println(sdf.format(d));
		System.out.println(ad.format(d));
		
		//https://www.tutorialspoint.com/java/java_date_time.htm

	}

}
