package com.selenium.pom;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ViewItemPage {

	WebDriver driver;

	public ViewItemPage(WebDriver driver){ 
        this.driver=driver; 
}


//Using FindBy for locating elements
@FindBy(how=How.XPATH, using="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']") WebElement addToCart;



public void clickAddToCart(){

	addToCart.click();
}




}
