package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.utils;
import baseLayer.baseclass;

public class Directory extends baseclass {
	@FindBy(xpath="//b[contains(text(),'Directory')]")
	WebElement   Directory;
	
	@FindBy(xpath="//input[@id='searchDirectory_emp_name_empName']")
	WebElement empname ;
	
	@FindBy(xpath="//select[@id='searchDirectory_job_title']")
	WebElement jobtitle;
	
	@FindBy(xpath="//select[@id='searchDirectory_location']")
	WebElement    location ;
	
	@FindBy(xpath="//input[@id='searchBtn']")
	WebElement serachbtn;
	
	public Directory () {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickonDirectory() {
		Directory.click();
	}
    public void enterText(String name) {
    	empname.sendKeys(name);
    }
    
    public void jobTitle(int title) {
    	utils.selectbyindex(jobtitle, title);
    }
    public void locationn(int num) {
    	utils.selectbyindex(location, num);
    }
    
    public void ClickOnSearch() {
    	serachbtn.click();
    }
    
  
    
    
}
