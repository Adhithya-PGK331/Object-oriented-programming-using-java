package Encapsulation_programs;

import java.util.Scanner;

public class Casestudy2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Customer1 c1=new Customer1();
		int c=1;
		do {
			System.out.println("================");		
		System.out.println("**REGISTRATION**");
		System.out.println("================");		
		System.out.println("\nEnter the number of customers");
		c1.setN(s.nextInt());
		System.out.println("Enter the name");
		c1.setName(s.next());
		System.out.println("Enter the address");
		c1.setAddress(s.next());
		System.out.println("Enter the contact");
		c1.setContactNumber(s.next());
		System.out.println("Enter the email");
		c1.setEmail(s.next());
		System.out.println("Enter the proof Type");
		c1.setProofType(s.next());
		System.out.println("Enter the proof ID");
		c1.setProofID(s.next());
		if(c1.getName()!=null&&c1.getAddress()!=null&&c1.getContactNumber()!=null&&c1.getEmail()!=null&&c1.getProofType()!=null&&c1.getProofID()!=null)
		{
			c=0;
			c1.Register(c1.getName(),c1.getAddress(),c1.getContactNumber(),c1.getEmail(),c1.getProofType(),c1.getProofID());
			
			}
		else {
			System.out.println("Invalid registration");
			if(c1.getName()==null)
				System.out.println("Invalid name");
			if(c1.getAddress()==null)
				System.out.println("Invalid address");
			if(c1.getContactNumber()==null)
				System.out.println("Invalid contact");
			if(c1.getEmail()==null)
				System.out.println("Invalid email");
			if(c1.getProofType()==null)
				System.out.println("Invalid proof type");
			if(c1.getProofID()==null)
				System.out.println("Invalid Proof id");
			c=1;}

		//Display d=new Display();
		//d.display1(c1.getName(),c1.getAddress(),c1.getContactNumber(),c1.getEmail(),c1.getProofType(),c1.getProofID());
		}while(c!=0);
			}	}


class Customer1 {
	int n;
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	int i=1;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public String getName() {
		return name;
	}
	public boolean setName(String name)
    {
        if (name.matches("^[a-zA-Z]*$"))
        {
            this.name=name;
            return true;
        }
        else
        {
           // System.out.println("Invalid name");
            return false;
        }
    
	}
	public String getAddress() {
		return address;
	}
	public boolean setAddress(String address)
    {
        if (address.matches("^[a-z]*$"))
        {
            this.address=address;
            return true;
        }
        else
        {
            //System.out.println("Invalid Address");
            return false;
        }
    }
	
	public String getContactNumber() {
		return contactNumber;
	}
	public boolean setContactNumber(String contact)
    {
        if (contact.matches("^[0-9]*$"))
        {
            this.contactNumber=contact;
            return true;
        }
        else
        {
           // System.out.println("Invalid Contact Number");
            return false;
        }
    }
	
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email)
    {
        if (email.contains("@"))
        {
            this.email=email;
            return true;
        }
        else
        {
           // System.out.println("Invalid Email");
            return false;
        }
    }
	
	public String getProofType() {
		return proofType;
	}
	public boolean setProofType(String prooftype)
    {
        if (prooftype.matches("^[a-zA-Z]*$"))
        {
            this.proofType=prooftype;
            return true;
        }
        else
        {
            //System.out.println("Invalid proof type");
            return false;
        }
    
	}
	public String getProofID() {
		return proofID;
	}
	public boolean setProofID(String proofid)
    {
        if (proofid.matches("^[0-9a-zA-Z]*$"))
        {
            this.proofID=proofid;
            return true;
        }
        else
        {
            //System.out.println("Invalid proof id");
            return false;
        }
    
	}
	void Register(String name, String address, String contactNumber, String email, String proofType,String proofID)
	{
		System.out.println("REGISTRATION SUCCESSFUL");
		System.out.println("Name	:"+name);
		System.out.println("Address	:"+address);
		System.out.println("Contact	:"+contactNumber);
		System.out.println("Email	:"+email);
		System.out.println("Prooftype	:"+proofType);
		System.out.println("Proofid	:"+proofID);
		System.out.printf("Thank you for registering your id is %d.....",i);
		i++;
}}
