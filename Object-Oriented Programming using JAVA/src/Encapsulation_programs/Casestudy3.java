package Encapsulation_programs;
import java.util.Scanner;
public class Casestudy3 {
	public static void main(String[] args) {

Scanner s=new Scanner(System.in);
Casestudy34 cc=new Casestudy34();
int i=1,a;double total=0,ss=0;
System.out.println("Enter price of ticket");
cc.setPrice(s.nextInt());
System.out.println("Enter no of person");
cc.setP(s.nextInt());
a=cc.getP();
do {
System.out.printf("Enter DETAILS OF P%d\n",i);i++;
System.out.println("Enter name");
cc.setName(s.next());//STORING VARIABLES
System.out.println("Enter gender(F/M)");
cc.setG(s.next());
System.out.println("Enter age");
cc.setAge(s.nextInt());
 total=cc.totalprice(cc.getAge(),cc.getG(),cc.getPrice(),cc.getP(),ss);
 ss=total;

if(a==1)
{
	cc.ticket5(cc.getPrice(),cc.getP(),ss);
	//System.out.printf("Total amount=%.1f",ss);
	}
a--;
}while(a>0);
}
}
class Casestudy33 {
	int price;
	int p;int i=1,j=0;
	String name;
	String g;
	int age;
	double total=0,sum=0;
	public int getPrice() {
		return price;
	}
	//getters and setters auto-generated by right clicking
		//and selecting source-->>Generate getters and setters
		//select variables to which getters and setters to be added.
		//click OK
	public void setPrice(int price) {
		this.price = price;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getG() {
		return g;
	}
	public void setG(String g) {
		this.g = g;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void ticket(int p, int price) {
		// TODO Auto-generated method stub
		System.out.printf("TICKET DETAILS ARE....\n");
		System.out.printf("NO: OF PASSENGERS:%d\n",p);
		System.out.printf("PRICE OF TICKET:%d\n",price);
	}
		double ticket(int age, String g,int p,int price,double total) {
		
			if(j<=p)
			{
			if(age<16)
		{//children
				sum=total+(price-50);
				j++;
				return sum;
			}
			else if(g.equals("F")&&age>=16)
			{//female adult
				sum=total+(price-10);
				j++;
				return sum;
			}
			else if(age>64)
			{//senior citizens
			sum=total+(price-25);
			j++;
				return sum;
			}
			else
			{
				sum=price+total;
				j++;
				return sum;
			}
			}
			else {
				j++;
				return sum;
			
		}}
			
		
		
	
	
}
