package com.flipkart.pages;

import org.openqa.selenium.WebDriver;

public class FlipkartLoginPage extends WebPage {

	private String usernameXpath = "//input[@class='_2IX_2- VJZDxU']";
	private String passwordXpath = "//input[@type='password']";
	private String loginButtonXpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']";
	private String errorMessageXpath = "//span[@class='_2YULOR']";

	public FlipkartLoginPage(WebDriver driver) {
		super(driver);
	}

	public void username(String username) {
		super.enterText(usernameXpath, username);
	}

	public void password(String password) {
		super.enterText(passwordXpath, password);
	}

	public void enterUsernameAndPassword(String username, String password) {
		username(username);
		password(password);
	}

	public void clickOnLoginButton() {
		super.click(loginButtonXpath);
	}

	public boolean displayErrorMessaage() {
		return super.isDisplayed(errorMessageXpath);
	}

}
