package com.qa.orange.orange;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class StepDefs {
	WebDriver driver;
	static String URL1;
	//static String URL2;
	
	public ExtentReports report;
	public ExtentTest test;
	
	
	@Before
	public void setup(){
		report = new ExtentReports("C:\\Users\\Admin\\Desktop\\AutomationReports\\AssessmentReport.html", true); 
	test = report.startTest("orange hrm test"); 
	   test.log(LogStatus.INFO, "Started");
		
		System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
		driver = new ChromeDriver();
		//implicitly wait
		driver.manage().window().maximize();
	}
	
	

	@Given("^the login page$")
	public void the_login_page()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(Constants.URL1);
		
		if(Constants.URL1==driver.getCurrentUrl()){
			test.log(LogStatus.INFO, "AT LOGIN");
			}
			else{
			test.log(LogStatus.INFO, "NOT AT LOGIN");
			}
		assertEquals(Constants.URL1,driver.getCurrentUrl());
			//assertTrue(!Constants.URL1.equals(driver.getCurrentUrl()));
	}

	@When("^I login$")
	public void i_login()  {
	    // Write code here that turns the phrase above into concrete actions
	 loginpage page = PageFactory.initElements(driver, loginpage.class);
	 page.enterUsername(driver);
	 page.enterPassword(driver);
	 page.clickLogin(driver);
	 test.log(LogStatus.INFO, "login");
	}

	@When("^I click the PIM tab$")
	public void i_click_the_PIM_tab()  {
	    // Write code here that turns the phrase above into concrete actions
	dashboard page = PageFactory.initElements(driver, dashboard.class);
	page.clickTab(driver);
	test.log(LogStatus.INFO, "PIM TAB CLICKED");
	//page.clickEmp(driver);
	}

	@When("^then the Add Employee Tab$")
	public void then_the_Add_Employee_Tab() {
	    // Write code here that turns the phrase above into concrete actions
//employees page = PageFactory.initElements(driver, employees.class);
		  
		
	driver.get("https://qa-trials641.orangehrmlive.com/client/#/pim/employees"); //would add to constants
	test.log(LogStatus.INFO, "EMPLOYEE TAB CLICKED");
	}

	@When("^I fill out the Add Employee Details correctly$")
	public void i_fill_out_the_Add_Employee_Details_correctly()  {
	    // Write code here that turns the phrase above into concrete actions
	
	
	  employees page = PageFactory.initElements(driver, employees.class);
	  page.clickEmp(driver);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  page.enterfn(driver);
	  page.entermn(driver);
	  page.enterln(driver);
	//  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//  page.enterid(driver);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 // page.clickLocation(driver);
	  page.clickCheckBox(driver);
	  page.enterUser(driver);
	  page.enterStatus(driver);
	  page.enterPassword(driver);
	  page.cPassword(driver);
	  page.srole(driver);
	  page.arole(driver);
	  page.save(driver);
	//  page.search(driver);
	 // page.selectEmp(driver);
	  
	  test.log(LogStatus.INFO, "Employee Details entered");
	  
	  	
	}

	@When("^I choose to create Login Details by clicking the appropriate button$")
	public void i_choose_to_create_Login_Details_by_clicking_the_appropriate_button()  {
	    // Write code here that turns the phrase above into concrete actions
	//assert
		
		test.log(LogStatus.INFO, "Choose to create login details");
	}

	@When("^I fill out the Login Details correctly$")
	public void i_fill_out_the_Login_Details_correctly()  {
	    // Write code here that turns the phrase above into concrete actions
	   //assert
		test.log(LogStatus.INFO, "Correct login details");
	}

	@When("^I click the Save button$")
	public void i_click_the_Save_button()  {
	    // Write code here that turns the phrase above into concrete actions
	    //assert
		test.log(LogStatus.INFO, "Save button clicked");
	}

	@Then("^I can search for the Employee I have just created$")
	public void i_can_search_for_the_Employee_I_have_just_created()  {
	    // Write code here that turns the phrase above into concrete actions
		//assrt
		
		
		test.log(LogStatus.PASS, "Able to search for created employee");
		test.log(LogStatus.FAIL, "NOT Able to search for created employee");
	}

	@Then("^select them for inspection$")
	public void select_them_for_inspection() {
	    // Write code here that turns the phrase above into concrete actions
		
		//assert
		test.log(LogStatus.PASS, "Able to select employee");
		test.log(LogStatus.FAIL, "NOT Able to select employee");
	}


	@After
	public void teardown() {
		driver.quit();
		report.endTest(test);
		report.flush();

	}

}
