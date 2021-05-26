package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Javascripex;
import baseLayer.baseclass;

public class hrmloginPage extends baseclass  {
	// POM with page story

			@FindBy(name= "txtUsername")
			WebElement username;

			@FindBy(id= "txtPassword")
			WebElement password;

			@FindBy(name ="Submit")
			WebElement loginButton;

			public hrmloginPage() {
				PageFactory.initElements(driver, this);
			}

			// assiociated methods
			public void loginFunctionality(String uname, String pass) {
				username.sendKeys(uname);
				password.sendKeys(pass);
				Javascripex.ClickonElementUsingJS(loginButton);
				
				
			}
           public   String url() {
        	   return driver.getCurrentUrl();
           }
           
          public String Title() {
        	  return driver.getTitle();
          }

}
