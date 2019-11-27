package Stringproblems;
import java.util.Scanner;
public class Santaclausquestion {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Guest name : ");
		String str1=s.next();
		System.out.println("Host name : ");
		String str2=s.next();
		System.out.println("Enter the letters in a pile : ");
		String str3=s.next();
		int a=str1.length();
		int b=str2.length();int count=0;int dcount=0;
		int c=str3.length();int i=0;int j=0;
		
			for(j=0;j<a;j++) {
		if(str1.charAt(j)==str3.charAt(j)) {
			count++;
		}}
			for(j=0;j<b;j++) {
				if(str2.charAt(j)==str3.charAt(j))
				{
					dcount++;
				}}
		System.out.println(count+" "+dcount);
		int total=count+dcount;
		if (total==c) {
			System.out.println("Yes");}
		else {
			System.out.println("No");}}}