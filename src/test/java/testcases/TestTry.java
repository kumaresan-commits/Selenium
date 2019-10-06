package testcases;

import org.testng.annotations.Test;

public class TestTry {
	
	

		@Test
		public void print(){
			
			try{
			for(int i=0; i<10; i++){
				
				System.out.println("ff");
				
			}
			
			}finally{
				
				System.out.println("555");
			}
		
	
		
}
}