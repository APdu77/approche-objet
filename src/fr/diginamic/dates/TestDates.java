package fr.diginamic.dates;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date1 = new Date() ;//default system time
		
		System.out.println(date1);
		
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		String chaine1 = formateur.format(date1);
				
		System.out.println(chaine1);	
		
		Date date2 = new Date(116, 4, 19, 23, 59, 30) ;
		System.out.println(date2);
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String chaine2 = format2.format(date2);	
		System.out.println(chaine2);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		String chaine3 = format2.format(cal.getTime());	
		System.out.println(chaine3);
		
	}

}
