package com.flipkart.stepdefs;

import org.openqa.selenium.WebDriver;

import com.flipkart.pages.DriverFactory;
import com.flipkart.pages.FlipkartHomePage;
import com.flipkart.pages.FlipkartLoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
	WebDriver driver;

	@Given("navigate to flipkart loginpage")
	public void navigate_to_flipkart_loginpage() {
		DriverFactory driverFactory = new DriverFactory();
		driver = driverFactory.createDriver();
		driver.get("http://www.flipkart.com");
		FlipkartHomePage homePage = new FlipkartHomePage(driver);
		homePage.clickOnLogin();
	}

	@When("enter username {string} and password {string}")
	public void enter_username_and_password_and_click_on_login(String string, String string2) {
		FlipkartLoginPage loginpage = new FlipkartLoginPage(driver);
		loginpage.enterUsernameAndPassword(string, string2);
	}

	@And("click on login")
	public void click_on_login() {
		FlipkartLoginPage loginpage = new FlipkartLoginPage(driver);
		loginpage.clickOnLoginButton();
	}

	@Then("login should be succesfull")
	public void login_should_be_succesfull() {
	}

}
