package org.maven.project;

import java.util.Scanner;

public class Prime {

	int i, temp=0;
	public void prime(int n){
		
		int m =n/2;
		
		if(n==0||n==1){
			
			System.out.println("Not Prime..");
		}else{
			for(i=2;i<=m; i++){
				
				if(n%i==0){
					
					System.out.println("Not prime number");
					temp=1;
					break;
					
					}
				
				
				}
			if(temp==0){
				
				System.out.println("This is a prime number ");
				
			}
			
			}
		
	}
	
	
	public static void main(String[] args) {
		
		Prime p1 = new Prime();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to validate ");
		int r = sc.nextInt();
		p1.prime(r);
		sc.close();
		
		

	}

}
