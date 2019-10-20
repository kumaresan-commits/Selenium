package org.maven.project;

import java.util.Scanner;

public class CopyArray {

	public static void copyArray(int arr1[]){
		
		int arr2[] = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++){
			
			arr2[i] = arr1[i];
			
			System.out.println(arr2[i]);
		}
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter element to array ");
		int arr1[] = new int[n];
		for(int i=0;i<arr1.length;i++){
			
			arr1[i]=sc.nextInt();
		}
		CopyArray c1 = new CopyArray();
		c1.copyArray(arr1);
		

	}

}
