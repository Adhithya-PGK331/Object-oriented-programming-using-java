package Regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;//package of matcher
import java.util.regex.Pattern;//package of pattern

public class Emailvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	String regex= "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	//string regex-regular expression email validation code
	
	Pattern pswd= Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
	//pattern pswd-regular expression password validation code
	
	Pattern pattern=Pattern.compile(regex);
		//Pattern -class  pattern-object for email
		
	System.out.println("Enter the email id : ");
		String emails=s.next();//email inputting in string format
		Matcher email=pattern.matcher(emails);//checking if input matches email pattern
		System.out.println("Enter the password : ");
		String password=s.next();
		Matcher mtch=pswd.matcher(password);//checking if user entered password---->>
		//--->> matches password pattern
		
		if(email.matches())//matches-->stores result state of email
		{//here checking if stored result is true,if yes print valid
			System.out.println("Valid Email ID");
		}
		else
		{
			System.out.println("Invalid Email ID");
		}
		if(mtch.matches())//matches-->stores result state of password
		{//here checking if stored result is true,if yes print valid
			System.out.println("Valid Password");
		}
		else
		{
			System.out.println("Invalid Password");
		}
	}

}
