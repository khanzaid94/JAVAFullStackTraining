package week_2_labs;

import java.util.Scanner;

public class Area_Of_Rectangle {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the length of Rectangle:");
			double length = input.nextDouble();
			System.out.println("Enter the width of Rectangle:");
			double width = input.nextDouble();
			//Area of Rectangle = length*width;
			double area = length*width;
			System.out.println("Area of Rectangle is:"+area);
			}
			}
