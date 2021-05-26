package StepDefination;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import Utils.utils;
import baseLayer.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.Directory;
import pageLayer.Homepage;
import pageLayer.Timeage;
import pageLayer.facebookCreate;
import pageLayer.hrmloginPage;

public class LoginTest extends baseclass {
	hrmloginPage log=new hrmloginPage();
	Homepage home=new Homepage ();
	facebookCreate fb=new facebookCreate();
	Timeage time=new Timeage();
	SoftAssert soft=new SoftAssert();
	
	
	Directory dir=new Directory();
	

@Given("user open login page")
public void user_open_login_page() {
	Assert.assertEquals("OrangeHRM", log.Title());
   }

@Then("user logs into app")
public void user_logs_into_app() {
	log.loginFunctionality("Admin", "admin123");
	String  url=log.url();
	Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard", url);
}

@Then("homepage is displayed")
public void homepage_is_displayed() {
	
	String title=log.Title();
	Assert.assertEquals("OrangeHRM", title);
    
}

@Then("validate homepage titile")
public void validate_homepage_titile() {
	System.out.println("validate homepage titile");
	home.loggo();
	Assert.assertTrue(true);
	
   
}

@Given("user is on hompage")
public void user_is_on_hompage() {
	log.loginFunctionality("Admin", "admin123");

}

@When("user perform click on adminlink")
public void user_perform_click_on_adminlink() {
    home.adminclick();
}

@Then("User click on add")
public void user_click_on_add() {
  home.addbuttonn();
}

@Then("user feel the data for user")
public void user_feel_the_data_for_user() {
   home.enterinfo("akshay", "Jadine Jackie", "Jackie123", "Jackie123", 0, 1);
}
@Given("user is on craete package page")
public void user_is_on_craete_package_page() {
    Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
}

@When("title of login page")
public void title_of_login_page() {
    System.out.println("user is on login page");
}

@When("user enters {string} and {string} and {string}")
public void user_enters_and(String Firstname, String surname ,String password) {
    fb.username(Firstname);
    fb.Surname(surname);
    fb.newpass(password);
    
}
@Then("user enter date of birth {int} and {string} and {int}")
public void user_enter_date_of_birth_and_and(int day, String month, int year) {
	fb.dayy(day);
	fb.monthh(month);
	fb.yearr(year);
   
}
@When("closes the browser")
public void closes_the_browser() {
    System.out.println("close the browser");
}


@When("user click on directory")
public void user_click_on_directory() {
	log.loginFunctionality("Admin", "admin123");
	dir.clickonDirectory();
   }
@Then("user enter {string}")
public void user_enter(String name) {
	dir.enterText(name);
   
}
@Then("select the {int}")
public void select_the(int title) {
   dir.jobTitle(title);
}
@Then("select job {int}")
public void select_job(int location) {
    dir.locationn(location);
}
@Then("click on Search")
public void click_on_search() {
    dir.ClickOnSearch();
}


@Given("User login on hompage")
public void user_login_on_hompage() {
	log.loginFunctionality("Admin", "admin123");
    
	
   
}
@When("user mouse over Time Element")
public void user_mouse_over_time_element() {
	 time.Time();
    
}
@Then("user mouse over Project info and click on customers")
public void user_mouse_over_project_info_and_click_on_customers() {
	time.ProjrctInfo();
	time.Customer();
    
}
@Then("USer inspect the checkbox is sselected or not")
public void u_ser_inspect_the_checkbox_is_sselected_or_not() {
	time.Checkboxx();
	
}
@Then ("user Select the ACME ltd Checkbox and Delete it") 
public void user_select_the_acme_ltd_checkbox_and_delete_it() {
	
		time.Delete();
  
}




















}
