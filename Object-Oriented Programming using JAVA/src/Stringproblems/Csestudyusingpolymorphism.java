package Stringproblems;
import java.util.Scanner;
public class Csestudyusingpolymorphism {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Bike\n2.Car\n3.exit");
		int ch=sc.nextInt();
		StringBuffer bike=new StringBuffer();
		StringBuffer car=new StringBuffer();
		if(ch==1) {
	      System.out.println("Enter the details of bike");
	      System.out.println("Enter the color");
	      bike.append("COLOR           : "+sc.next());
	      
	      System.out.println("Enter the maximum speed");
	      bike.append("\nMAXIMUM SPEED   : "+sc.next());
	      
			System.out.println("Enter the number of seats");
			bike.append("\nNO OF SEATS     : "+sc.next());
			
			System.out.println("Enter the number of wheels");
			bike.append("\nNO OF WHEELS    : "+sc.next());
			
			System.out.println("Enter the status of diskbreak(true/false)");
			bike.append("\nDISK BREAK      : "+sc.next());
			}
		else if(ch==2){
		      System.out.println("Enter the details of car");
		      System.out.println("Enter the color");
		      car.append("\nCOLOR           : "+sc.next());
		      
		      System.out.println("Enter the maximum speed");
		      car.append("\nMAXIMUM SPEED   : "+sc.next());
		      
				System.out.println("Enter the number of seats");
				car.append("\nNO OF SEATS     : "+sc.next());
				
				System.out.println("Enter the number of wheels");
				car.append("\nNO OF WHEELS    : "+sc.next());
				
				System.out.println("Enter the number of doors");
				car.append("\nNO OF DOORS     : "+sc.next());
				
				System.out.println("Enter the status of AC(true/false)");
				car.append("\nAC              : "+sc.next());
				
				}
		else {
			System.out.println("Exitted ");
			return;
		}
		Vehicle ve=new Vehicle();
		Bike dis1=new Bike();
		Car dis=new Car();
		String color = null;
		int speed = 0;
		int seats = 0;
		int wheel = 0;
		dis1.display(bike, color, speed, seats,wheel);
		dis.display(car, color, speed, seats,wheel);
		}
}
class Vehicle{}

		class Bike extends Vehicle{
		public void display(Object bike,String color, int speed, int seats, int wheel)
		{
			// TODO Auto-generated method stub
			System.out.println(bike);	
		}}
		class Car extends Vehicle{
		public void display(Object car,String color, int speed, int seats, int wheel)
		{
			// TODO Auto-generated method stub
			System.out.println(car);
			}
		}


