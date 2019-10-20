package org.maven.project;

public class Palin2 {

	public static void main(String[] args) {
		
		int number=535, reverse=0;
		
		int temp = number;
		
		while(number!=0){
			
			int r = number%10;
			reverse = (reverse *10)+r;
			number = number/10;
			
		}

		if(reverse==temp){
			
			System.out.println("number is palindrome");
		}else{
			
			System.out.println("number is not palindrome");
		}
	}

}
