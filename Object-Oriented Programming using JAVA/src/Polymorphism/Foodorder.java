package Polymorphism;

import java.util.Scanner;

public class Foodorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=s.nextLine();
		System.out.println("Enter your Phone no");
		int phno=s.nextInt();
		System.out.println("Enter your address");
		String address=s.next();
		System.out.println("These all are the food choices \n1.BIRIYANI\n2.PAROTTA\n3.CHICKEN FRY\n4.FRESH JUICE");
		System.out.println("Select your choice from these");
		int food=s.nextInt();
		int total=0;int a=0;int b=0;int c=0;int e=0;
		total=0;int p=0,q=0,r=0,t=0;
		Display d=new Display();
		//d.detail(name,phno,address);
		total=total+a+b+c+e;

		d.detail(name,phno, address,a,b,c,e,food,total);
		d.detail(food,a,b,c,e,total);

	}
}
class Display{
/*	public void detail(String name, int phno, String address) {
		System.out.println("Student Details :");
		System.out.println("======================================");

		System.out.println("Name:"+name);
		System.out.println("Phone no:"+phno);
		System.out.println("Address:"+address);
		
	}
*/
	public void detail(String name,int phno,String address,int b,int c,int e, int a, int food, int total) {
		// TODO Auto-generated method stub
		System.out.println("\nBILL");
		System.out.println("======");		
		System.out.println("NAME:"+name);
		System.out.println("PHONE NO:"+phno);
		System.out.println("ADDRESS:"+address);
		System.out.println("FOOD ITEM :\n======");		

	}
	
	public void detail(int food,int a,int b,int c,int e, int total) {
		// TODO Auto-generated method stub
		if(food==1) {
			a=a+100;
			System.out.println("BIRIYANI:"+a);
		}
		else if(food==2) {
			b=b+10;
			System.out.println("PAROTTA:"+b);

		}
		else if(food==3) {
			c=c+50;		
			System.out.println("CHICKEN FRY:"+c);

		}
		else{
			e=e+30;
			System.out.println("FRESH JUICE:"+e);

		}

	}

	
	}

	

	
