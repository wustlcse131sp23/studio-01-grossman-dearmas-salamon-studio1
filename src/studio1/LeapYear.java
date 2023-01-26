package studio1;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int remainder;
		
		int remainder2;
		
		int remainder3;
		
		boolean leapYear;
		
		System.out.println("What year?");
		
		int year = in.nextInt();
		
		remainder = year%4;
		
		remainder2 = year%100;
		
		remainder3 = year%400;
		
		leapYear = (remainder == 0 && remainder2!=0) || remainder3 == 0; 
		
		System.out.println(year + " is a leap year: " + leapYear);
	
	}


}
