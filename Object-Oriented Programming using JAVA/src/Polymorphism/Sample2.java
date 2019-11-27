package Polymorphism;

class AB{
	public void disp() {
		System.out.println("Parent class");
	}
}
class Demon extends AB{
	public void disp() {
		super.disp();
		System.out.println("Child class");
		super.disp();
	}
}

public class Sample2 {

	public static void main(String[] args) {

Demon obj=new Demon();
obj.disp();
	}

}
