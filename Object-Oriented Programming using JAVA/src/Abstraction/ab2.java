package Abstraction;

public class ab2 {

	public static void main(String[] args) {
Student2 s=new Student2();
s.totalmrk();
	}

}
abstract class rank2{
	abstract void totalmrk();
		public void rank1() {
		System.out.println("Rank2");
		}
	}
class Student2 extends rank2{
	void totalmrk() {
		System.out.println("Total mark --> 455");
	}

	
}