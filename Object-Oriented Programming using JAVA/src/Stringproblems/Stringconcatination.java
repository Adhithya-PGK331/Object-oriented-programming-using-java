package Stringproblems;

import java.util.Scanner;

public class Stringconcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1=s.next();
		int l=str1.length();
		System.out.println("Enter the second string");
		String str2=s.next();
		int l2=str2.length();
		System.out.println("Enter the third string");
		String str3=s.next();
		int l3=str3.length();
		int flag=0;
		int i,j,c=0;
		String st3="";
		st3=str3.toUpperCase();
		char st[] = str1.toCharArray(); 
		char st2[] = str2.toCharArray();
		for(i=0;i<l;i++) {
			if(st[i]=='a' || st[i]=='e' ||st[i]=='i' ||st[i]=='o' ||st[i]=='u')
			{
				st[i]='$';
			}
		}
		
		String st11=new String(st);
		System.out.println(st11);
		for(i=0;i<l2;i++) {
			if(st2[i]=='a' || st2[i]=='e' ||st2[i]=='i' ||st2[i]=='o' ||st2[i]=='u')
			{
				st2[i]=st2[i];
			}
			else {
				st2[i]='#';
			}
		}
		String st12=new String(st2);;
		System.out.println(st12);
		
		String st4=st11.concat(st12);
		System.out.println(st4);
		
		String st5=st4.concat(st3);
		System.out.println(st5);
	}

}
