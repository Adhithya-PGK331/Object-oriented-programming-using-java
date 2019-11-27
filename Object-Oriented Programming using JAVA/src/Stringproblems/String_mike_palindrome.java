package Stringproblems;

import java.util.Scanner;

public class String_mike_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("Enter string : ");
		String str=s.next();			
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		int len=str.length();
		int eachstr=len/n;int i,j=0;String rev = null;String b = null;
		String rev2="";String c="",d="";
		for(i=0;i<len;i++)
	      {//reading character by character
	          b=b+str.charAt(i);
	     }
		int count=0;int dcount=0;
		for(i=0;i<eachstr;i++)
		{c=c+str.charAt(j);}
		for(j=eachstr-1; j<len;j++)
		{d=d+str.charAt(j);}
	 
		for(i=0;i<eachstr;i++) {
			for(j=eachstr-1; j>=0; j--)//finding the reverse and storing to rev
			{rev=rev+str.charAt(j);}
		 
			if(c.equals(rev)) {count++;
			}
		}
		for(j=eachstr;j<len;j++) {
			for(i=eachstr; i>=len; i--)//finding the reverse and storing to rev2
			{rev2=rev2+str.charAt(i);}
		 
			if(d.equals(rev2)) {dcount++;
			}
			
		}
		if(count==dcount) {
			System.out.println("YES");
		}
		else {			
			System.out.println("NO");
}
	}

}
