package com.mystore.testcases;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
i
import com.mystore.utilies.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Baseclass { 
	
	Readconfig readconfig=new Readconfig();
	
	String url=readconfig.getBaseUrl();
	
	String browser=readconfig.getBrowser();
	
	
	public static WebDriver driver;
	
	public static Logger logger;
	@BeforeClass
	public void setup()
	{
		
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
			
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;	
		
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new EdgeDriver();
			break;	
			
		}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			logger=LogManager.getLogger("Mystore");
			
		}
	     @AfterClass
		public void tearDown()
		{
			driver.close();
			driver.quit();
		}
	     

	   public void captureScreenShot(WebDriver driver, String testName)
	   {
		  TakesScreenshot screenshot=((TakesScreenshot)driver); 
		  
		  File src=screenshot.getScreenshotAs(OutputType.FILE);
		  
		  File dest=new File(System.getProperty("user.dir"+ "//Screenshots//" +testName + ".png"));
		  
		  FileUtils.copyFile(src, dest);
		   
	   }
	   
}	   
	


