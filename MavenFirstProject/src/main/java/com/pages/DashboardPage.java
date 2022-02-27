package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

   WebDriver dpdriver; 
	
	public DashboardPage(WebDriver driver) {
		this.dpdriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1")
	WebElement header;
	
	@FindBy(xpath="//span[text()='Users']")
	WebElement userBtn;
	
	public boolean verifyHeader() {
		return header.isDisplayed();
	}
	
	public UserPage clickUser() {
		userBtn.click();
		return new UserPage(dpdriver);
	}
	
}
