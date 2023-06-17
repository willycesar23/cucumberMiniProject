package com.noorteck.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.qa.utils.Constants;

import cucumberMiniProject.BlazeDemoPurchase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class flightTicket {

	BlazeDemoPurchase blaze;

	@Given("User navigates to the Purchase Flight Page {string}")
	public void userNavigateToFlightPage(String url) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);

		blaze = new BlazeDemoPurchase();
	}

	@When("User enters Full Name {string}")
	public void userEntersFullName(String fullName) throws InterruptedException {

		blaze.enterFullName(fullName);
		

	}

	@When("User enters Address {string}")
	public void userEntersAddress(String address) throws InterruptedException {

		blaze.enterAddress(address);
		
	}

	@When("User enters City {string}")
	public void userEntersCity(String city) throws InterruptedException {
		blaze.enterCity(city);
		
	}

	@When("User enters State {string}")
	public void userEntersState(String state) throws InterruptedException {
		blaze.enterState(state);
		
	}

	@When("user enters Zip Code {string}")
	public void userEntersZipCode(String zipCode) throws InterruptedException {
		blaze.enterZipCode(zipCode);
		
	}

	@When("User select Card Type")
	public void userSelectCardType(String cardType) throws InterruptedException {

		blaze.selectCardType(cardType);
		
	}

	@When("User enters Card number\"{int}\"")
	public void userEntersCardNumber(String cardNumber) {
		blaze.enterCardNumber(cardNumber);
	}

	@When("User enters Card Month {string}")
	public void userEntersCardMonth(String month) {
		blaze.enterCardMonth(month);
	}

	@When("User enters Card Year {string}")
	public void userEntersCardYear(String year) {
		blaze.enterCardYear(year);
	}

	@When("User enters Credit Card Name {string}")
	public void userEntersCardName(String name) {
		blaze.enterCardName(name);
	}

	@When("User clicks on Remember me box")
	public void userClicks_on_remember_me_box() {
		blaze.clickTheCheckBox();

	}

	@When("User clicks on Purchase Flight Btn")
	public void user_clicks_on_purchase_flight_btn() {
		blaze.clickOnRegisterButton();
	}

	@Then("User verifies success message {string}")
	public void userVerifiesMessage(String message) throws InterruptedException {

		blaze.userVerifyPageTitle(message);

		Thread.sleep(2000);
		Constants.driver.quit();

	}

}
