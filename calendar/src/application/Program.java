package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args)throws ParseException {

		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date d = Date.from(Instant.parse("2023-08-01T14:08:00Z"));

		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();

		cal.setTime(d);

	}
}
