package Abstraction;

import java.util.Scanner;
public class Student_details{
public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the name");
    String name=sc.next();
    System.out.println("Enter the ID");
    int id=sc.nextInt();
    System.out.println("Enter your year");
	int year=sc.nextInt();
	System.out.println("Enter your Department name");
	String dept=sc.next();
	System.out.println("Enter your mark for sub1");
	int m1=sc.nextInt();
	System.out.println("Enter your mark for sub2");
	int m2=sc.nextInt();
	System.out.println("Enter your mark for sub3");
	int m3=sc.nextInt();
	System.out.println("Enter your mark for sub4");
	int m4=sc.nextInt();
	System.out.println("Enter your mark for sub5");
	int m5=sc.nextInt();
    Student1 s = new Student1();
    s.totalmark(name, id);
    int total = m1+m2+m3+m4+m5;
}
}
abstract class rank{
abstract void totalmark(String name, int id);    

public void rank1(int total) {
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
    //System.out.println("Rank 2");
    }
class Student extends rank{
void totalmark(String name, int id, String year, String dept) {
    
	System.out.println("Student Details :");
	System.out.println("======================================");

	System.out.println("Name:"+name);
	System.out.println("Roll no:"+id);
	System.out.println("Year:"+year);
	System.out.println("Department:"+dept);
    super.rank1(id);
        }

@Override
void totalmark(String name, int id) {
	// TODO Auto-generated method stub
	
}

protected void rank1() {
	// TODO Auto-generated method stub
	
}
   
}
}