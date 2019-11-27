package Polymorphism;

import java.util.Scanner;

public class Casestudy1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1.CAR\n2.BIKE\n");
		int n=s.nextInt();
		Bike bi=new Bike();
		Car ca=new Car();
		String flag;
		String flag1;
		if(n==1)
			System.out.println("Enter details of the car");
		else if(n==2)
			System.out.println("Enter details of the bike");
		else {
			
			System.out.println("Invalid option");
		   System. exit(0);}
		
		System.out.println("Enter the color");
		String color=s.next();
		System.out.println("Enter the maximum speed");
		int speed=s.nextInt();
		System.out.println("Enter the number of seats");
		int seats=s.nextInt();
		System.out.println("Enter the number of wheels");
		int wheel=s.nextInt();
		if(n==2)
		{
			System.out.println("Enter the status of diskbreak(yes/no)");
			flag=s.next();
			bi.display(color,speed,seats,wheel,flag);
		}
		else {
			System.out.println("Enter the number of doors");
			int door=s.nextInt();
			System.out.println("Enter the status of AC(yes/no)");
			flag1=s.next();
			ca.display(color,speed,seats,wheel,door,flag1);

	}}

}
class Vehicle{
	
}
class Bike extends Vehicle {

	public void display(String color, int speed, int seats, int wheel, String flag) {
		// TODO Auto-generated method stub
		System.out.println("Bike details");
		System.out.printf("color=%s\n",color);
		System.out.printf("Maximum Speed=%d\n",speed);
		System.out.printf("Number of Seats=%d\n",seats);
		System.out.printf("Number of wheels=%d\n",wheel);
		if(flag.contentEquals("yes")==true) {
			System.out.printf("Disk break:true");}
			else {
				System.out.printf("Disk break:false");}	
	}
	
}
class Car extends Vehicle{

	public void display(String color, int speed, int seats, int wheel,int door, String flag1) {
		// TODO Auto-generated method stub
		System.out.println("Car details");
		System.out.printf("color=%s\n",color);
		System.out.printf("Maximum Speed=%d\n",speed);
		System.out.printf("Number of Seats=%d\n",seats);
		System.out.printf("Number of wheels=%d\n",wheel);
		System.out.printf("Number of Doors=%d\n",door);
		if(flag1.contentEquals("yes")==true) {
		System.out.printf("AC:true");}
		else {
			System.out.printf("AC:false");}	
		}
}
	