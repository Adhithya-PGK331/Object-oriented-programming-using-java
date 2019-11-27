package Exception_handling;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		int number=100/0;//ArithmeticException
		System.out.println(number);
	}
	catch(ArithmeticException e) {
		System.out.println(e+"\nValue division by 0 is not possible");//exception value printing
	}
		
	}

}
