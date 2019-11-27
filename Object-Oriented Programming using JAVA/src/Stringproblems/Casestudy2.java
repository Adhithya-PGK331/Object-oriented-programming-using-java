package Stringproblems;

import java.util.Scanner;

public class Casestudy2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.BIKE\n2.CAR\n");
		int ch=sc.nextInt();
		StringBuffer bike=new StringBuffer();
		StringBuffer car=new StringBuffer();
		if(ch==1) {
		
	      System.out.println("Enter the details of bike");
	      System.out.println("Enter the color");
	      bike.append("COLOR          : "+sc.next());
	      System.out.println("Enter the maximum speed");
	      bike.append("\nMAXIMUM SPEED       : "+sc.next());
			System.out.println("Enter the number of seats");
			bike.append("\nNO OF SEATS       : "+sc.next());
			System.out.println("Enter the number of wheels");
			bike.append("\nNO OF WHEELS     : "+sc.next());
			System.out.println("Enter the status of diskbreak(true/false)");
			bike.append("\nDISK BREAK    : "+sc.next());
			System.out.println(bike);
			}
			
		else {
			
		      System.out.println("Enter the details of car");
		      System.out.println("Enter the color");
		      car.append("\nCOLOR          : "+sc.next());
		      System.out.println("Enter the maximum speed");
		      car.append("\nMAXIMUM SPEED       : "+sc.next());
				System.out.println("Enter the number of seats");
				car.append("\nNO OF SEATS       : "+sc.next());
				System.out.println("Enter the number of wheels");
				car.append("\nNO OF WHEELS     : "+sc.next());
				System.out.println("Enter the number of doors");
				car.append("\nNO OF DOORS       : "+sc.next());
				System.out.println("Enter the status of AC(true/false)");
				car.append("\nAC    : "+sc.next());
				
				System.out.println(car);}
			
		    
	}
}