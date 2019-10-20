package org.maven.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	
	
	
	@Test
	public void getData(){
		
		String text="";
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		WebElement tBody = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/table"));
		
		List<WebElement> tRow = tBody.findElements(By.tagName("tr"));
		
		int rowCount = tRow.size();
		
		for(int row=0; row<rowCount; row++){
			
			List<WebElement> tCol = tRow.get(row).findElements(By.tagName("td"));
			
			int colCount = tCol.size();
			
			for(int col=0; col<colCount; col++){
				
				
				text=tCol.get(col).getText();
				
				System.out.println(text);
			}
			
		}
		
		
		
		
	}

}
