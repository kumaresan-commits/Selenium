package org.maven.project;


import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeOptions1 {
	
	
	@Test
	public void callBrowser(){
		
		RemoteWebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		Map<String,Object> prefs = new HashMap();
		prefs.put("profile.default_content_setting_values", 2);
		
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", prefs);
		
		driver = new ChromeDriver(option);
		driver.get("https://demoqa.com/menu/");
		
		WebElement tutorialMenu= driver.findElement(By.xpath("//*[@id='ui-id-4']/span"));
		Actions action = new Actions(driver);
		action.moveToElement(tutorialMenu).perform();
		
		driver.findElementByLinkText("Droppable").click();
		
		WebElement draggable = driver.findElementByXPath("//*[@id='draggable']/p");
		WebElement dropLoc = driver.findElementByXPath("//*[@id='droppable']/p");
		
		action.clickAndHold(draggable).release(dropLoc).build().perform();
		
		 
				
				driver.findElementByLinkText("Draggable").click();
				
				WebElement drag = driver.findElementByXPath("//*[@id='draggable']/p");
		 
		Point point = drag.getLocation();
		
		int xCord = point.getX(); //185
		int yCord = point.getY(); //426
	
		
		System.out.println(xCord+ "Gap" +yCord);
		
		action.dragAndDropBy(drag, 100, 100).perform();
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
