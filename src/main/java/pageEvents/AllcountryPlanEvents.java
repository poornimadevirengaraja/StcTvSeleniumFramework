package pageEvents;

import org.testng.Assert;
import base.BaseTest;
import PageObjets.AllPlanElements;
import PageObjets.HomePageElements;
import utils.ElementFetch;

public class AllcountryPlanEvents extends BaseTest {
	ElementFetch ele = new ElementFetch();
	float floatval;
	int intval;
	String countryname;

	// verify subscription types displayed or not
	public void isdisplayed_Types() {
		Assert.assertTrue(ele.getWebElement("XPATH", AllPlanElements.litetype).isDisplayed(),
				"Country Bahrain - Lite Subsribtion type is not displayed");
		Assert.assertTrue(ele.getWebElement("XPATH", AllPlanElements.classictype).isDisplayed(),
				"Country Bahrain - Classic Subsribtion type is not displayed");
		Assert.assertTrue(ele.getWebElement("XPATH", AllPlanElements.premiumtype).isDisplayed(),
				"Country Bahrain - Premium subsription type is not displayed");
	}

	// verify subscription types
	public void verify_litesubscriptiontypetxt() {
		Assert.assertEquals(ele.getWebElement("XPATH", AllPlanElements.litetype).getText(), "LITE");
	}

	public void verify_classicsubscriptiontypetxt() {
		Assert.assertEquals(ele.getWebElement("XPATH", AllPlanElements.classictype).getText(), "CLASSIC");
	}

	public void verify_premiumsubscriptiontypetxt() {
		Assert.assertEquals(ele.getWebElement("XPATH", AllPlanElements.premiumtype).getText(), "PREMIUM");
	}

	// Verify the Lite Price - extract price & check price should be either float or
	// integer type
	public void verify_Liteprice() {
		String pricelite = ele.getWebElement("XPATH", AllPlanElements.liteprice).getText();
		System.out.println("liteprice = " + pricelite);

		String countryname = (ele.getWebElement("XPATH", HomePageElements.Countrynamebtn).getText()).trim();
		System.out.println("countryname = " + countryname);
		if ((countryname.contains("Bahrain")) || (countryname.contains("KSA"))) {
			try {

				intval = Integer.parseInt(pricelite); // currency is integer

			} catch (Exception e) {
				e.getStackTrace();
				Assert.assertFalse(true, "Lite price is not correct");
			}
		} else {
			try {
				floatval = Float.parseFloat(pricelite);

			} catch (Exception e) {
				e.getStackTrace();
				Assert.assertFalse(true, "Lite price is not correct");
			}

		}

	}

	// Verify the Classic Price - extract price & check price should be either float
	// or integer type
	public void verify_Classicprice() {
		String priceclassic = ele.getWebElement("XPATH", AllPlanElements.classicprice).getText();
		System.out.println("classicprice = " + priceclassic);

		String countryname = (ele.getWebElement("XPATH", HomePageElements.Countrynamebtn).getText()).trim();
		System.out.println("countryname = " + countryname);

		if ((countryname.contains("Bahrain")) || (countryname.contains("KSA"))) {
			try {
				intval = Integer.parseInt(priceclassic); // currency is integer

			} catch (Exception e) {
				e.getStackTrace();
				Assert.assertFalse(true, "classic price is not correct");
			}
		} else {
			try {
				floatval = Float.parseFloat(priceclassic); // currency is float

			} catch (Exception e) {
				e.getStackTrace();
				Assert.assertFalse(true, "classic price is not correct");
			}

		}

	}

	// Verify the premium Price - extract price & check price should be either float
	// or integer type
	public void verify_Premiumprice() {
		String pricepremium = ele.getWebElement("XPATH", AllPlanElements.premiumprice).getText();
		System.out.println("premiumprice = " + pricepremium);

		String countryname = (ele.getWebElement("XPATH", HomePageElements.Countrynamebtn).getText()).trim();
		System.out.println("countryname = " + countryname);
		if ((countryname.contains("Bahrain")) || (countryname.contains("KSA"))) {
			try {
				floatval = Float.parseFloat(pricepremium);

			} catch (Exception e) {
				e.getStackTrace();
				Assert.assertFalse(true, "premium price is not correct");
			}
		} else {
			try {
				floatval = Float.parseFloat(pricepremium); // currency is float

			} catch (Exception e) {
				e.getStackTrace();
				Assert.assertFalse(true, "classic price is not correct");
			}
		}
	}

	// Verify Lite Currency
	public void verify_litecurrency() {
		String currencylite = ele.getWebElement("XPATH", AllPlanElements.litecurrency).getText();
		System.out.println("currenlite = " + currencylite);

		String countryname = (ele.getWebElement("XPATH", HomePageElements.Countrynamebtn).getText()).trim();
		System.out.println("countryname = " + countryname);

		if (countryname.contains("Bahrain")) {
			System.out.println("countryname inside loop bahrain = " + countryname);
			Assert.assertEquals(currencylite, "BHD/month", countryname + " Lite Currency is incorrect");
		} else if (countryname.contains("KSA")) {
			System.out.println("countryname inside loop KSA = " + countryname);
			Assert.assertEquals(currencylite, "SAR/month", countryname + " Lite Currency is incorrect");
		} else if (countryname.contains("Kuwait")) {
			System.out.println("countryname inside loop kuwait = " + countryname);
			Assert.assertEquals(currencylite, "KWD/month", countryname + " Lite Currency is incorrect");
		} else {
			Assert.assertEquals(currencylite, "SAR/month", countryname + " Lite Currency is incorrect");
		}
	}

	// Verify Classic Currency
	public void verify_classiccurrency() {
		String currencyclassic = ele.getWebElement("XPATH", AllPlanElements.classiccurrency).getText();
		System.out.println("currencyclassic = " + currencyclassic);

		String countryname = ele.getWebElement("XPATH", HomePageElements.Countrynamebtn).getText();
		System.out.println("countryname = " + countryname);

		if (countryname.contains("Bahrain")) {
			Assert.assertEquals(currencyclassic, "BHD/month", countryname + " Classic Currency is incorrect");
		} else if (countryname.contains("KSA")) {
			Assert.assertEquals(currencyclassic, "SAR/month", countryname + " Classic Currency is incorrect");
		} else if (countryname.contains("Kuwait")) {
			Assert.assertEquals(currencyclassic, "KWD/month", countryname + " Classic Currency is incorrect");
		} else {
			Assert.assertEquals(currencyclassic, "SAR/month", countryname + " Classic Currency is incorrect");
		}

	}

	// Verify Premium Currency
	public void verify_premiumcurrency() {
		String currencypremium = ele.getWebElement("XPATH", AllPlanElements.premiumcurrency).getText();
		System.out.println("currencypremium = " + currencypremium);

		String countryname = ele.getWebElement("XPATH", HomePageElements.Countrynamebtn).getText();
		System.out.println("countryname = " + countryname);

		if (countryname.contains("Bahrain")) {
			Assert.assertEquals(currencypremium, "BHD/month", countryname + " Premium Currency is incorrect");
		} else if (countryname.contains("KSA")) {
			Assert.assertEquals(currencypremium, "SAR/month", countryname + " Premium Currency is incorrect");
		} else if (countryname.contains("Kuwait")) {
			Assert.assertEquals(currencypremium, "KWD/month", countryname + " Premium Currency is incorrect");
		} else {
			Assert.assertEquals(currencypremium, "KWD/month", countryname + " Premium Currency is incorrect");
		}
	}

}
