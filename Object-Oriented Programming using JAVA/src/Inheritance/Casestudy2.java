package Inheritance;

import java.util.Scanner;

public class Casestudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number of person");
	
		int p=s.nextInt();
		
		System.out.println("Enter the total number of days");
		
		int d=s.nextInt();
		
		System.out.println("Enter the tariff for a single person");
		
		double ta=s.nextInt();
		
		System.out.println("Enter the room type");
		
		String str=s.next();
		
		System.out.println("Enter the month");
		
		int m=s.nextInt();
		
		Case c1=new Case();
		
		Case1 c11=new Case1();
		
		double r=c1.peak(m);
		
		c11.roombooking(p, d,r,ta, m);}


}



class Booking1
{
	Scanner s=new Scanner(System.in);
	double di=0;double tot=0,tt=0;
	double peak(int m)
	{
		if(m==1||m==2||m==3||m==7||m==8||m==8||m==9||m==10)
		{
			System.out.println("Enter the discount");
			 di=s.nextDouble();
		}
		else
		 di = 0;
		return di;
	}
	void roombooking(int p,int d,double r,double ta,int m) {
		
		if(r!=0) {
		tot=(p*d*ta);
		tt=tot-(tot*(r/100));}
		else {
			System.out.println("Enter peak charge");
			int a=s.nextInt();
			tt=p*d*ta*a;}
		System.out.printf("Total Tariff :    %.1f",tt);
	}
}
class Case extends Booking1{
}
class Case1 extends Booking1{
}

	
	
