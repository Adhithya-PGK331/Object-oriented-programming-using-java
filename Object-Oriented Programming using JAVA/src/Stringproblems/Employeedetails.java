package Stringproblems;

import java.util.Scanner;

public class Employeedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		System.out.println("Enter your name");
		s.append("Name        : "+sc.nextLine());
		System.out.println("Enter your gender");
		s.append("\nGender      : "+sc.nextLine());
		System.out.println("Enter your employee id");
		s.append("\nEmployee id : "+sc.nextLine());
		System.out.println("Enter your salary details");
		s.append("\nSalary      : "+sc.nextLine());
		System.out.println("Enter your address");
		s.append("\nAddress     : "+sc.nextLine());
		System.out.println(s);
		
		
	}

}
