package week_2_labs;

import java.util.Scanner;

public class Area_Of_Circle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		
		//We are storing the entered radius in double because a user can enter radius in decimals
		
		double radius = input.nextDouble();
		
		//Area of Circle = PI*radius*radius
		double area = Math.PI * (radius * radius);
		System.out.println("The Area of circle is: " + area);
		
		//Circumference of Circle = 2*PI*radius
		double circumference= Math.PI * 2 *radius;
		System.out.println( "The Circumference of the circle is:"+circumference);
		}
		}