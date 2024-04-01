package com.qa.opencart.constans;

import java.util.Arrays;
import java.util.List;

public class Appconstants {
	
	public static final String LOGIN_PAGE_TITLE = "Account Login";
	
	public static final String LOGIN_PAGE_URL = "route=account/login";
	
	public static final int ACCOUNTS_PAGE_HEADERS_COUNT = 4;
	
	
	public static final String ACCOUNTS_PAGE_TITLE = "My Account";
	
	
	
	public static final List<String> EXPECTED_ACC_PAGE_HEADERS_LIST= Arrays.asList("My Account","My Orders","My Affiliate Account","Newsletter");
	
	//***********Default timeout values*******************************
	
	public static final int  SHORT_TIME_OUT = 5;
	
	public static final int  MEDIUM_TIME_OUT = 10;
	
	public static final int  LONG_TIME_OUT = 15;
	
	
	
}
