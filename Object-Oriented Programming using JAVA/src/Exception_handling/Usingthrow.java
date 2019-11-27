package Exception_handling;

import java.util.Scanner;

public class Usingthrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number :");
		int a=s.nextInt();
		System.out.println("Enter second number :");
		int b=s.nextInt();
if(a<b)
{
	throw new ArithmeticException("B is greater");}
else {
	throw new ArithmeticException("A is greater");}

}
	}


