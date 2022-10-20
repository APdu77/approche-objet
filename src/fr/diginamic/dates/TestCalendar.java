package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.set( 2016, 4, 19, 23, 59, 30);
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		String chaine1 = format1.format(cal.getTime());	
		System.out.println(chaine1);
		
		Calendar cal2 = Calendar.getInstance();
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date2 = cal2.getTime();//facultatif
		String chaine2 = format2.format(date2);	//induit par la ligne -1
		System.out.println(chaine2);
		
		SimpleDateFormat format3 = new SimpleDateFormat("EEEE dd MMMM yyyy @ HH:mm:ss");
		String chaine3 = format3.format(cal2.getTime());	
		System.out.println(chaine3);
		
		SimpleDateFormat formatRu = new SimpleDateFormat("EEEE dd MMMM yyyy @ HH:mm:ss",  new Locale("ru","RU"));
		String chaineRu = formatRu.format(cal2.getTime());	
		System.out.println(chaineRu);
		
		SimpleDateFormat formatDe = new SimpleDateFormat("EEEE dd MMMM yyyy @ HH:mm:ss", Locale.GERMANY);
		String chaineDe = formatDe.format(cal2.getTime());	
		System.out.println(chaineDe);
		
		SimpleDateFormat formatChina = new SimpleDateFormat("EEEE dd MMMM yyyy @ HH:mm:ss", Locale.CHINESE);
		String chaineChina = formatChina.format(cal2.getTime());	
		System.out.println(chaineChina);
		
	}

}
