package Stringproblems;

public class Employeeinsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer name=new StringBuffer("NarayananKutty");
		StringBuffer age=new StringBuffer("45");
		StringBuffer id=new StringBuffer("TVE15");
		StringBuffer gender=new StringBuffer("Male");
		StringBuffer salary=new StringBuffer("45000");
		StringBuffer address=new StringBuffer("CHKL");
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(id);
		System.out.println(salary);
		System.out.println(address);
		System.out.println();System.out.println();
		address.append(" Kerala");//appending 
		id.insert(4, "033");//inserting some objects
		name.delete(4, 5);//deleting at a particular position
		address.replace(4, 5,"tn");//replacing
		salary.deleteCharAt(3);//deleting character
		name.reverse();//reversing the same
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(id);
		System.out.println(salary);
		System.out.println(address);
	}

}
