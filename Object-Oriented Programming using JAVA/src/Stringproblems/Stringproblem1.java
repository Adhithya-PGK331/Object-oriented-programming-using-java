package Stringproblems;

import java.util.Scanner;

public class Stringproblem1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int vcount=0;int i=0;int ccount=0;int u=0;int l=0;int dcount=0;int scount=0;int wcount=0;
		System.out.println("Enter the string : ");int ch=0;
		String str=s.nextLine();
		for(i=0;i<str.length();i++)
		{ch++;
		}
		for(i=0;i<str.length();i++)
		{
			if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z'))
			{
				if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'||str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' )
					vcount++;
				
				else
					ccount++;
			}
		}
		String t=str;
		for(i=0;i<str.length();i++)
		{
				if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				dcount++;
				}
				else if(str.charAt(i)==' ') {
				wcount++;
				}
				else if(t.charAt(i)>='A' && t.charAt(i)<'Z') {
					u++;
					}
				else if(t.charAt(i)>='a' && t.charAt(i)<'z') {l++;}
					
				else {
				scount++;
				}
		
		//condition for vowels
			}
		System.out.println("No of characters in this string : "+ch);
		System.out.println("No of vowels in this string : "+vcount);
		System.out.println("No of consonants in this string : "+ccount);
		System.out.println("No of digits in this string : "+dcount);
		System.out.println("No of special character symbols in this string : "+scount);
		System.out.println("No of white spaces in this string : "+wcount);
		System.out.println("No of uppercase letters in this string : "+u);
		System.out.println("No of lowercase letters in this string : "+l);
	}

}
