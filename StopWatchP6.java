package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class StopWatchP6 {
	public int getIntValue() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
/* method to get  Elapse time */
	
	public void getElapsTime() {
		int choice=0;
	    double start=0, stop=0;
        do {
            System.out.println("1. Start");
            System.out.println("2. Stop");
            choice = getIntValue();
            switch(choice) {
       			case 1:
       				start = System.currentTimeMillis();
       				System.out.println("You have started the stopwatch please select stop now");
       				break;
       			case 2:
       				stop = System.currentTimeMillis();
       				break; 
            }
       }while(choice != 2);
       double elaps = ((stop - start)/1000)%60;
       System.out.println("Elaps time = "+elaps+" sec");	
	}
	    public static void main(String[] args) {
	    	StopWatchP6 stopwatch = new StopWatchP6();
     	 System.out.println("Enter the choice between 1 and 2");
     	 stopwatch.getElapsTime();
     	
    }    

	
	
}
