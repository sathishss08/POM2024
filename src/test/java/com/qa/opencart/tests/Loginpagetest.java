package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.Basetest;

public class Loginpagetest extends Basetest {

	@Test(priority = 1)

	public void loginpagetitleTest() {

		String acttitle = loginpage.Loginpagetitle();

		Assert.assertEquals(acttitle, "Account Login");
	}

	@Test(priority = 2)

	public void loginpageURLTest() {

		String actURL = loginpage.LoginpageURL();

		Assert.assertTrue(actURL.contains("route=account/login"));
	}

	@Test(priority = 3)

	public void isforgotpasswdlinkExsitingTest() {

		Assert.assertTrue(loginpage.forgotpasswdlink());

	}

	@Test(priority = 4)

	public void dologinTest() {

		Accpage = loginpage.dologin("testautomation2024@gmail.com", "Selenium@12345");
		Assert.assertEquals(Accpage.isLogoutlinkExist(),true);
	}

}
