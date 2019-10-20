package org.maven.project;

import java.util.Scanner;

public class BubbleSort {
	
	//int arr[] = {10,2,6,99};
	
	int temp=0;
	
			
	public void sort(int arr[]){
		int n =arr.length;
	
	for(int i=0; i<n; i++){
		
		for(int j=1; j<(n-i); j++){
			
			if(arr[j-1]>arr[j]){
				
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j] = temp;
			}
		}
	}
	
	for(int i=0; i<arr.length; i++){
		System.out.print(arr[i]+" ");
	}
	}
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n = sc.nextInt();
		
		System.out.println("Enter element in the array");
		
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++){
			
			arr[i] = sc.nextInt();
		}
		
		BubbleSort bs = new BubbleSort();
		bs.sort(arr);
	}
	
	
	
	
	
	
	
}
