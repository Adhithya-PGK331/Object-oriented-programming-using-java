package Regular_expression;
import java.util.Scanner;
import java.util.regex.Matcher;//package of matcher
import java.util.regex.Pattern;//package of pattern
public class Reg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int flag=0;int f=0;
		do {
		System.out.println("************");
		System.out.println("Registration");
		System.out.println("************");
		 	String regx = "[A-Z][a-z]*";
		    Pattern nam = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
		 	System.out.println("First Name : ");
		 	String names=s.next();
		 	Matcher name=nam.matcher(names);
		 	
		 	String regxx = "[A-Z]+([ '-][a-zA-Z]+)*";
		    Pattern nam2 = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
		 	System.out.println("Last Name : ");
		 	String lnames=s.next();
		 	Matcher lname=nam2.matcher(lnames);
		 	
			String regex= "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
			Pattern pattern=Pattern.compile(regex);
			System.out.println("Enter the email id : ");
			String emails=s.next();//email inputting in string format
			Matcher email=pattern.matcher(emails);//checking if input matches email pattern
			
			String reg1 = "^[0-9]*$";
			Pattern regno = Pattern.compile(reg1);
			System.out.println("Register number : ");
			String register=s.next();
			Matcher regis=regno.matcher(register);
			 	
			String expression = "^[0-9]*$";
			Pattern rnk = Pattern.compile(expression);
			System.out.println("Rank : ");
			String rank=s.next();
			Matcher rankno=rnk.matcher(rank);
			
			String reg2 = "^[0-9]*$";
			Pattern yr = Pattern.compile(reg2);
			System.out.println("Year : ");
			String year=s.next();
			Matcher yearno=yr.matcher(year);
			
			String reg3 = "[A-Z].[a-zA-Z]*$";
		    Pattern dep = Pattern.compile(reg3,Pattern.CASE_INSENSITIVE);
		 	System.out.println("Department : ");
		 	String department=s.next();
		 	Matcher dept=dep.matcher(department);
		 	
		 	if(name.matches())//matches-->stores result state of email
			{//here checking if stored result is true,if yes print valid
				System.out.println("Valid First Name");
				flag=1;
			}
			else
			{
				System.out.println("Invalid First Name");
				flag=0;
			}
		 	
		 	if(lname.matches())//matches-->stores result state of email
			{//here checking if stored result is true,if yes print valid
				System.out.println("Valid Last Name");flag=1;
			}
			else
			{
				System.out.println("Invalid Last Name");flag=0;
			}
		 	
			if(email.matches())//matches-->stores result state of password
			{//here checking if stored result is true,if yes print valid
				System.out.println("Valid email");flag=1;
			}
			else
			{
				System.out.println("Invalid email");flag=0;
			}
			
		 	if(regis.matches())//matches-->stores result state of email
			{//here checking if stored result is true,if yes print valid
				System.out.println("Valid Register number");flag=1;
			}
			else
			{
				System.out.println("Invalid Register number");flag=0;
			}
			if(rankno.matches())//matches-->stores result state of password
			{//here checking if stored result is true,if yes print valid
				System.out.println("Valid Rank");flag=1;
			}
			else
			{
				System.out.println("Invalid Rank");flag=0;
			}
			
			if(yearno.matches())//matches-->stores result state of email
			{//here checking if stored result is true,if yes print valid
				System.out.println("Valid Year");flag=1;
			}
			else
			{
				System.out.println("Invalid Year");flag=0;
			}
			if(dept.matches())//matches-->stores result state of password
			{//here checking if stored result is true,if yes print valid
				System.out.println("Valid Department Name");flag=1;
			}
			else
			{
				System.out.println("Invalid Valid Department Name");flag=0;
			}
			if(flag==1) {
				System.out.println("************************");
				System.out.println("Registration complete..!!!");
				System.out.println("************************");
				
				do {
				Pattern pswd= Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
				System.out.println("Enter the password : ");
				String password=s.next();
				Matcher mtch=pswd.matcher(password);//checking if user entered password---->>
				//--->> matches password pattern
				
				
				if(mtch.matches())//matches-->stores result state of password
				{//here checking if stored result is true,if yes print valid
					System.out.println("Valid Password");f=1;
					System.out.println("User name : "+emails);
					System.out.println("Password : "+password);
				}
				else
				{
					System.out.println("Invalid Password");f=0;
					
				}
				}while(f!=1);
			}
			else {
				System.out.println("Sorry..!! Your registration is yet to complete.");
			}
	}while(flag==0);
	}
}