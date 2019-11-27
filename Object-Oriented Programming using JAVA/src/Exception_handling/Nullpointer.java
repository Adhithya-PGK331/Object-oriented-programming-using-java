package Exception_handling;

public class Nullpointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s=null;//NullPointerException
			int length=s.length();//finding length of string and storing to a variable
			System.out.println(length);
		}
		catch(NullPointerException e) {
			System.out.println(e+"\nThe String is null.Can't find its length..!!");//exception value printing
		}
	}

}
