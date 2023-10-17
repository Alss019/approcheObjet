package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4,19,23,59,30);
		Date date = cal.getTime();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String formater = format.format(date);
		System.out.println(formater);
		
		cal = Calendar.getInstance();
		date = cal.getTime();
		format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		formater = format.format(date);
		System.out.println(formater);

		format = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.FRANCE);
		formater = format.format(date);
		System.out.println(formater);
		format = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINA);
		formater = format.format(date);
		System.out.println(formater);
		format = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMAN);
		formater = format.format(date);
		System.out.println(formater);
		format = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
		formater = format.format(date);
		System.out.println(formater);

	}

}
