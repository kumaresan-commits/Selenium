package org.maven.project;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Gmail {

	
	
	
	
	@Test(priority=1)
	
	public void callBrowser1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		Map<String,Object> prefs = new HashMap();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://mail.google.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("REST");
		
		Set<String> allWindows = driver.getWindowHandles();
		
		String[] individualHandle = new String[allWindows.size()];
		
		Iterator itr = allWindows.iterator();
		
		int i=0;
		 
		while(itr.hasNext()){
			
			individualHandle[i] = (String) itr.next();
			
			if(i==3){
				
				driver.switchTo().window(individualHandle[3]);
				break;
			}
			
			i++;
		}
		
		
		
		
		
		 
	}
	
}
