package com.qa.opencart.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.Basetest;
import com.qa.opencart.constans.Appconstants;

public class Accountpagetest extends Basetest {

	@BeforeClass

	public void accPageSetup() {

		Accpage = loginpage.dologin("testautomation2024@gmail.com", "Selenium@12345");
	}

	@Test
	public void accpagetitletest() {

		String Acctitle = Accpage.getaccpagetitle();

		Assert.assertEquals(Acctitle, Appconstants.ACCOUNTS_PAGE_TITLE);

	}

	@Test

	public void logoutlinkexist() {

		Assert.assertTrue(Accpage.isLogoutlinkExist());
	}
	
	@Test

	public void AccpageHeaderCountTest() {

		int ActaccpageHeaderscount = Accpage.accountsheaderscount();

		System.out.println("Actual Accpage Headers count:" + ActaccpageHeaderscount);

		Assert.assertEquals(ActaccpageHeaderscount, Appconstants.ACCOUNTS_PAGE_HEADERS_COUNT);

	}
	
	@Test
	
	public void AccpageheaderTest() {
		
		List<String> Accpageaheaderlist =Accpage.accountsheaders();
		Assert.assertEquals(Accpageaheaderlist, Appconstants.EXPECTED_ACC_PAGE_HEADERS_LIST);
	}
	
	
	
	
	
	

}
