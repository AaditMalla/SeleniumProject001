package com.firstSeleniumProject.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FlightPage {
WebDriver driver;
public FlightPage(WebDriver lDriver) {

this.driver=lDriver;

PageFactory.initElements(driver, this);
}
//getting elements to interact with the webpage
@FindBy (xpath= "//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[1]/a") WebElement FlightNavItem;
@FindBy(xpath = "//*[@id=\"onereturn\"]/div[1]/div/input") WebElement CurrentLocation;
@FindBy(xpath = "//*[@id=\"onereturn\"]/div[2]/div[2]/input") WebElement DestinationLocation;
@FindBy(xpath = "//*[@id=\"departure\"]") WebElement DepartureDate;
// click on the FlightNavItem

public void TestFlightSearch(String currentLocation, String destinationLocation ) {
	FlightNavItem.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	CurrentLocation.sendKeys(currentLocation);
	DestinationLocation.sendKeys(destinationLocation);
	DepartureDate.click();
	
}
}
