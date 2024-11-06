package com.CRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
   //Rule -1: Create Seperate java class for webPage


public class LoginPage {
	
		//Rule -2: Object Initialization
	public LoginPage(WebDriver driver){
		//this.driver=driver;
		PageFactory.initElements(driver,this);
	
		//Rule -3: Object Identification
		
	}
	@FindBy(name="user_name")
	private WebElement usernametxt;
	
	@FindBy(name="user_password")
	private WebElement passwordtxt;
	
	@FindBy(id="submitButton")
	private WebElement loginbutton;
	
	//Rule -4: Object Encapsulation(Provide Getters)

	public WebElement getUsernametxt() {
		return usernametxt;
	}

	public WebElement getPasswordtxt() {
		return passwordtxt;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	//Rule -5: Object Utilization
	public void login(String username,String password) {
//		usernametxt.sendKeys(username);
//		passwordtxt.sendKeys(password);
//		loginbutton.click();	
		getUsernametxt().sendKeys(username);
		getPasswordtxt().sendKeys(password);
		getLoginbutton().click();
		
	}
	
	
	
	
	
	
	
}
