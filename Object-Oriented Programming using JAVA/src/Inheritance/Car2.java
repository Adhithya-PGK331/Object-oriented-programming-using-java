package Inheritance;

import java.util.Scanner;

public class Car2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the car speed:");
int a=s.nextInt();
Toyota d=new Toyota();
d.name();
d.about();
d.speed(a);
	}
}
class carb{
	public void about() {
		System.out.println("2019 model");// TODO Auto-generated method stub
		
	}
}
class Toyota extends carb{

	public void name() {
		System.out.println("bmw");// TODO Auto-generated method stub
		
	}

	public void speed(int a) {
		// TODO Auto-generated method stub
		System.out.println("speed:"+a);
	}

	
	
}