package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utils.utils;
import baseLayer.baseclass;

public class facebookCreate extends baseclass {
	@FindBy(name="firstname")
	WebElement firstname    ;
	
	@FindBy(name="lastname")
	WebElement   surname  ;
	
	@FindBy(name="reg_email__")
	WebElement  mobilenumber   ;
	
	@FindBy(xpath="//input[@id='password_step_input']")
	WebElement  newPass   ;
	
	@FindBy(xpath="//select[@id='day']")
	WebElement  dayy   ;
	
	@FindBy(xpath="//select[@id='month']")
	WebElement  monthh   ;
	
	@FindBy(xpath="//select[@id='year']")
	WebElement  yearr   ;
	
	public facebookCreate() {
		
		PageFactory.initElements(driver, this);
	}

	public  void username(String name)
	{
		firstname.sendKeys(name);
	
	}

	public void Surname(String surnamee) {
		surname.sendKeys(surnamee);
	}
	
	public void mobile(String mobile) {
		mobilenumber.sendKeys(mobile);
	}
	
	public void newpass(String Pass) {
		newPass.sendKeys(Pass);
	}
	
	public void dayy(int day) {
		utils.selectbyindex(dayy, day);
	}
	
	public void monthh(String month) {
		utils.selectbyText(monthh, month);
}
		public void yearr(int year) {
		utils.selectbyindex(yearr, year);
	}
	
	
}
