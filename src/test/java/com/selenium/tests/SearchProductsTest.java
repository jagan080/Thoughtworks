package com.selenium.tests;



import java.util.ArrayList;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.selenium.common.TestConstants;
import com.selenium.pom.CheckoutPage;
import com.selenium.pom.Home_Page;

import com.selenium.pom.ViewCartPage;
import com.selenium.pom.ViewItemPage;




public class SearchProductsTest extends TestBase{
	
	
	@Test
	public void flow1() throws InterruptedException{
	
		Home_Page homePage = PageFactory.initElements(driver, Home_Page.class);
	
		homePage.closeLoginPopUp();
		homePage.enterTextInSearchField(TestConstants.SEARCHPRODUCT);
		ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(windowHandles.get(1));	
		ViewItemPage vip = PageFactory.initElements(driver, ViewItemPage.class);
		Thread.sleep(1000);
		vip.clickAddToCart();
		ViewCartPage vcp = PageFactory.initElements(driver, ViewCartPage.class);
		vcp.clickPlaceOrder();
		CheckoutPage cop = PageFactory.initElements(driver, CheckoutPage.class);
		cop.enterEmailId(TestConstants.EMAIL_ID);
		cop.enterPassword(TestConstants.PASSWORD);
	}
	
	@Test
	public void flow2() throws InterruptedException{
	
		Home_Page homePage = PageFactory.initElements(driver, Home_Page.class);
		homePage.login(TestConstants.EMAIL_ID, TestConstants.PASSWORD);
		homePage.enterTextInSearchField(TestConstants.SEARCHPRODUCT);
		ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(windowHandles.get(1));	
		ViewItemPage vip = PageFactory.initElements(driver, ViewItemPage.class);
		Thread.sleep(1000);
		vip.clickAddToCart();
		
	}

}
