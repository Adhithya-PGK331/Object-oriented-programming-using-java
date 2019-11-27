package Datentime;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
public class Casestudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);String pr="";int i=112;
		do {
		System.out.println("================");		
		System.out.println("**REGISTRATION**");
		System.out.println("================");	
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the address");
		String address=s.next();
		System.out.println("Enter the no of rooms");
		int room=s.nextInt();
		System.out.println("Enter the no of person");
		int person=s.nextInt();
		System.out.println("AC/Non-AC");
		String ac=s.next();
	    
		System.out.println("Booking date");// format 2017-11-20
		String first = s.next();
		System.out.println("Checkout date");// format 2017-11-25
		String second = s.next();
	    LocalDate ds = LocalDate.parse(first);//finding difference between date 1 and date 2
	    LocalDate de = LocalDate.parse(second);
	    long op = ChronoUnit.DAYS.between(ds,de);//25-20=5
	    
		long total=0;int p=(person%2);
			if(person%2!=0) {//if no of persons are 9
				if(ac.equals("AC")==true) {//tot=5*(8*500 + 8*150 + 1*150 + 1*250)=28000
					total=(op*(((person-p)*500)+((person-p)*150)+(p*150)+(p*250)));
									}
				else {//if not ac tot=5*(8*500 + 1*250)=21250
				total=(op*(((person-p)*500)+(p*250)));}
			}
			else {
				//if no of person is  even that is 8
				if(ac.equals("AC")==true) {//tot=5*(8*500 + 8*150)=26000
					total=(op*((person*500)+(person*150)));
				}
				else {//if not ac tot=5*(8*500)=20000
					total=(op*((person*500)));
				}
			}
		
		System.out.println("Registration details : ");
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("No of rooms : "+room);
		System.out.println("No of guest : "+person);
		System.out.println("AC : "+ac);
		System.out.println("No of days : "+op);
		System.out.println("Amount : "+total);
		System.out.println("Do you want to continue the registration ?(y/n)");
		pr=s.next();
		}while(pr.equals("n")==true);
		System.out.printf("Thank you for registering your id is %d",i);
		i++;
		}
	
	}