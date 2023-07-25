package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\'page-wrapper\']/div[3]/div[1]/div/div/div/div[1]/h5")
	WebElement ADD_CUSTOMER_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='country']")
	WebElement COUNTRY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='tags']")
	WebElement TAG_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='currency']")
	WebElement CURRENCY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='group']")
	WebElement GROUP_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement GROUP_PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='cpassword']")
	WebElement CONFIRM_PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement SAVE_ELEMENT;

	public void validateAddCustomerPage(String expectedText) {
		validateElement(ADD_CUSTOMER_HEADER_ELEMENT.getText(), expectedText, "Add Customer page is not avaliable");
	}

	public void insertFullName(String fullName) {
		FULL_NAME_ELEMENT.sendKeys(fullName + randomNumGenerator(999));
	}

	public void selectCompanyName(String Company) {
		selectFromDropdown(COMPANY_DROPDOWN_ELEMENT, Company);
	}

	public void insertEmail(String Email) {
		EMAIL_ELEMENT.sendKeys(randomNumGenerator(999) + Email);
	}

	public void insertPhone(String Phone) {
		PHONE_ELEMENT.sendKeys(Phone);
	}

	public void insertAdress(String adress) {
		ADRESS_ELEMENT.sendKeys(adress);
	}

	public void insertCity(String city) {
		CITY_ELEMENT.sendKeys(city);
	}

	public void insertState(String state) {
		STATE_ELEMENT.sendKeys(state);
	}

	public void insertZip(String zip) {
		ZIP_ELEMENT.sendKeys(zip);
	}

	public void selectCountryName(String Country) {
		selectFromDropdown(COUNTRY_DROPDOWN_ELEMENT, Country);
	}

	public void selectTag(String tag) {
		selectFromDropdown(TAG_DROPDOWN_ELEMENT, tag);
	}

	public void selectCurrency(String currency) {
		selectFromDropdown(CURRENCY_DROPDOWN_ELEMENT, currency);
	}

	public void selectGroup(String group) {
		selectFromDropdown(GROUP_DROPDOWN_ELEMENT, group);
	}

	public void insertGroupPassword(String grouppassword) {
		GROUP_PASSWORD_ELEMENT.sendKeys(grouppassword);
	}

	public void insertConfirmPassword(String confirmpassword) {
		CONFIRM_PASSWORD_ELEMENT.sendKeys(confirmpassword);
	}
	public void ClickOnSubmittButton() {
		SAVE_ELEMENT.click();
}
}