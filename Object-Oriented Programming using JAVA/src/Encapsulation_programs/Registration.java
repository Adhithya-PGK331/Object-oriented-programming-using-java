package Encapsulation_programs;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		Customer c=new Customer();
		System.out.println("Enter the name");
		c.setName(s.next());
		System.out.println("Enter the address");
		c.setAddress(s.next());
		System.out.println("Enter the contact");
		c.setContactNumber(s.next());
		System.out.println("Enter the email");
		c.setEmail(s.next());
		System.out.println("Enter the proof Type");
		c.setProofType(s.next());
		System.out.println("Enter the proof ID");
		c.setProofID(s.next());
		c.Register(c.getName(),c.getAddress(),c.getContactNumber(),c.getEmail(),c.getProofType(),c.getProofID());
		//Display d=new Display();
		//d.display(c.getName(),c.getAddress(),c.getContactNumber(),c.getEmail(),c.getProofType(),c.getProofID());

			}

		}

class Customer {
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	int i=1;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofID() {
		return proofID;
	}
	public void setProofID(String proofID) {
		this.proofID = proofID;
	}
	void Register(String name, String address, String contactNumber, String email, String proofType,String proofID)
	{
		System.out.println("REGISTRATION");
		System.out.println("name="+name);
		System.out.println("address="+address);
		System.out.println("contact="+contactNumber);
		System.out.println("email="+email);
		System.out.println("prooftype="+proofType);
		System.out.println("proofid="+proofID);
		System.out.printf("Thank you for registering your id is %d.....",i);
		i++;
}}