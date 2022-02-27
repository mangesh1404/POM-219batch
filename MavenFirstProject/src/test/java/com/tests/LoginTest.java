package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.UserPage;

public class LoginTest {

	WebDriver driver=null;
	
	@Test
	public void loginTest() {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/Offline%20Website/index.html");	
		LoginPage lp = new LoginPage(driver);
		
		DashboardPage dp = lp.validLogin();
		
		UserPage up = dp.clickUser();
		
		
	}
	
}
