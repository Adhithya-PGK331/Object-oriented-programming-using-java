package Booking;
import java.util.Scanner;
public class Custbooking {
	String name;String address;String number;
	String email;String prooftype;String proofid;
	String a;String ac;String cot;String cable;
	int date1;int date2;String wifi;
	String laundry;double total;int date;
	String pr;int i=1;String re;String n;
	static int booked[]=new int[25];
	String[] c=new String[25];String[]e=new String[25];
	public void register() {
		Scanner s=new Scanner(System.in);
	do {
		System.out.println("====================================");
		System.out.println("***Registration***");//reistration phase:all details to enter.
		System.out.println("====================================");
		System.out.println("Enter your name :");
		c[i]=s.next();
		System.out.println("Enter your address :");
		e[i]=s.next();
		System.out.println("Enter your Contact number :");
		number=s.next();
		System.out.println("Enter your Email Id :");
		email=s.next();
		System.out.println("Enter proof Type :");
		prooftype=s.next();
		System.out.println("Enter your proof ID :");
		proofid=s.next();
		booked[i]=i;
		System.out.println("***Thank you for registering...!!!*** Your id is "+i);
		i++;
		System.out.println("Do you want to continue book (y/n)?");
		n=s.next();
		if(n.equals("yes")==true)
		{book();
			System.out.println("Do you want to continue registration (yes/no)?");
			re=s.next();
		if(re.equals("yes")==true)
			{
			register();//registering new customers
			}
		else {
			view();//displaying the registered cutomers
			}
		}
	else
	{
	System.out.println("Do you want to continue registration (yes/no)?");
	re=s.next();
	} }
	while(n.equals("yes")==true);
	}
	public void view() {
		Scanner s=new Scanner(System.in);
		System.out.println("\n View all bookings:");
		System.out.println("\n Enter the start date:");
		date1=s.nextInt();
		System.out.println("\n Enter the end  date:");
		date2=s.nextInt();
		System.out.printf("The booking made from %d to %d are",date1,date2);
		System.out.println("====================================");
//printing booking information
		System.out.println("Your details are as follows");
		System.out.println("====================================");
		System.out.println("Room no\tCustomer Name");
		for(int m=1;m<i;m++)
		{
			System.out.println(booked[m]+"\t\t"+c[m]);
		}
		System.out.println("====================================");
	}
	public void book() {
		String ac;String wifi;String cot;String cable;
		String laundry;double total;int b,c,d,e,f;
		int date;String pr;int i=1;
		Scanner s=new Scanner(System.in);
		System.out.println("booking");
		System.out.println("ac(an/nac)");
		ac=s.nextLine();
		if(ac.contentEquals("AC")==true) {
			b=1500;}//need ac
		else {b=700;}
		System.out.println("Cot:Single/Double:(s/d)");
		cot=s.next();//need single cot
		if(cot.contentEquals("s")==true) {c=50;}
		else {c=100;}
		System.out.println("Cable(c/nc)");
		cable=s.next();//need cable
		if(cable.contentEquals("c")==true) {d=50;}
		else {d=0;}
		System.out.println("Wifi(w/nw)");
		wifi=s.next();//need wifi
		if(wifi.contentEquals("w")==true) {e=200;}
		else {e=0;}
		System.out.println("Laundry(l/nl)");
		laundry=s.next();//laundry needed
		if(laundry.contentEquals("l")==true) {f=100;}
		else {f=0;}
		total=b+c+d+e+f;//total cost
		System.out.println("The total charge is Rs."+total);
		System.out.println("The services chosen are");
		System.out.println(ac);
		System.out.println(cot);
		System.out.println(cable);
		System.out.println(wifi);
		System.out.println(laundry);
		System.out.println("Enter the date for booking");
		date=s.nextInt();//to perform booking for a particular date
		System.out.println("Do you want to proceed");
		pr=s.next();
		if (pr.equals("yes")==true)
		{
			booked[i]=1;
			
		System.out.println("Thank you your room number is "+i);
		i++;}
   }
	}
	
		

	



