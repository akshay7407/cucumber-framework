package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Action;
import Utils.utils;
import baseLayer.baseclass;

public class Homepage extends baseclass {
	 Actions act;

	@FindBy(xpath="//b[contains(text(),'Admin')]")
	WebElement admin;
	
	@FindBy (xpath="//a[@id='menu_admin_UserManagement']")
	WebElement usermanagement;
	
	@FindBy(xpath="//a[@id='menu_admin_viewSystemUsers']")
	WebElement users;
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
	WebElement logo;
	
	
	@FindBy(xpath="//input[@id='btnAdd']")
	WebElement addbutton;
	
	@FindBy(xpath="//select[@id='systemUser_userType']")
	WebElement dropdown1;
	
	@FindBy(xpath="//input[@id='systemUser_employeeName_empName']")
	WebElement entername;
	
	@FindBy(xpath="//input[@id='systemUser_userName']")
	WebElement systemusername;
	
	@FindBy(xpath="//select[@id='systemUser_status']")
	
	WebElement dropdown2;
	@FindBy(xpath="//input[@id='systemUser_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='systemUser_confirmPassword']")
    WebElement connfirmpass;
	
	@FindBy (xpath="//input[@id='btnSave']")
	WebElement save;
	
	
	public Homepage () {
		PageFactory.initElements(driver, this);
	}
	 public void adminclick() {
		 
		 act=new Actions(driver);
		 
		 act.moveToElement(admin).build().perform();
		 act.moveToElement(usermanagement);
		 act.moveToElement(users).click().build().perform();
	 
	 }
	 public void addbuttonn() {
		 addbutton.click();
	 }
	public void enterinfo(String name,String username,String pass,String cpass,int drop1,int drop2) {
		
		
		utils.selectbyindex(dropdown1,drop1);
		entername.sendKeys(name);
		systemusername.sendKeys(username);
		utils.selectbyindex(dropdown1, drop2);
		connfirmpass.sendKeys(cpass);
		password.sendKeys(pass);
		Action.clickOnElement(save);
	}
	
	public boolean loggo() {
		return logo.isDisplayed();
	}

}
