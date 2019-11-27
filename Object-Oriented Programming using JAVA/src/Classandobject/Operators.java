package Classandobject;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers :");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.printf("1-add\n2-sub\n3-mul\n4-div\n5-mod");
		int n=s.nextInt();
		Oper op=new Oper();
		switch(n) {
		case 1:Oper.add(a,b);break;
		case 2:Oper.sub(a,b);break;
		case 3:Oper.mul(a,b);break;
		case 4:Oper.div(a,b);break;
		case 5:Oper.mod(a,b);break;
		}
	}
}
class Oper{

	public static void add(int a,int b) {
		System.out.printf("Sum-> %d",a+b);
	}
	public static void sub(int a, int b) {
		System.out.printf("Difference-> %d",a-b);
	}
	public static void mul(int a, int b) {
		System.out.printf("Product-> %d",a*b);
	}
	public static void div(int a, int b) {
		System.out.printf("Quotient-> %d",a/b);
	}
	public static void mod(int a, int b) {
		System.out.printf("Modulus-> %d",a%b);
	}
	
	
	
}

