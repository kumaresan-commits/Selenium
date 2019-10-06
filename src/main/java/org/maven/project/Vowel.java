package org.maven.project;

public class Vowel {

	public static void main(String[] args) {
		
		String s1 = "alert";
		int count =0;
				
	for(int i=0; i<s1.length()-1; i++){
		
		
		char ch = s1.charAt(i);
		
		if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'){
			 
			++count;
			
		}
		
		
		
	}
	
	System.out.println(count);
	}

}
