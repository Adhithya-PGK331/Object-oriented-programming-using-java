package Polymorphism;

import java.util.Scanner;

public class Casestudy2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Telephone Bill Number :");
		int billno=s.nextInt();
		System.out.println("Enter the Customer Name :");
		String name=s.next();
		System.out.println("Enter the Number of Calls made :");
		int call=s.nextInt();
		System.out.println("Enter the Cost per Call :");
		int cost=s.nextInt();
		System.out.println("Enter the Current Bill Number :");
		int curentbill=s.nextInt();
		System.out.println("Enter the Customer Name :");
		String name2=s.next();
		System.out.println("Enter the  Number of Units Consumed :");
		int unit=s.nextInt();
		System.out.println("Enter the Cost per unit :");
		int costc=s.nextInt();
		
		Bill b=new Bill();
		b.generateBill(billno,name);
		TelePhoneBill t=new TelePhoneBill();
		t.generateBill(name,billno,call,cost);
		CurrentBill cb=new CurrentBill();
		cb.generateBill(name2,curentbill,unit,costc);
	}

}
class Bill{
	private int billNumber;
	private String name;
	public void generateBill(int billno, String name) {
		
	}
}
 class TelePhoneBill extends Bill{
	 private int call;
		private double cost;
		public void generateBill(String name, int billno,int call, int cost) {
			System.out.println("Telephonic bill no:"+billno);
			System.out.println("Name:"+name);
			double amount1=call*cost;
			System.out.println("Bill amount:"+amount1);
		}
		
 }
 class CurrentBill extends Bill{
	 private int unit;
	 private double costc;
	public void generateBill(String name2, int curentbill, int unit, int costc) {
		System.out.println("Current bill no:"+curentbill);
		System.out.println("Name:"+name2);
		double amount=unit*costc;
		System.out.println("Bill amount:"+amount);
	}
 }