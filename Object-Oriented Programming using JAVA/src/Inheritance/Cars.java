package Inheritance;

import java.util.Scanner;

public class Cars {

	public static void main(String[] args) {//main method should be completed first
Scanner s=new Scanner(System.in);
car3 c=new car3();//sub class
c.name();//First main class
c.name1();
	}
}
class car3 extends car4{
	public void name() {
		System.out.println("Welcome");
	}
}
class car4{
	void name1() {
		System.out.println("HELLO");
	}
}