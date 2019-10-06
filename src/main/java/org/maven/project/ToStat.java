package org.maven.project;

public class ToStat {

	
	private static int a=10;
	public int b=30;
	public static int c=50;
	
	class NestedClass{
		
		public void display(){
			
			System.out.println(a+b+c);
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ToStat ts = new ToStat();
		
		ToStat.NestedClass to =ts.new NestedClass();
		
		
	
		to.display();
	

	}

}
