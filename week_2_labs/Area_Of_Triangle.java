package week_2_labs;

import java.util.Scanner;

public class Area_Of_Triangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base of the Triangle:");
		double base = input.nextDouble();
		System.out.println("Enter the height of the Triangle:");
		double height = input.nextDouble();
		//Area of Triangle= (width*height)/2
		double area = (base*height)/2;
		System.out.println("Area of Triangle is: " + area);
		}
		}
