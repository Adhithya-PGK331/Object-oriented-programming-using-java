package Stringproblems;

import java.util.Scanner;

public class Stringtransformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Pasha's string:\n");
		String s1=s.nextLine();
		System.out.println("Enter the number of days :\n");
		int num=s.nextInt();
		System.out.println("Enter the position from which Pasha started transforming : \n");
		int pos=s.nextInt();int i,j=0;char temp=0;
		char[] ch=s1.toCharArray();
		for(i=0;i<s1.length();i++)
		{
			for(j=0;j<=i;j++) {
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			}
		}
		String tnew=(String)(ch.toString());
		System.out.println("The resultant string :"+tnew);
	}
}
