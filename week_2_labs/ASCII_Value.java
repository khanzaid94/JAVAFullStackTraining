package week_2_labs;

public class ASCII_Value {

	public static void main(String[] args) {
		char ch = 'H';
		int ascii = ch;
		System.out.println("The ASCII value of " + ch + " is: " + ascii);
		// You can also cast char to int
		int castAscii = (int) ch;
		System.out.println("The ASCII value of " + ch + " is: " + castAscii);

	}

}
