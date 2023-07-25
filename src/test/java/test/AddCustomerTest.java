package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
	
	String userName = "demo@techfios.com";
	String password = "abc123";
	String dashboardValidationText = "Dashboard";
	String addCustomerValidationText = "Add Contact";
	String fullName = "MEKEDELAWIT ASFAW";
	String company = "Apple";
	String email = "abcd@gmail.com";
	String phone = "1234567899";
	String adress = "123 Beltline Rd ,Dallas, tx";
	String city = "Dallas";
	String state = "Texas";
	String zip = "12345";
	String country = "Bahamas";
	String tag = "IT Training";
	String currency = "EUR";
	String group = "Selenium";
	String grouppassword = "abc1234";
	String confirmPassword = "abc1234";

	
	@Test
	public void userShouldBeAbleToAddCustomer() {
		driver= BrowserFactory.init();
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.performLogin (userName , password);
		
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashboardPage(dashboardValidationText);
		dashboardpage.clickCustomerButton();
		dashboardpage.clickAddCustomerButton();
		
		AddCustomerPage addcustomerpage = PageFactory.initElements(driver, AddCustomerPage.class);
		addcustomerpage.validateAddCustomerPage(addCustomerValidationText);
		addcustomerpage.insertFullName(fullName);
		addcustomerpage.selectCompanyName(company);
		addcustomerpage.insertEmail(email);
		addcustomerpage.insertPhone(phone);
		addcustomerpage.insertAdress(adress);
		addcustomerpage.insertCity(city);
		addcustomerpage.insertState(state);
		addcustomerpage.insertZip(zip);
		addcustomerpage.selectCountryName(country);
		addcustomerpage.selectTag(tag);
		addcustomerpage.selectCurrency(currency);
		addcustomerpage.selectGroup(group);
		addcustomerpage.insertGroupPassword(grouppassword);
		addcustomerpage.insertConfirmPassword(confirmPassword);
		addcustomerpage.ClickOnSubmittButton();
		
		
		
		
		
		
	}
}