package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.pages.Accountpage;
import com.qa.opencart.pages.Loginpage;

public class Basetest {

	WebDriver driver;

	protected Loginpage loginpage;
	
	public Accountpage Accpage;

	@BeforeTest

	public void setup() {

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		loginpage = new Loginpage(driver);

	}

	@AfterTest

	public void teardown() {

		driver.quit();
	}

}
