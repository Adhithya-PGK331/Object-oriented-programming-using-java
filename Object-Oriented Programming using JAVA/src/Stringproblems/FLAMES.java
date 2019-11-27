package Stringproblems;
import java.util.Scanner;
public class FLAMES {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter boy name :");
		String s1=s.nextLine();
		System.out.println("Enter girl name :");
		String s2=s.nextLine();int j=0;String n1="";String n2="";
		int i=0;int a=s1.length();int b=s2.length();int count=0;
		String sn=s1.toLowerCase();int dcount=0;
		String sm=s2.toLowerCase();
		char[] ss1=sn.toCharArray();
		char[] ss2=sm.toCharArray();
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++) {
				if(ss1[j]!=ss2[j]) {
					count++;
				}
				if(ss1[j]==ss2[j]) 
					dcount=0;
				}
		}
			switch(count) {
			case 1:
			case 7:
			case 13:
			case 19:
			case 25:
			case 31:
				System.out.println("Friends");break;
			case 2:
			case 8:
			case 14:
			case 20:
			case 26:
			case 32:
				System.out.println("Lovers");break;
			case 3:
			case 9:
			case 15:
			case 21:
			case 27:
			case 33:
				System.out.println("Affection");break;

			case 4:
			case 10:
			case 16:
			case 22:
			case 28:
			case 34:
				System.out.println("Married");break;

			case 5:
			case 11:
			case 17:
			case 23:
			case 29:
			case 35:
				System.out.println("Enemies");break;

			case 6:
			case 12:
			case 18:
			case 24:
			case 30:
			case 36:
				System.out.println("Siblings");break;

		
		}
			
	}
}
