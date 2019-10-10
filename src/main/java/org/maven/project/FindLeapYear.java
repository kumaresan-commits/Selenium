package org.maven.project;

import java.util.Scanner;

public class FindLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int date;
		System.out.println("Enter year with yyyy format");
		date = sc.nextInt();
		
		if(date==0){
			System.out.println("Zero is not to be validated!! please enter number");
		}else if((date%4==0) && (date%100!=0) || (date%400==0)){
			
			System.out.println(date+" Is leap year");
			
		}else{
			
			System.out.println("This is not leap year");
		}

	}

}
