package com.bridgelabz.logicalPrograms;
import java.util.Scanner;
import java.util.Random;
public class CouponNumberP5{
  
	public int getIntValue() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
		
	}
	/* method to get random coupons*/
	
	public static void getCoupons(int noOfcoupns, int sizeOfCoupon) {
		int cnt = 0;
		String str1 = "";
		String coupns = "";
		while(cnt != noOfcoupns) {
			str1 = generateCoupons(sizeOfCoupon);
			if(!coupns.contains(str1)) {
				coupns += str1;
				cnt++;
				System.out.println("coupon"+cnt+" =  "+str1);
			}
		}
		
	}
	/* method to generate random coupons*/
	
	public static String generateCoupons(int sizeOfCoupon) {
		String str = "";
		Random random = new Random();
			for(int i=0; i<sizeOfCoupon; i++) {
				int num = random.nextInt(10);
				str += ""+num;
			}
		return str;
		
	}

       public static void main(String[] args) {
	CouponNumberP5 CN = new CouponNumberP5();
	System.out.print("Enter number of coupons to generate N: " );
	int numberOfCoupns = CN.getIntValue();
	System.out.print("Enter Size of coupons: " );
	int sizeOfCoupon = CN.getIntValue();
	CouponNumberP5.getCoupons(numberOfCoupns,sizeOfCoupon);
	
    }

}
