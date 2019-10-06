package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Guru99;

public class TC001_Gruru99Login extends Guru99 {

	
	
	Guru99 g99 = new Guru99();
	@BeforeClass
	public void beforeClass() throws FileNotFoundException{
		
		g99.startTest("login", "Guru99Login");
	}
	
	@Test
	public void verifyLogin() throws IOException{
	
		
		
		g99.invokeBrowser("http://demo.guru99.com/V4/");
		g99.enterUserName("uid", "kumar");
	
	
	}
	
	@AfterClass
	public void afterClass(){
		
		g99.endTest();
		
	}
	
	
}
