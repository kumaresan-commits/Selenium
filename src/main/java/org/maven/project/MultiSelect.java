package org.maven.project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiSelect {
	
	
	
	@Test
	
	@Parameters("Browser")
	public void multiSelect(){
		
		String Browser="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Browser name ");
		 
		Browser = sc.nextLine();
		
		RemoteWebDriver driver = null;
		
		if(Browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		
		Map<String , Object> prefs = new HashMap();
		prefs.put("profile.defaul_content_setting_values", 2);
		
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", prefs);
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form");
		
		}else if(Browser.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			
			FirefoxOptions options = new FirefoxOptions();
			options.addPreference("dom.disable_beforeunload", true);
			
			 driver = new FirefoxDriver(options);
			
			driver.get("https://www.toolsqa.com/automation-practice-form");
			
		}
		
		
		Select select = new Select(driver.findElementById("continentsmultiple"));
		
		List<WebElement> all = select.getOptions();
		
		for(int i=0; i<all.size(); i++){
			
			String value = all.get(i).getText();
			System.out.println(value);
			
			
			
			
		}
		
		
		
		select.selectByIndex(1);
		select.selectByIndex(2);
		
	}
	

}
