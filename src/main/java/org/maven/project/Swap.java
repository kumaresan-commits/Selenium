package org.maven.project;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");

	/*	System.out.println("Enter  i value to swap ");
		int i = sc.nextInt();
		
		System.out.println("Enter j value to swap");
		int j = sc.nextInt();
		
		i= i+j;
		
		j=i-j;
		i=i-j;
		
		System.out.println(i);
		System.out.println(j);*/
		
	/*	System.out.println("Enter value to fact ");
		int s = sc.nextInt();
		int fact=1;
	for(int i=1; i<=s; i++){
		
		fact = fact*i;
		
	}
	
	System.out.println(fact);
	}*/
	
		/*System.out.println("Enter String");
	
		String s = sc.nextLine();
		String s2="";
		
		for(int i=s.length()-1; i>=0; i--){
			
			
			
			s2=s2+s.charAt(i);	
		}
		
		System.out.println(s2);
		if(s.equals(s2)){
			
			System.out.println("given String palindrome");
			
		}
		else{
			System.out.println("Given String is not palindrome");
		}*/
		
		int n = sc.nextInt();
		
		
		
		int r, temp, sum=0;
		temp = n;
		
		while(n>0){
			
			r = n%10;
			sum = (sum*10)+r;
			n = n/10;
			
		}
		
		if(temp==sum){
			
			System.out.println("number is palindrome");
		}
		else{
			System.out.println(" no is not palindrome");
		}
	
	}
	

}
