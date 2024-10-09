package pageEvents;

import org.testng.Assert;
import base.BaseTest;
import PageObjets.PlanElements;
import utils.ElementFetch;

public class KuwaitPlanEvents extends BaseTest {
	ElementFetch ele = new ElementFetch();
	Float floatprice;
	
	public void isdisplayed_Types() {

		Assert.assertTrue(ele.getWebElement("XPATH", PlanElements.litetype).isDisplayed(),
				"Country Kuwait - Lite Subsribtion type is not displayed");
		Assert.assertTrue(ele.getWebElement("XPATH", PlanElements.classictype).isDisplayed(),
				"Country Kuwait - Classic Subsribtion type is not displayed");
		Assert.assertTrue(ele.getWebElement("XPATH", PlanElements.premiumtype).isDisplayed(),
				"Country Kuwait - Premium subsription type is not displayed");
	}

	public void verify_subscriptiontypes() {

		Assert.assertEquals(ele.getWebElement("XPATH", PlanElements.litetype).getText(), "LITE");
		Assert.assertEquals(ele.getWebElement("XPATH", PlanElements.classictype).getText(), "CLASSIC");
		Assert.assertEquals(ele.getWebElement("XPATH", PlanElements.premiumtype).getText(), "PREMIUM");

	}

	public void verify_Liteprice() {
		
		String text = ele.getWebElement("XPATH", PlanElements.liteprice).getText();
		String firstWord = text.split(" ")[0];
		System.out.println(firstWord);
		try {
		floatprice = Float.parseFloat(firstWord);	
		}catch (Exception e){
			logger.fail("Kuwait Lite Price is not a float number and incorrect");
		}
		}
			

	public void verify_Classicprice() {
		
		String text = ele.getWebElement("XPATH", PlanElements.classicprice).getText();
		String firstWord = text.split(" ")[0];
		System.out.println(firstWord);
		try {
		floatprice = Float.parseFloat(firstWord);	
		}catch (Exception e){
			logger.fail("Kuwait Classic Price is not a float number and incorrect");
		}
	}

	public void verify_Premiumprice() {
		
		String text = ele.getWebElement("XPATH", PlanElements.premiumprice).getText();
		String firstWord = text.split(" ")[0];
		System.out.println(firstWord);
		try {
		floatprice = Float.parseFloat(firstWord);	
		}catch (Exception e){
			logger.fail("Kuwait Lite Price is not a float number and incorrect");
		}
	}

	public void verify_litecurrency() {
		String currencynm = ele.getWebElement("XPATH", PlanElements.liteprice).getText();
		int iend = currencynm.indexOf("/");
		String subString;
		if (iend != -1) {
			subString = currencynm.substring(iend - 3, iend);
			System.out.println(subString);
			if (subString.equals("KWD")) {
				Assert.assertEquals(subString, "KWD");
				logger.pass("Lite curreny is correct in Lite Subscription");
			} else {
				logger.fail("Kuwait curreny is wrong in Lite Subscription");
			}
		}

	}

	public void verify_classiccurrency() {
		String currencynm = ele.getWebElement("XPATH", PlanElements.classicprice).getText();
		int iend = currencynm.indexOf("/");
		String subString;
		if (iend != -1) {
			subString = currencynm.substring(iend - 3, iend);
			System.out.println(subString);
			if (subString.equals("KWD")) {
				Assert.assertEquals(subString, "KWD");
				logger.pass("Classic curreny is correct in Lite Subscription");
			} else {
				logger.fail("Kuwait curreny is wrong in Classic Subscription");
			}
		}

	}

	public void verify_premiumcurrency() {

		String currencynm = ele.getWebElement("XPATH", PlanElements.premiumprice).getText();
		int iend = currencynm.indexOf("/");
		String subString;
		if (iend != -1) {
			subString = currencynm.substring(iend - 3, iend);
			System.out.println(subString);
			if (subString.equals("KWD")) {
				Assert.assertEquals(subString, "KWD");
				logger.pass("Premium curreny is correct in Premium Subscription");
			} else {
				logger.fail("Kuwait curreny is wrong in Premium Subscription");
			}
		}

	}

}
