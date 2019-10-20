package org.maven.project;

public class LargeNumberArray {
	
	
	static int s=10;
	
	int r=4;
	
	public static void print(){
		
		
		s=5;
	}
	
	

	public static void main(String[] args) {
		
		int arr[] = {20,45,94,1,5000,5};
		
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++){
			
			if(arr[i]>max)
			
				max=arr[i];
		}
		
		System.out.println("largest number is " +max);
		

	}

}
