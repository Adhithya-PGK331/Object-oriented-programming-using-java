package Datentime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class D2_format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime datet=LocalDateTime.now();//<class_name><object><class_name.now()>
		System.out.println("\nBefore formatting : \n"+datet);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("E, MM : dd : YYYY  hh : mm : ss");
		String formatDate=datet.format(format);
		System.out.println("\nAfter formatting : \n"+formatDate);//after formatting
		
	}
}