package com.bridgelabz.logicalPrograms;
import java.util.Scanner;
public class ReversingNumberP4 {
	
	public static void main(String[] args) {
		
		int n,rev;
		/*
		 Taking input of user..
		 */
		System.out.print("Enter a Number: ");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		sc.close();
		while (n>0) {
			rev=n%10;
			
			System.out.print(rev);
			n=n/10;
		}
	}
}
