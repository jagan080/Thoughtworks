package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Home_Page {

	WebDriver driver;

	public Home_Page(WebDriver driver){ 
        this.driver=driver; 
}


//Using FindBy for locating elements
@FindBy(how=How.XPATH, using="//input[@placeholder='Search for products, brands and more']") WebElement searchField;
@FindBy(how=How.XPATH, using="//button[@type='submit']") WebElement enterSearchButton;
@FindBy(how=How.XPATH, using="//button[@class='_2AkmmA _29YdH8']") WebElement loginPopUp;
@FindBy(how=How.XPATH, using="//a[@title='Zurie Toy Collection Off Road Monster Racing Car, Remote Control , 1:20 Scale, Black']") WebElement clickItem;
@FindBy(how=How.XPATH, using="//div[@class='_39M2dM']//input[@type='text']") WebElement emailField;
@FindBy(how=How.XPATH, using="//input[@type='password']") WebElement passwordField;
@FindBy(how=How.XPATH, using="//div[@class='_1avdGP']//button[@type='submit']") WebElement loginButton;


public WebElement getSearchField(){

return searchField;

}

public void enterTextInSearchField(String search){

	searchField.sendKeys(search);
	enterSearchButton.click();
	Actions newwin = new Actions(driver);
	newwin.keyDown(Keys.SHIFT).click(clickItem).keyUp(Keys.SHIFT).build().perform();
}

public void login(String emailId, String password){

	emailField.sendKeys(emailId);
	passwordField.sendKeys(password);
	loginButton.click();
	}



public void closeLoginPopUp(){

	loginPopUp.click();
}



}
