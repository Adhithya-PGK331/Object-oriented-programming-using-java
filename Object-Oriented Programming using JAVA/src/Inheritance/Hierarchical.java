package Inheritance;

import java.util.Scanner;
class Animal{
	void eat() {
		System.out.println("eat");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("bark");

	}
}

class Cat extends Animal{  
void meow(){
	System.out.println("meowing...");
	}  
}  

public class Hierarchical{  
public static void main(String args[]){  
Cat c=new Cat();  
c.meow();  
c.eat(); 
Dog d=new Dog();
d.bark();
d.eat();
}} 