package com.firstSeleniumProject.pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
public LoginPage(WebDriver lDriver) {

this.driver=lDriver;

PageFactory.initElements(driver, this);
}
//get required webelements
@FindBy (xpath= "//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[3]/a")  WebElement AccountClick;
@FindBy (xpath="//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[3]/ul/li[1]/a") WebElement loginclick;

@FindBy (xpath="//*[@id=\"email\"]") WebElement uname;

@FindBy (xpath="//*[@id=\"password\"]") WebElement pass;

@FindBy (xpath="//*[@id=\"submitBTN\"]") WebElement loginButton;

public void loginPortal (String userName, String passWord) {
	String originalWindowHandle = driver.getWindowHandle();
	AccountClick.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	loginclick.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//get windowhandles if login page opens in new page
	Set<String> allWindows = driver.getWindowHandles();
	for(String windowHandle : allWindows) {
		System.out.println(windowHandle);
		if(!windowHandle.equals(originalWindowHandle)) {
			driver.switchTo().window(windowHandle);
			break;
		}
	}
	//insert username and password in the webelements
	uname.sendKeys(userName);
	pass.sendKeys(passWord);
	loginButton.click();
}
}





