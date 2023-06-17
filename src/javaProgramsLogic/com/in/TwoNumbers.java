package javaProgramsLogic.com.in;

import java.util.Scanner;

public class TwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* sum of two numbers getting input from user */
		//output
		/*Enter the number to added:
			2
			3
			the sum is :5  */
		Scanner obj = new Scanner(System.in);
		int a, b, sum;
		System.out.println("Enter the two numbers :");
		a =obj.nextInt();
		b = obj.nextInt();
		sum = a+b;
		System.out.println("the sum is :" + sum);
		
		//Difference of two 
		int diff;
		diff = a-b;
		System.out.println("the difference btwwn first and second :" + diff);
		
		//Average of two 
		double average;
		average= (a+b)/2;
		System.out.println("The average is :"+ average);
		
		//product of numbers
		double product;
		product = a*b;
		System.out.println("the product is :"+ product);
		
		// division of numbers
		double division;
		division = a/b;
		System.out.println("the Division of First/second:"+division);
		
		//modulus operator gives reminder %
		double mode;
		mode = a%b;
		System.out.println("the reminder is :"+ mode);
		
	}

}
