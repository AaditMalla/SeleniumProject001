package com.firstSeleniumProject.testcases;

import org.testng.annotations.Test;

import com.firstSeleniumProject.pages.BaseTest;
import com.firstSeleniumProject.pages.LoginPage;

public class TestLogin extends BaseTest {
	@Test
	void verifyLogin() {
		LoginPage logP = new LoginPage(driver);
		String userName = "user@phptravels.com";
		String password = "demouser";
		logP.loginPortal(userName, password);
	}
}
