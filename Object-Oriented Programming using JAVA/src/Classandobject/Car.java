package Classandobject;
import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name ");
		String str=s.next();
		Carnew c=new Carnew(str);
		Carnew.a();
		Carnew.b();
		Carnew.m();
		Carnew.display(str);
	}
}

class Carnew{
	String str;
	public Carnew(String str) {
		str=str;
	}
	public static void a() {
		// TODO Auto-generated method stub
		System.out.println("Welcome Car a");
		System.out.println("Welcome Car model 123647");

	}
	public static void b() {
		// TODO Auto-generated method stub
		System.out.println("Welcome Car b");
		System.out.println("Welcome Car model 34675");

		
	}
	public static void m() {
		// TODO Auto-generated method stub
		System.out.println("Welcome Car m");
		System.out.println("Welcome Car model 12345");

		
	}
	public static void display(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
		
		
	}
}