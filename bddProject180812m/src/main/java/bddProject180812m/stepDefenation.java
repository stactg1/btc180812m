package bddProject180812m;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefenation {
	ChromeDriver dr;
	@Given("^OpenBrowser$")
	
	public void openbrowser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/water/Downloads/chromedriver");
		dr = new ChromeDriver();
	}

	@Given("^navigate to facebook URL$")
	public void navigate_to_facebook_URL() throws Throwable {
		dr.get("https://www.facebook.com");
	   
	}

	@When("^User type userID on UserID textbox$")
	public void user_type_userID_on_UserID_textbox() throws Throwable {
		dr.findElement(By.id("email")).sendKeys("UserID");
	   
	}

	@When("^User type password on password box$")
	public void user_type_password_on_password_box() throws Throwable {
	  dr.findElement(By.id("pass")).sendKeys("UserId");
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
		dr.findElement(By.id("u_O_2")).click();
	 
	}

	@Then("^User should be in profile page$")
	public void user_should_be_in_profile_page() throws Throwable {
		System.out.println("i am in profile page");
	   
	}



}
