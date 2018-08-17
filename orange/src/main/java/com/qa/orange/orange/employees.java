package com.qa.orange.orange;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class employees {
	@FindBy(id = "menu_pim_addEmployee")
	private WebElement EmpTab;
	
	@FindBy(id = "firstName")
	private WebElement fname;
	
	@FindBy(id = "middleName")
	private WebElement mname;
	
	@FindBy(id = "lastName")
	private WebElement lname;
	
	//@FindBy(id = "employeeId")
	//private WebElement emp_id;
	
	@FindBy(id = "location_inputfileddiv")
	private WebElement location;
	
	@FindBy(id = "hasLoginDetails")
	private WebElement checkbox;
	
	@FindBy(id = "username")
	private WebElement usernamebox;
	
	@FindBy(id = "status_inputfileddiv")
	private WebElement status;
	
	@FindBy(id = "password")
	private WebElement passwordbox;
	
	@FindBy(id = "confirmPassword")
	private WebElement confBox;
	
	@FindBy(id = "essRoleId_inputfileddiv")
	private WebElement ess;
	
	@FindBy(id = "supervisorRoleId_inputfileddiv")
	private WebElement role;
	
	@FindBy(id = "adminRoleId_inputfileddiv")
	private WebElement adrole;
	
	@FindBy(id = "systemUserSaveBtn")
	private WebElement savebtn;
	
	//@FindBy(id = "employee_name_quick_filter_employee_list_value")
	//private WebElement searchEmp;
	
	//@FindBy(id = "employeeListTable")
	//private WebElement selectEmp;

	
	
public void  clickEmp(WebDriver driver){
	EmpTab.click();
	}
public void enterfn(WebDriver driver){
	fname.sendKeys("John");
}
public void entermn(WebDriver driver){
	mname.sendKeys("James");
}
public void enterln(WebDriver driver){
	lname.sendKeys("Smith");
}
//public void enterid(WebDriver driver){
	//emp_id.sendKeys("7777");
//}
//public void clickLocation(WebDriver driver){
	//location.click();
//}
public void clickCheckBox(WebDriver driver){
	checkbox.click();
}
public void enterUser(WebDriver driver){
	usernamebox.sendKeys("test");
}
public void enterStatus(WebDriver driver){
	status.click();
}
public void enterPassword(WebDriver driver){
	passwordbox.sendKeys("test");
}
public void cPassword(WebDriver driver){
	confBox.sendKeys("test");
}
public void essrole(WebDriver driver){
	ess.click();
}
public void srole(WebDriver driver){
	role.click();
}
public void arole(WebDriver driver){
	adrole.click();
}
public void save(WebDriver driver){
	savebtn.click();
}
//public void search(WebDriver driver){
//	searchEmp.sendKeys("John");
	//searchEmp.submit();
//}
//public void selectEmp(WebDriver driver){
//	selectEmp.click();
//}



}
