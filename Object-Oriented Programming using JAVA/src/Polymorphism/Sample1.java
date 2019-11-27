package Polymorphism;
class ABC{
	public void disp() {
		System.out.println("Parent class");
	}
}
class Demo extends ABC{
	public void disp() {
		//super.disp();
		System.out.println("Child class");
	}
}

public class Sample1 {

	public static void main(String[] args) {

Demo obj=new Demo();
obj.disp();
	}

}
