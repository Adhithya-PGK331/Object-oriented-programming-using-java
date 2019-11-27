package Polymorphism;
import java.util.Scanner;
public class Student_details {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=s.nextLine();
		System.out.println("Enter your Roll no");
		int Rollno=s.nextInt();
		System.out.println("Enter your year");
		int year=s.nextInt();
		System.out.println("Enter your Department name");
		String dept=s.next();
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
		Detail d=new Detail();
		d.detail(name,Rollno,year,dept);
		d.detail(m1,m2,m3,m4,m5);
		d.detail(m1,m2,m3,m4,m5,total);}	}
class Detail{

	public void detail(String name, int Rollno, int year, String dept) {
		System.out.println("Student Details :");
		System.out.println("======================================");

		System.out.println("Name:"+name);
		System.out.println("Roll no:"+Rollno);
		System.out.println("Year:"+year);
		System.out.println("Department:"+dept);

	}

	public void detail(int m1, int m2, int m3, int m4, int m5, int total) {
		System.out.println("\n======================================");

		if(total>450)
		{
			System.out.println("Congratulations..!!!Your rank is 1");
			System.out.println("======================================");
		}
		else if(total>400 && total<450)
		{
			System.out.println("Congratulations..!!!Your rank is 2");		
			System.out.println("======================================");
		}
		else if(total>350 && total<400)
		{
			System.out.println("Congratulations..!!!Your rank is 3");
			System.out.println("======================================");
		}
		else if(total<300)
		{
			System.out.println("Failed");
			System.out.println("======================================");
		}
		
	}
	
	public void detail(int m1, int m2, int m3, int m4, int m5) {
		// TODO Auto-generated method stub
		System.out.println("SUB1:"+m1);
		System.out.println("SUB2:"+m2);
		System.out.println("SUB3:"+m3);
		System.out.println("SUB4:"+m4);
		System.out.println("SUB5:"+m5);
	}

	
}
	

