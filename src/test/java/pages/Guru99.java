package pages;

import java.io.IOException;

import wrappers.CommonWrappers;


public class Guru99 extends CommonWrappers {

	public Guru99 enterUserName(String name,String userName) throws IOException{
		
		try {
			System.out.println(pro.getProperty("LoginPage.userName"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		extentLog(enterByName(name, userName), "Entered Successful", "Not Entered successfully");
		
		return new Guru99();
		
	}
	
}
