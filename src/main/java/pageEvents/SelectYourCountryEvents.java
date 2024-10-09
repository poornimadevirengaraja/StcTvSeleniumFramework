package pageEvents;

import java.time.Duration;

import org.testng.Assert;

import PageObjets.HomePageElements;
import PageObjets.SelectYourCountryElements;
import base.BaseTest;
import utils.ElementFetch;

public class SelectYourCountryEvents {
	ElementFetch ele = new ElementFetch();
	
	public void click_BahrainBtn() {
		boolean iselementdisplayed = ele.getWebElement("XPATH", SelectYourCountryElements.Bahrainbutton).isDisplayed();
		System.out.println(iselementdisplayed);
		if (iselementdisplayed = true) {
			ele.getWebElement("XPATH", SelectYourCountryElements.Bahrainbutton).click();
			BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
			
		} else {
			Assert.assertTrue(iselementdisplayed, "Bahrain Button Not displayed");
			
		}
	}
	
	
	public void click_KSABtn() {
		boolean iselementdisplayed = ele.getWebElement("XPATH", SelectYourCountryElements.ksabutton).isDisplayed();
		System.out.println(iselementdisplayed);
		if (iselementdisplayed = true) {
			System.out.println(iselementdisplayed+"Loop inside");
			ele.getWebElement("XPATH", SelectYourCountryElements.ksabutton).click();
			System.out.println(iselementdisplayed+"Clicked");
			BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
			
		} else {
			Assert.assertTrue(iselementdisplayed, "KSA Button Not displayed");
			
		}
	}
	
	public void click_KuwaitBtn() {
		boolean iselementdisplayed = ele.getWebElement("XPATH", SelectYourCountryElements.Kuwaitbutton).isDisplayed();
		System.out.println(iselementdisplayed);
		if (iselementdisplayed = true) {
			ele.getWebElement("XPATH", SelectYourCountryElements.Kuwaitbutton).click();
			BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
			
		} else {
			Assert.assertTrue(iselementdisplayed, "Kuwait Button Not displayed");
			
		}
	}

}
