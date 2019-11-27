package Exception_handling;

public class Usingfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= {1,2,3,4,5};//ArrayIndexOutOfBoundsException
			arr[10]=500;
			System.out.println(arr[10]);
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
		finally {//whatever gives in finally code block will be executed as such
			System.out.println("Program closed");
		}
	}

}
