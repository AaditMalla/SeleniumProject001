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
@FindBy (xpath="//*[@id=\"mynavbar\"]/div/a[2]") WebElement loginclick;

@FindBy (xpath="//*[@id=\"email\"]") WebElement uname;

@FindBy (xpath="//*[@id=\"password\"]") WebElement pass;

@FindBy (xpath="//*[@id=\"submit\"]") WebElement loginButton;

public void loginPortal (String userName, String passWord) {
	String originalWindowHandle = driver.getWindowHandle();
	loginclick.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Set<String> allWindows = driver.getWindowHandles();
	for(String windowHandle : allWindows) {
		System.out.println(windowHandle);
		if(!windowHandle.equals(originalWindowHandle)) {
			driver.switchTo().window(windowHandle);
			break;
		}
	}
	uname.sendKeys(userName);
	pass.sendKeys(passWord);
	loginButton.click();
}
}





