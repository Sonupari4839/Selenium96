package com.pom.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.actitime.Helper;

public class LoginPage 
{
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement userTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordtextfield;
	
	@FindBy(id="keepLoggedInLabel")
	private WebElement keepLoggedInLabel;
	
	@FindBy(id="loginButtonContainer")
	private WebElement loginButtonContainer;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgoryourpasswordlink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeLink;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void LoginMethod() throws InterruptedException 
	{
		Helper.highlightelement(driver, userTextfield);
		userTextfield.sendKeys("admin");
		Helper.highlightelement(driver, passwordtextfield);
		passwordtextfield.sendKeys("manager");
		keepLoggedInLabel.click();
		loginButtonContainer.click();
	}
	public void forgotpasswordlinkMethod() 
	{
		forgoryourpasswordlink.click();
	}
	public void actitimeLinkMethod() 
	{
		actitimeLink.click();
	}
	}



