package com.bridgelabz.logicalPrograms;
import java.util.Scanner;
public class FibonacciSeriesP1 {


/* Fibonacci series is special type of series in which a term is the sum of previous two terms
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 1, n3, i, count;
		/*
		 * printing 0 and 1
		 */
		System.out.println(n1+"  ");
		System.out.println(n2+"");
		System.out.println("enter the count: ");
		count = sc.nextInt();
		sc.close();
		/*
		 * starting loop from 2 as 0 and 1 is already printed
		 */
		
		for(i=2; i<count; i++) {
			
			n3=n1+n2;
			
			System.out.println(""+n3);
			n1=n2; n2=n3;
		}
			
	}
	
}
