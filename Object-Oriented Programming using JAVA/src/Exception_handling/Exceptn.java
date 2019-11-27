package Exception_handling;

public class Exceptn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s=null;//NullPointerException
			int length=s.length();//finding length of string and storing to a variable
			System.out.println(length);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e+"\nCheck the array index");//exception value printing
		}
		catch(ArithmeticException e) {
			System.out.println(e+"\nValue division by 0 is not possible");//exception value printing
		}
		catch(Exception e) {
			System.out.println(e+"\nError");//exception value printing
		}
	}

}
