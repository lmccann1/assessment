package com.qa.orange.orange;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

public class dashboard {
	@FindBy(id = "menu_pim_viewPimModule")
	private WebElement PIMTab;
	@FindBy(id = "menu_pim_addEmployee")
	private WebElement EmpTab;

	public void clickTab(WebDriver driver){
		PIMTab.click();
		
	}
	
	//	public void  clickEmp(WebDriver driver){
	//	EmpTab.click();
	//}

}
