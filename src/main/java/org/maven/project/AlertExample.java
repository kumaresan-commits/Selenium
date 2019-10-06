package org.maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertExample {
	
	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		//WebDriverWait wait = new WebDriverWait(driver,20);
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='content']/p[3]/button")));
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='content']/p[3]/button")).click();
		
		
		
		
		
		
	}

}
