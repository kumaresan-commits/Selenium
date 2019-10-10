package org.maven.project;

import java.util.Scanner;

public class SimplePyramidPattern2 {

	public static void printStar(int n){
		
		for(int i=0; i<=n; i++){
			
			
			for(int j=2*(n-i); j>=0; j--){
				
				System.out.print(" ");
			}
			
			for(int k=0; k<=i; k++){
				
				System.out.print("* ");
		
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		printStar(n);
		
	}
}
