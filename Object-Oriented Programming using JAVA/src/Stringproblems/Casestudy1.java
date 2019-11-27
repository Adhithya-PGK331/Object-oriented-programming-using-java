package Stringproblems;

import java.util.Scanner;

public class Casestudy1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		String pr="";
	      System.out.println("Registration");
	      System.out.println("Enter your name");
	      s.append("Name          : "+sc.nextLine());
	      System.out.println("Enter your address");
			s.append("\nAddress       : "+sc.nextLine());
			System.out.println("Contact Number");
			s.append("\nContact       : "+sc.nextLine());
			System.out.println("E-Mail ID");
			String email=sc.nextLine();
			s.append("\nEmail id      : "+email);
			System.out.println("Enter proof type");
			s.append("\nProof type    : "+sc.nextLine());
			System.out.println("Enter proof id");
			s.append("\nProof id      : "+sc.nextLine());
			System.out.println("Thank you for registering. Your id is 1...");
		    
		    System.out.println(s);
		    }
			 

	}

