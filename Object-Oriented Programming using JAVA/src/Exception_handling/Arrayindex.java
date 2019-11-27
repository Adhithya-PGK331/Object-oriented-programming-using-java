package Exception_handling;

public class Arrayindex {

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
	}

}
