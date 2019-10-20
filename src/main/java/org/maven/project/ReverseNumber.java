package org.maven.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReverseNumber {
	
	int reverse=0;
	
	public void reverseNumber(int n){
		
		
		while(n!=0){
			
			int rem = n%10;
			reverse = reverse*10+rem;
			
			n=n/10;
		}
	
		System.out.println("reverse of the given number is " +reverse);
	}
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number to reverse");
		
		int r = Integer.parseInt(br.readLine());
		
		ReverseNumber rev = new ReverseNumber();
		
		rev.reverseNumber(r);
		

	}

}
