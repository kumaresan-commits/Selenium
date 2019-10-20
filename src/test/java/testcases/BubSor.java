package testcases;

public class BubSor {

	public static void main(String[] args) {
		
		int arr[] = {10,20,0,50,5};
		int temp=0;
		int n =arr.length;
		for(int i=0; i<n; i++){
			
			for(int j=1; j<(n-i); j++){
				
				
				if(arr[j-1]>arr[j]){
					
					temp =arr[j-1];
					arr[j-1]=arr[j];
					arr[j] = temp;
				}
			}
			
			
			
		}
		for(int i=0; i<arr.length; i++){
			
			System.out.println(arr[i]);
		}	

	}

}
