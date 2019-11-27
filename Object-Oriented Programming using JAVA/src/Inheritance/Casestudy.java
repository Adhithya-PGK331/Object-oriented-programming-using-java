package Inheritance;

import java.util.Scanner;

public class Casestudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of persons");
int n=s.nextInt();
System.out.println("Enter the number of days");
int d=s.nextInt();
System.out.println("Enter the tariff per day");
int t=s.nextInt();
System.out.println("Enter the room type");
String str=s.next();
Seasonbook st=new Seasonbook();
//st.book(n,d,t);
double total=st.book(n,d,t);
System.out.println("Total Tariff:"+total);

	}
}
class Booking{//parent class only for calculation.
	public double book(	int n,int d,double t) {
		double set=d*t*n;
		return set;

	}

}
class Seasonbook extends Booking{

}
