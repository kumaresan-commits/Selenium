package org.maven.project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestDriver {

	
	@Test
	public void TestPractice() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		/*driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		Thread.sleep(3000);
		//driver.findElement(By.id("timingAlert")).click();
		driver.findEleme5nt(By.xpath("//*[@id='timingAlert']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		
		*/
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		driver.findElement(By.name("firstname")).sendKeys("local");
		
		
		Actions actions = new Actions(driver);
		
		WebElement element = driver.findElement(By.id(""));
		
		actions.doubleClick(element).perform();
		actions.contextClick().perform();
		
		
		
		
		
		
		Actions action = new Actions(driver);
		
		WebElement ele1 = driver.findElement(By.id(""));
		
		action.doubleClick(ele1).perform();
		action.contextClick(ele1).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
