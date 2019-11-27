package Inheritance;
import java.util.Scanner;
public class Simpleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Hotel d=new Hotel();
		d.stationary();
		d.paper();
		d.guides();
	}

}
class Shops{
	public void stationary() {
		System.out.println("Stationaries");
		System.out.println("===================================");
// TODO Auto-generated method stub
		
	}
}
class Hotel extends Shops{

	public void paper() {
		System.out.println("Paper");// TODO Auto-generated method stub
		System.out.println("Pen");
	}

	public void guides() {
		// TODO Auto-generated method stub
		System.out.println("Guides");// TODO Auto-generated method stub

	}

	
	
}