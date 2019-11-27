package Stringproblems;

import java.util.Scanner;

public class Caesercipher {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character(R/L)");
		char ch=s.next().charAt(0);
		System.out.println("Enter the string : ");
		String str=s.next();
		int l=str.length();
		String str1="qwertyuiop asdfghjkl; zxcvbnm,./";
		int ll=str1.length();
		System.out.println("Original message : ");
		int i=0,j;
		for(i=0;i<l;i++)
		{
			for(j=0;j<ll;j++)
			{
				if(str.charAt(i)==str1.charAt(j)&&ch=='R')
				{
					System.out.print(str1.charAt(j-1));
				}
				if(str.charAt(i)==str1.charAt(j)&&ch=='L')
				{
					System.out.print(str1.charAt(j+1));
				}
			}
				
		}
		}}