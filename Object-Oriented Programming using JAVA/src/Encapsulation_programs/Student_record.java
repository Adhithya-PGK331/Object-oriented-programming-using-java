package Encapsulation_programs;

import java.util.Scanner;

public class Student_record {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
Stud1 st=new Stud1();
System.out.println("Enter the name");
st.setName(s.next());//set--->>set the value
System.out.println("Enter the id");
st.setId(s.nextInt());
System.out.println("Student details");
System.out.println(st.getName());//get-->>print
System.out.println(st.getId());
	}

}
