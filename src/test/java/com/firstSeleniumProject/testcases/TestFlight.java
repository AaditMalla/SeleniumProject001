package com.firstSeleniumProject.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.firstSeleniumProject.pages.BaseTest;
import com.firstSeleniumProject.pages.FlightPage;
import com.firstSeleniumProject.pages.LoginPage;

public class TestFlight extends BaseTest {
	
	@Test
 public void verifyFlight() {
		LoginPage loginPage = new LoginPage(driver);
        FlightPage flightPage = new FlightPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        TestLogin testLogin = new TestLogin();
        testLogin.verifyLogin();
        flightPage.TestFlightSearch("Kathmandu", "India");
	 
	 
 }
}
