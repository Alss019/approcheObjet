package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String formater = format.format(date);
		System.out.println(date);
		System.out.println(formater);
		
		date = new Date(116, 4, 19, 23, 59, 30);
		format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		formater = format.format(date);
		System.out.println(formater);
		
		date = new Date();
		System.out.println(format.format(date));

	}

}
