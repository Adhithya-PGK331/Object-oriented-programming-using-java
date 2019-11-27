package Datentime;
import java.util.Calendar;
public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar calendar=Calendar.getInstance();
System.out.println("\nPresent Calendar's Year : \n"+calendar.get(Calendar.YEAR));
//getting current year in calender
System.out.println("\nPresent Calendar's Day : \n"+calendar.get(Calendar.DATE));
//getting current day number in calender
System.out.println("\nCurrent date is : \n"+calendar.getTime());
//getting current date in calender
calendar.add(Calendar.DATE, -7);
//getting date before 7 days in calender.It is past that is before so, -7
System.out.println("\n7 days ago : \n"+calendar.getTime());
calendar.add(Calendar.MONTH, 10);
//getting month after 10 months in calender.It is future so positive 10
System.out.println("\n10 months later : \n"+calendar.getTime());
calendar.add(Calendar.YEAR, 10);
//getting year after 10 years in calender.It is future so positive 10
System.out.println("\n10 years later : \n"+calendar.getTime());
	}

}
