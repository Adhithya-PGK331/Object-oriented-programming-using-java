package Inheritance;

import java.util.Scanner;

public class Studentdata {
	public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
	    String name=s.next(); 
	    int age=s.nextInt(); 
	    String gender=s.next(); 
	    int idnumb=s.nextInt();
	     String major=s.next();
	    double cgpa=s.nextDouble(); 
	    int year=s.nextInt(); 
	    
	    CollegeStudent cs=new  CollegeStudent();
	    cs.display(name,age,gender,idnumb,cgpa,year,major);
	  }
	}
	class Student
	{
	  String name; 
	  int age; 
	  String gender; 
	  int idnumb; 
	  double cgpa;
	  int year;
	  String major;
	  public void display(String name,int age,String gender,int idnumb,double cgpa,int year, String major)
	  {
	    this.name=name;
	    this.age=age;
	    this.gender=gender;
	    this.idnumb=idnumb;
	    this.cgpa=cgpa;
	    this.year=year;
	    this.major=major;
	    System.out.println("Name");
	     System.out.println("Age");
	     System.out.println("Gender");
	     System.out.println("ID Number");
	     System.out.println("Major");
	     System.out.println("CGPA");
	     System.out.println("Year");
	    System.out.println("The Student details is");
	    System.out.printf("ID : %d\n",idnumb);
	    System.out.printf("Name : %s\n",name);
	    System.out.printf("Age : %d\n",age);
	    System.out.printf("Gender : %s\n",gender);
	    System.out.printf("Major : %s\n",major);
	    System.out.printf("CGPA : %.1f\n",cgpa);
	    System.out.printf("Year : %d\n",year);
	    
	}}
	class CollegeStudent extends Student
	{
	}