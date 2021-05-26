package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Action;
import baseLayer.baseclass;

public class Timeage extends baseclass {
	
	
	@FindBy(xpath="//b[contains(text(),'Time')]")
	WebElement Time;
	
	@FindBy(xpath="//a[@id='menu_admin_ProjectInfo']")
	WebElement projrctInfo;
	
	@FindBy(xpath="//a[@id='menu_admin_viewCustomers']")
	WebElement Customers;
	
	@FindBy(xpath="//input[@type='checkbox'][@id='ohrmList_chkSelectRecord_7']")
	WebElement checkbox ;
	
	@FindBy(xpath="//input[@id='btnDelete']")
	WebElement delete ;
	
	
	public Timeage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void Time() {
		Action.MouseOverOnElement(Time);
	}
	
	public void ProjrctInfo() {
		
		Action.MouseOverOnElement(projrctInfo);
	}
	
	public void Customer() {
		Customers.click();
	}
	
	public boolean Checkboxx() {
		
		checkbox.isSelected();
		return false;
	}
	
     public void Delete() {
	   
	   checkbox.click();
	   delete.click();
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
