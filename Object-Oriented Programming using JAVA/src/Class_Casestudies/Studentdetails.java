package Class_Casestudies;

import java.util.Scanner;

public class Studentdetails {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=s.nextLine();
		System.out.println("Enter your age");
		int age=s.nextInt();
		System.out.println("Enter your Register number");
		int regno=s.nextInt();
		System.out.println("Enter your mark for sub1");
		int m1=s.nextInt();
		System.out.println("Enter your mark for sub2");
		int m2=s.nextInt();
		System.out.println("Enter your mark for sub3");
		int m3=s.nextInt();
		System.out.println("Enter your mark for sub4");
		int m4=s.nextInt();
		System.out.println("Enter your mark for sub5");
		int m5=s.nextInt();
		int total=0;
		total=m1+m2+m3+m4+m5;
		Student p=new Student();
		p.detail(name,age,regno);
		p.marks(m1,m2,m3,m4,m5);
		p.rank(total);
	}
}
class Student{
	
	String name;
	int age;
	public void detail(String name,int age,int regno) {
		
		System.out.println("Student Details :");
		System.out.println("======================================");

		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Register number:"+regno);


		
	}
	public void marks(int m1,int m2,int m3,int m4,int m5) {
		
		System.out.println("SUB1:"+m1);
		System.out.println("SUB2:"+m2);
		System.out.println("SUB3:"+m3);
		System.out.println("SUB4:"+m4);
		System.out.println("SUB5:"+m5);

		
		
	}
	public void rank(int total) {
		System.out.println("\n======================================");

	if(total>300)
	{
		System.out.println("Congratulations..!!!Your rank is 1");
		System.out.println("======================================");
	}
	else if(total>200 && total<300)
	{
		System.out.println("Congratulations..!!!Your rank is 2");		
		System.out.println("======================================");
	}
	else if(total>100 && total<200)
	{
		System.out.println("Congratulations..!!!Your rank is 3");
		System.out.println("======================================");
	}
	else if(total<100)
	{
		System.out.println("Failed");
		System.out.println("======================================");
	}
	}
	
	
}

