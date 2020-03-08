package pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Payment {

	////th@craftnote.de
	private static final Logger LOGGER = Logger.getLogger(Payment.class);
	WebDriver driver;
	WebDriverWait wait;

	public Payment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(how = How.XPATH, using = "//i[text()='more_horiz']")
	WebElement webbtn_setting;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Company']")
	WebElement input_company;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='First Name']")
	WebElement input_fname;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
	WebElement input_lname;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Phone Number']]")
	WebElement input_phnum;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='E-Mail']")
	WebElement input_email;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Street and House Number']")
	WebElement input_street;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='ZIP Code']]")
	WebElement input_zip;
	
	@FindBy(how = How.XPATH, using = " //input[@placeholder='City']]")
	WebElement input_city;
	
	@FindBy(how = How.XPATH, using = " //div[@class='logo']")
	WebElement img_pageLogo;
	
	@FindBy(how = How.XPATH, using = " //input[@id='mat-input-0']")
	WebElement input_login;
	
	@FindBy(how = How.XPATH, using = " //input[@id='mat-input-1']")
	WebElement input_pass;
	
	
	
	
	@FindBy(how = How.XPATH, using = " //span[contains(text(),'Confirm & Proceed')]")
	WebElement btn_cnf;

	public void navigateTo_HomePage(String home_url) {
		 LOGGER.info("Launch the url on browser to load the Craftsnote homepage");
		 driver.get(home_url);
		 }
	
	public void waituntil(WebElement element)
	{
		 wait=new WebDriverWait(driver, 50);
		 LOGGER.info("wait for all the elements on the page to load");
		 wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waituntilhomepageisloaded()
	{
		waituntil(img_pageLogo);
	}
	
 public String getPageTitle() {
		 
		 String pageTitle = driver.getTitle();
		 return pageTitle;
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
