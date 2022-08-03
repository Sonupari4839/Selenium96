package com.pom.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(id="container_tasks")
	private WebElement tasksLink;
	
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logoutMethod()
	{
		logoutLink.click();
	}
	public void taskMethod() 
	{
		tasksLink.click();
	}
}

