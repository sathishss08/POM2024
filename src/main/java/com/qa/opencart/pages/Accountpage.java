package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.constans.Appconstants;
import com.qa.opencart.utils.ElementUtil;

public class Accountpage {

	private WebDriver driver;

	private ElementUtil eleutil;

	private By logoutlink = By.linkText("Logout");

	private By accountsheaders = By.xpath("//div[@id= 'content']/h2");

	private By Search = By.name("search");

	private By Searchbutton = By.cssSelector("div#search button");

	public Accountpage(WebDriver driver) {

		this.driver = driver;

		eleutil = new ElementUtil(driver);

	}

	public String getaccpagetitle() {
		return eleutil.waitForTitleIs(Appconstants.ACCOUNTS_PAGE_TITLE, Appconstants.SHORT_TIME_OUT);

	}

	public Boolean isLogoutlinkExist() {
		return eleutil.waitForElementPresence(logoutlink, Appconstants.SHORT_TIME_OUT).isDisplayed();
	}

	public List<String> accountsheaders() {

		List<WebElement> HeadersList = eleutil.waitForElementsVisible(accountsheaders, Appconstants.MEDIUM_TIME_OUT);

		List<String> headersValueList = new ArrayList<String>();

		for (WebElement e : HeadersList) {

			String Header = e.getText();

			headersValueList.add(Header);
		}

		return headersValueList;
	}

	public int accountsheaderscount() {

		return eleutil.waitForElementsVisible(accountsheaders, Appconstants.MEDIUM_TIME_OUT).size();
	}
		
		public void doSearch(String Searchkey)
		{
			
			
			
			eleutil.waitForElementVisible(Search,Appconstants.MEDIUM_TIME_OUT).sendKeys(Searchkey);
			
			eleutil.doClick(Searchbutton);
		}
		
		
		
		

	}


