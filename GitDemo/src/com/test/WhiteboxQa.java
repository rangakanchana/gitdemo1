package com.test;

import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WhiteboxQa {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite(){
		
		driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/");
	}
	@Test
	public void verifyTitle(){
		
		//System.out.println(driver.getTitle());
		
		assertTrue(driver.getTitle().contains("QA/QE/SDET Training."));
	}
	@AfterSuite
    public void afterSuite(){
		driver.quit();
	}
	
	
	

}
