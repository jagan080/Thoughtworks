package com.selenium.tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.selenium.common.TestConstants;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver = null;
	@BeforeMethod
	public void initialize() throws IOException{
			
		//chrome
		 System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");

		   driver = new ChromeDriver();
		
		
		//To maximize browser
                driver.manage().window().maximize();
	        //Implicit wait
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//To open flipkart
                driver.get(TestConstants.URL);
		
	}
	
	@AfterMethod
	//Test cleanup
	public void TeardownTest()
    {
        TestBase.driver.quit();
    }

}
