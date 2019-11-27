package Stringproblems;

import java.util.Arrays;
import java.util.Scanner;

public class Santa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NAME OF GUEST");
		String str=s.next();
		System.out.println("ENTER THE NAME OF HOST");
		String str1=s.next();
		System.out.println("ENTER THE LETTERS IN A PILE");
		String str2=s.next();int flag=0;
		int i,j,c=0,cc=0;
		String st=str.concat(str1);
		 char tempArray[] = st.toCharArray(); 
	        Arrays.sort(tempArray);
	     char temp[]=str2.toCharArray();
	     Arrays.sort(temp);
	     String sort1=new String(tempArray);
	     String sort2=new String(temp);
	        if(sort1.equals(sort2))
	        {
			System.out.println("YES");}
	        else {
			System.out.println("NO");}
			}

	}


