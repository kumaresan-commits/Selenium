package org.maven.project;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence");
		String s = sc.nextLine();
		String s2[] =null;
		s2 = s.split("\\s");
		
		String s3 ="";
		
		for(int i=s2.length-1; i>=0; i--){
			
			s3= s3+s2[i]+" ";
			
		}
		
		System.out.println(s3);

	}

}
