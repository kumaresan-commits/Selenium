package wrappers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report {
	
	protected RemoteWebDriver driver;
	protected ExtentReports report;
	protected ExtentTest test;
	
	
	public String addScreenshot() throws IOException, FileNotFoundException{
		
		  
		File screenshotFile = driver.getScreenshotAs(OutputType.FILE);
		String	timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
		File screenShotName = new File("./Reports/"+timeStamp+".png"); 
		FileUtils.copyFile(screenshotFile,screenShotName);
		
		String filePath = screenShotName.getPath();
		//String path ="<img width='300px' height='300px' src=\"file://" + filePath+ "\" alt=\"\" />";
		//Reporter.log(path);
		return filePath;	
		
	}
	

	public  void startTest(String fileName,String text) throws FileNotFoundException{
		
		try {
			report = new ExtentReports(System.getProperty("user.dir")+"\\"+fileName+".html");
			test=report.startTest(text);
		} catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void endTest(){
		
		report.endTest(test);
		report.flush();
	}
	public void extentLog(boolean result, String pass,String fail) throws IOException{
		
		String screenShot = test.addScreenCapture(addScreenshot());
		
		try {
			if(result==true){
				
				
				test.log(LogStatus.PASS, pass, screenShot);
			}else{
				
				test.log(LogStatus.FAIL, fail);
			}
		} catch (Exception e) {
			test.log(LogStatus.ERROR, e.toString(), screenShot);
		}
		
		
	}

}
