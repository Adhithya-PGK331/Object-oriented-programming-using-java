package Inheritance;

import java.util.Scanner;

public class newcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
card p=new card();
p.year1();
p.year2();

	}

}
class card{
	public void year1() {
		System.out.println("audi");
// TODO Auto-generated method stub
		
	}
	public void year2() {
		// TODO Auto-generated method stub
		System.out.println("green");

	}
	
}

class audi extends card{

	public void year1() {
		
		System.out.println("BLACK COLOR");
	}

	public void year2() {
		System.out.println("80kmph");

	}

}
class model extends audi {

	public void year2() {
		
		System.out.println("8lacs");
	}
	public void year1() {
		
		System.out.println("beta");
	}


}

