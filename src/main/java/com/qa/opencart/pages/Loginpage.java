package com.qa.opencart.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.qa.opencart.constans.Appconstants;
import com.qa.opencart.utils.ElementUtil;

public class Loginpage {

	private WebDriver driver;
	
	private ElementUtil eleutil;
	
	// private Bylocators- pagelocators

	private By Emailid = By.id("input-email");

	private By Passwd = By.id("input-password");

	private By Loginbtn = By.xpath("//input[@type='submit']");

	private By Forgotpasswd = By.linkText("Forgotten Password");
	
	private By sathish = By.linkText("Sathish");

	// public page constructor
	public Loginpage(WebDriver driver) {

		this.driver = driver;
		
		eleutil = new ElementUtil(driver);
	}

	// public page actions/methods

	public String Loginpagetitle() {

		String titlename = eleutil.waitForTitleIs(Appconstants.LOGIN_PAGE_TITLE, Appconstants.SHORT_TIME_OUT);

		System.out.println("login page title is:" + titlename);

		return titlename;
	}

	public String LoginpageURL() {

		String URL = eleutil.waitForURLContains(Appconstants.LOGIN_PAGE_URL, Appconstants.SHORT_TIME_OUT);

		System.out.println("login page URL is:" + URL);
		return URL;

	}

	public Boolean forgotpasswdlink() {
		return eleutil.waitForElementVisible(Forgotpasswd,Appconstants.MEDIUM_TIME_OUT).isDisplayed();

	}

	public Accountpage dologin(String username, String Pwd) {
		
		System.out.println("App creds are:"+ username +":"+ Pwd);

		eleutil.waitForElementVisible(Emailid, 10 ).sendKeys(username);
		eleutil.doSendKeys(Passwd, Pwd);
		eleutil.doClick(Loginbtn);
//		return eleutil.waitForTitleIs(Appconstants.ACCOUNTS_PAGE_TITLE,Appconstants.SHORT_TIME_OUT);
		
		return new Accountpage(driver);
		

	}
}