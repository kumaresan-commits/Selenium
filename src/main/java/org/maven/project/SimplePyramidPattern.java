package org.maven.project;

import java.util.Scanner;

public class SimplePyramidPattern {
	
	
	public static void printStar(int n){
		
		for(int i=0; i<=n; i++){
			
			
			for(int j=0; j<i; j++){
				
				System.out.print("* ");
			}
		
		
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printStar(n);
				

	}

}
