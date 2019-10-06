package org.maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
	
	WebDriver driver; 
	
	@Test(priority=1)
	public void callBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("REST");
		 
	}
	


}
