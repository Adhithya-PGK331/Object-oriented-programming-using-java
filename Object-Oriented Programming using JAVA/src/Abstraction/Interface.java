package Abstraction;

import java.util.Scanner;
public class Interface {
	 public static void main(String[] arge)
	    {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the name");
	        String name=sc.next();
	        System.out.println("Enter the ID");
	        int id=sc.nextInt();
	        System.out.println("Enter the total");
	        int t=sc.nextInt();
	        Student1 s = new Student1();
	        s.detail(name, id);
	        s.total(t);
	    }
	}
	interface rank1{
	    public  void detail(String name, int id);
	    public  void total(int t);
	}
	//interface total{
	    
	//}
	class Student1 implements rank1{
	    public void detail(String name, int id)
	    {
	        System.out.println("Name ->"+name);
	        System.out.println("Student ID ->"+id);
	    }    
	    public void total(int t) {
	        System.out.println("Total ->"+t);
	        
	    }
		public void totalmark(String name, int id) {
			
		}
	}