package Classandobject;
import java.util.Scanner;
public class C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s=new Scanner(System.in);
		    System.out.println("1.Book");
		    System.out.println("2.");
		    String ac=s.next();
		    System.out.println("Cot(Single/Double)\n1-Single\n2-Double");
		    String cot=s.next();
		    System.out.println("Cable connection(C/nC) : \n 1-C\n2-nC");
		    String cable=s.next();
		    System.out.println("Wifi needed or not (W/nW): \n 1-W\n 2-nW");
		    String wifi=s.next();
		    System.out.println("Laundry services needed or not :(L/nL)\n1-L\n2-nL");
		    String laundry=s.next();
		    System.out.println("Registration Successfull");
		    customer c=new customer(ac,cot,cable,wifi,laundry);
		   // c.register(ac,cot,cable,wifi,laundry);
		    c.sum(ac,cot,cable,wifi,laundry);
		  }

	public void reg(String name, String address, String contact, String email, String prooftype, String proofid) {
		// TODO Auto-generated method stub
		
	}
		}class customer{
		  String ac; String cot; String cable;
		  String wifi; String laundry;
			  public customer(String ac, String cot, String cable,String wifi, String laundry)
		  {
				  this.ac=ac; this.cot=cot; this.cable=cable; this.wifi=wifi;
				    this.laundry=laundry;
		    
		  }
		public void sum(String ac2, String cot2, String cable2, String wifi2, String laundry2) {
				// TODO Auto-generated method stub
		}
		public static void register(String ac,String cot,String cable,String wifi,String laundry,String proof,String proofid, String sum)
		  {
		    System.out.println("Your Details:");
		    System.out.println(ac);
		    System.out.println(cot);
		    System.out.println(cable);
		    System.out.println(wifi);
		    System.out.println(laundry);
			System.out.println("The total charge is Rs."+sum);
		  
		  
		}
		}