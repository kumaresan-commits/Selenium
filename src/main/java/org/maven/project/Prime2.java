package org.maven.project;

import org.testng.annotations.Test;

public class Prime2 {

	int n=10,temp=0;
	@Test
	public void main1() {
		
	
	
	int m=n/2;
	
	
	
	if(n==0||n==1){
		
		System.out.println("Not Prime");
		
	}else{
		
		
		for(int i=2; i<m; i++){
			
			if(n%2==0){
				
				System.out.println("Not prime Number");
				temp=1;
				break;
				
			}
		}
		
		if(temp==0){
			
			
			System.out.println("Prime number");
		}
		
	}
	
	
				
		
	}

}
