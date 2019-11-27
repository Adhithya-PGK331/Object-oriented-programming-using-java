package Inheritance;
class Car{
   public Car()//parent class
   {
	System.out.println("Car");
	System.out.println("==========================");
   }
   public void vehicleType()
   {
	System.out.println("Vehicle Type: Car");
   }

}
class Maruti extends Cars{//child class
   public Maruti()
   {
	System.out.println("Car: Maruti");
   }
   public void brand()
   {
	System.out.println("Brand: Maruti");
   }
   public void speed()
   {
	System.out.println("Max speed: 90Kmph");
   }
}

public class Multilevel extends Maruti{//main class

   public Multilevel()
   {
	System.out.println("Maruti Model: 800");
   }
   public void speed()
   {
	System.out.println("Max speed: 80Kmph");
   }
   public static void main(String args[])
   {
	 Multilevel a=new Multilevel();
	 a.vehicleType();
	 a.brand();
	 a.speed();
   }
private void vehicleType() {
	// TODO Auto-generated method stub
	
}
}