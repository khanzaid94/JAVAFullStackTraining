package week_2_labs;

import java.util.Scanner;

public class Input_Array_Elements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		System.out.println("Enter 10 elements: ");
		for (int i=0; i<10; i++)
		{
		array[i] = input.nextInt();
		}
		for( int num : array) {
		sum = sum+num;
		}
		System.out.println("Sum of array elements is: "+sum);
		}
		}
