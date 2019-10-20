package testcases;

import org.testng.annotations.Test;

public class A {
	
	
	public void print(int a){
		
		try {
			System.out.println("Hi");
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public void Exception1(){
		
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public void m1(){
		
		int[] a = {7,8,9,10,11};
		
		String[][] s= {{"kumareasan","Rani"},{"uma","sheela"}};
		
		String s1 = new String("welcome to the club");
		
		String vl = "what are you";
		
		System.out.println(a[0]);
		
		for(int i=0; i<s.length; i++){
			
			for(int j=0; j<s.length;j++){
			
			System.out.println(s[i][j]);
			
			}
		}
		
		System.out.println(s1.substring(1,4));
		System.out.println(s1.contains("elc"));
		
		
		String s2[]=null;
				
				s2=vl.split("\\s");
		
		String s3 ="";
		
		for(int i=s2.length-1; i>=0; i-- ){
			
			
			s3 = s3+s2[i]+" ";
			
		}
		
		System.out.println(s3);
		
		
		
		
		
		
		
		
		
	}

}
