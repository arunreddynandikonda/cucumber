package com.flipkart.stepdefs;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.flipkart.pages.DriverFactory;
import com.flipkart.pages.FlipkartHomePage;
import com.flipkart.pages.FlipkartProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartStepDefs {

	private WebDriver driver;

	@Given("navigate to flipkart homepage")
	public void navigate_to_flipkart_homepage() {
		DriverFactory driverFactory = new DriverFactory();
		driver = driverFactory.createDriver();
		driver.get("http://www.flipkart.com");
	}

	@When("search for {string} with minimum price {string} and maximum price {string}")
	public void search_for_with_minimum_price_and_maximum_price(String string, String string2, String string3) {
		FlipkartHomePage homePage = new FlipkartHomePage(driver);
		homePage.searchForTheProduct("mobiles");

		FlipkartProductsPage productsPage = new FlipkartProductsPage(driver);
		productsPage.enterMinimumPriceAndMaximumprice("10000", "50000");
	}

	@When("Apply ram size {string} and enter star rating {string}")
	public void apply_ram_size_and_enter_star_rating(String string, String string2) {
		FlipkartProductsPage productsPage = new FlipkartProductsPage(driver);
		productsPage.enterTheRamSize("4 GB");
		productsPage.checkFlipkartAssuredCheckbox();
		productsPage.enterStarRating("4");
	}

	@When("Apply flipkart assured")
	public void apply_flipkart_assured() {
		FlipkartProductsPage productsPage = new FlipkartProductsPage(driver);
		productsPage.checkFlipkartAssuredCheckbox();
	}

	@Then("products are visible")
	public void products_are_visible() throws IOException {
		FlipkartProductsPage productsPage = new FlipkartProductsPage(driver);
		String searchResult = productsPage.searchResult();
		Assert.assertEquals(searchResult, "Showing 1 – 24 of 689 results for \"mobiles\"");
	}

}
