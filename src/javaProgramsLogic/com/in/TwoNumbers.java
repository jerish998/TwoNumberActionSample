package javaProgramsLogic.com.in;

import java.util.Scanner;

public class TwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* sum of two numbers getting input from user */
		//output
		/*Enter the two numbers :
		4
		5
		the sum is :9
		the difference is:-1
		The average is :4.0
		the product is :20.0
		the Division of First/second:0.0
		the reminder is :4.0
  */
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
