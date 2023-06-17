package cucumberMiniProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.qa.utils.Constants;

public class BlazeDemoPurchase {

	@FindBy(id = "inputName")
	WebElement firstAndLastName;

	@FindBy(xpath = "//input[@id = 'address']")
	WebElement AddressField;

	@FindBy(xpath = "//input[@id = 'city']")
	WebElement cityField;

	@FindBy(xpath = "//input[@id = 'state']")
	WebElement stateField;

	@FindBy(xpath = "//input[@id = 'zipCode']")
	WebElement zipCodeField;

	@FindBy(xpath = "//select[@id = 'cardType']")
	WebElement clickCardTypeDropdown;

	@FindBy(xpath = "//input[@id = 'creditCardNumber']")
	WebElement creditCardNumber;

	@FindBy(xpath = "//input[@id = 'creditCardMonth']")
	WebElement cardMonth;

	@FindBy(xpath = "//input[@id = 'creditCardYear']")
	WebElement cardYear;

	@FindBy(xpath = "//input[@id = 'nameOnCard']")
	WebElement creditCardName;

	@FindBy(xpath = "//input[@id = 'rememberMe']")
	WebElement checkBox;

	@FindBy(xpath = "//input[@value = 'Purchase Flight']")
	WebElement purchaseFlightButton;

	@FindBy(linkText = "Thank you for your purchase today!")
	WebElement pageTitle;

	// CONSTRUCTOR
	public BlazeDemoPurchase() {
		PageFactory.initElements(Constants.driver, this);

	}
	// METHODS

	public void enterFullName(String fullName) {
		firstAndLastName.sendKeys(fullName);

	}

	public void enterAddress(String address) {
		AddressField.sendKeys(address);
	}

	public void enterCity(String city) {
		cityField.sendKeys(city);
	}

	public void enterState(String state) {
		stateField.sendKeys(state);
	}

	public void enterZipCode(String zipCode) {
		zipCodeField.sendKeys(zipCode);
	}

	public void selectCardType(String cardType) throws InterruptedException {

		clickCardTypeDropdown.clear();

		Select S = new Select(clickCardTypeDropdown);
		List<WebElement> list = S.getOptions();
		for (WebElement options : list) {
			String card = options.getText();

			if (card.equals(cardType)) {
				options.click();
				break;

			}
		}

	}

	public void enterCardNumber(String cardNumber) {
		creditCardNumber.sendKeys(cardNumber);
	}

	public void enterCardMonth(String month) {
		cardMonth.sendKeys(month);
	}

	public void enterCardYear(String year) {
		cardYear.sendKeys(year);
	}

	public void enterCardName(String cardName) {
		creditCardName.sendKeys(cardName);
	}

	public void clickTheCheckBox() {
		checkBox.click();
	}

	public void clickOnRegisterButton() {
		purchaseFlightButton.click();
	}

	public void userVerifyPageTitle(String title) {
		String actualTitle = Constants.driver.getTitle();

		if (title.equals(actualTitle)) {
			System.out.println("title message is :" + title);
		}
		System.out.println("TiTle:" + title);

	}

}
