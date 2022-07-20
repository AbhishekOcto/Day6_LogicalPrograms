package com.bridgelabz.logicalPrograms;
import java.util.Scanner;
public class PerfectNumberP2 {

	public static void main(String[] args) {
		
		/*A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number.
		 *  In other words, if the sum of positive divisors (excluding the number itself) of a number equals the number itself
		 *   is called a perfect number.
		 */    
		{  
		long n, sum=0;  
		Scanner sc=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		n=sc.nextLong();  
		int i=1;  
		//executes until the condition becomes false  
		while(i <= n/2)  
		{  
		if(n % i == 0)  
		{  
		//calculates the sum of factors  
		sum = sum + i;  
		}
		
		//after each iteration, increments the value of variable i by 1  
		i++;  
		} 
		  
		//compares sum with the number  
		if(sum==n)  
		{  
		//prints if sum and n are equal  
		System.out.println(n+" is a perfect number.");  
		} //end of if  
		else  
		//prints if sum and n are not equal  
		System.out.println(n+" is not a perfect number."); 
		sc.close();
		  }  

	}

}
