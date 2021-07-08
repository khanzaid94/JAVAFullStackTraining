package week_2_labs;

public class Typecasting {

	public static void main(String[] args) {
		byte b=10;
		int i=b;// will accept - automatic type promotion
		byte c=i;// will not accept - because lower data type cannot be stored in higher data type
		
		byte d=(byte)i;// Type casting makes it possible to store compatible types.
		
		byte x=10;
		byte y=20;
		byte sum=x*y; // Error is thrown because when two bytes are used in a
		//arthmetic operation, the result will be integer

	}

}
