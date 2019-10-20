package org.maven.project;

import org.testng.annotations.Test;

public class Fib2 {
	
	
	@Test
	public void fib(){
		
		int n=5, n1=0, n2=1,n3=0;
		
		System.out.print(n1+""+n2);
		
		for(int i=0; i<=n; i++){
			
			n3=n1+n2;
			System.out.print(n3);
			n1=n2;
			n2=n3;
			
			
			
			
		}
	}

}
