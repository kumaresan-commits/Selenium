package org.maven.project;

import java.io.BufferedReader;
import java.util.Scanner;

public class AddOrEven {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter integer to find odd or even");
		
		i = sc.nextInt();
		
		if(i%2==0){
			
			System.out.println("Given number is Even");
		}else{
			System.out.println("Given number is Odd");
		}
		
		
	}

}
