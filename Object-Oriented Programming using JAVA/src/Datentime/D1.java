package Datentime;
import java.time.*;
public class D1 {

public static void main(String[] args) {
		// TODO Auto-generated method stub	
	System.out.println("\nToday date : ");
	LocalDate date=LocalDate.now();//current date
	System.out.println(date);
	System.out.println("\nCurrent time : ");//current time
	LocalTime time=LocalTime.now();//<class_name><object><class_name.now()>
	System.out.println(date);
	System.out.println("\nCurrent date and time : ");
	LocalDateTime datetime=LocalDateTime.now();//current date and time
	System.out.println(datetime);
	}
}
