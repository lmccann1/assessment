package com.qa.orange.orange;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

public class loginpage {
	@FindBy(id = "txtUsername")
	private WebElement Username;
	@FindBy(id = "txtPassword")
	private WebElement Password;
	@FindBy (id = "btnLogin")
	private WebElement Login;
	
	public void enterUsername(WebDriver driver){
		Username.sendKeys("Admin");
	}
	public void enterPassword(WebDriver driver){
		Password.sendKeys("AdminAdmin");
	}
	public void clickLogin(WebDriver driver){
		Login.click();
	}
}
