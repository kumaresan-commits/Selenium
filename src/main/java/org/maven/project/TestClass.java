package org.maven.project;

 class TestClass {

	public static void main(String[] args) {
		
		String s = "Pathfinder";
		String s1=s.substring(4);
		System.out.println(s1);
	
		System.out.println(s.substring(4, 10));
		System.out.println(s.contains("ath"));
		
		String s2 = String.join("-", "Path","Finder","Global");
		System.out.println(s2);
	}

}
