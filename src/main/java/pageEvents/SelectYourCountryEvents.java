package pageEvents;

import java.time.Duration;

import org.testng.Assert;

import PageObjets.HomePageElements;
import PageObjets.SelectYourCountryElements;
import base.BaseTest;
import utils.ElementFetch;

// Events or Operations like click to be done in Select Your Country Page
public class SelectYourCountryEvents {
	ElementFetch ele = new ElementFetch();
	// Click on Bahrain Button in Select Country Page
	public void click_BahrainBtn() {
		boolean iselementdisplayed = ele.getWebElement("XPATH", SelectYourCountryElements.Bahrainbutton).isDisplayed();
		//System.out.println(iselementdisplayed);
		if (iselementdisplayed = true) {
			ele.getWebElement("XPATH", SelectYourCountryElements.Bahrainbutton).click();
			BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
			
		} 
			Assert.assertTrue(iselementdisplayed, "Bahrain Button Not displayed");
		}
	
	// Click on KSA Button in Select Country Page
	public void click_KSABtn() {
		boolean iselementdisplayed = ele.getWebElement("XPATH", SelectYourCountryElements.ksabutton).isDisplayed();
		//System.out.println(iselementdisplayed);
		if (iselementdisplayed = true) {
			//System.out.println(iselementdisplayed+"Loop inside");
			ele.getWebElement("XPATH", SelectYourCountryElements.ksabutton).click();
			//System.out.println(iselementdisplayed+"Clicked");
			BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
			
		} 
			Assert.assertTrue(iselementdisplayed, "KSA Button Not displayed");

	}
	
	// Click on Kuwait Button in Select Country Page
	public void click_KuwaitBtn() {
		boolean iselementdisplayed = ele.getWebElement("XPATH", SelectYourCountryElements.Kuwaitbutton).isDisplayed();
		System.out.println(iselementdisplayed);
		if (iselementdisplayed = true) {
			ele.getWebElement("XPATH", SelectYourCountryElements.Kuwaitbutton).click();
			BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
			
		} 
			Assert.assertTrue(iselementdisplayed, "Kuwait Button Not displayed");
		
	}

}
