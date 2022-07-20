package com.bridgelabz.logicalPrograms;
import java.util.Scanner;
public class PrimeNumberP3 {

	public static void main(String[] args) {
		
		
				int n,i,count=0;
				System.out.println("Enter a number: ");
				Scanner sc = new Scanner(System.in);
				n= sc.nextInt();
				sc.close();
				for (i=1; i<=n; i++) {
					
					if ( n%i==0) {
						
						count++;
					}
				}
					if(count==2) {
						System.out.println("Prime number");
					}
					else {
						System.out.println("Not a prime number ");
					} 
	}

}
