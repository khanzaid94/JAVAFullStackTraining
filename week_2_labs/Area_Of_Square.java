import java.util.Scanner;

public class Area_Of_Square {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	System.out.println("Enter Side of Square:");
	//Capture the user's input
	
	//Storing the captured value in a variable
	double side = input.nextDouble();
	
	//Area of Square = side*side
	double area = side*side;
	System.out.println("Area of Square is: "+area);

	
		}
		}