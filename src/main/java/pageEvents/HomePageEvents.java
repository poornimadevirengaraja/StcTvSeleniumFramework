package pageEvents;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PageObjets.HomePageElements;
import PageObjets.SelectYourCountryElements;
import base.BaseTest;
import utils.ElementFetch;

public class HomePageEvents {

	ElementFetch ele = new ElementFetch();

	public void isdisplayed_StcHomePage() {

		Assert.assertTrue(ele.getWebElement("XPATH", HomePageElements.signinbtn).isDisplayed(),
				"Stc Tv Home Page not loaded  & Sign in Button is not displayed");
		Assert.assertTrue(ele.getWebElement("XPATH", HomePageElements.Countrynamebtn).isDisplayed(),
				"Stc Tv Home Page not loaded  & Country Button is not displayed");
		Assert.assertTrue(ele.getWebElement("XPATH", HomePageElements.translationbtn).isDisplayed(),
				"Stc Tv Home Page not loaded  & Translation Button is not displayed");
	}

	public void isdisplayed_countrybutton() {

		Assert.assertTrue(ele.getWebElement("XPATH", HomePageElements.Countrynamebtn).isDisplayed(),
				"Country Button is not displayed to click");
	}

	public void click_countrybutton() {
		boolean iselementdisplayed = ele.getWebElement("XPATH", HomePageElements.Countrynamebtn).isDisplayed();
		System.out.println(iselementdisplayed);
		if (iselementdisplayed = true) {
			ele.getWebElement("XPATH", HomePageElements.Countrynamebtn).click();
			BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
			
		} else {
			Assert.assertTrue(iselementdisplayed, "Country Button Not displayed");
		}

	}
}