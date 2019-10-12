package org.maven.project;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Net {
	
	
	@Test
	public void set(){
		RemoteWebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
	}

}
