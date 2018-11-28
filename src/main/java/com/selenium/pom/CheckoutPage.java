package com.selenium.pom;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutPage {

	WebDriver driver;

	public CheckoutPage(WebDriver driver){ 
        this.driver=driver; 
}


//Using FindBy for locating elements
@FindBy(how=How.XPATH, using="//input[@type='text']") WebElement emailField;
@FindBy(how=How.XPATH, using="//button[@type='submit']") WebElement continueButton;
@FindBy(how=How.XPATH, using="//input[@type='password']") WebElement passwordField;
@FindBy(how=How.XPATH, using="//button[@type='submit']") WebElement loginButton;

public void enterEmailId(String emailId){

	emailField.sendKeys(emailId);
	continueButton.click();
}

public void enterPassword(String password){

	passwordField.sendKeys(password);
	loginButton.click();
}




}
