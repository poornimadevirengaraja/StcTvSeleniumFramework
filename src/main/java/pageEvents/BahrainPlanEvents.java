package pageEvents;

import org.testng.Assert;
import base.BaseTest;
import PageObjets.PlanElements;
import utils.ElementFetch;

public class BahrainPlanEvents extends BaseTest {
	ElementFetch ele = new ElementFetch();

	public void isdisplayed_Types() {

		Assert.assertTrue(ele.getWebElement("XPATH", PlanElements.litetype).isDisplayed(),
				"Country Bahrain - Lite Subsribtion type is not displayed");
		Assert.assertTrue(ele.getWebElement("XPATH", PlanElements.classictype).isDisplayed(),
				"Country Bahrain - Classic Subsribtion type is not displayed");
		Assert.assertTrue(ele.getWebElement("XPATH", PlanElements.premiumtype).isDisplayed(),
				"Country Bahrain - Premium subsription type is not displayed");
	}

	public void verify_subscriptiontypes() {

		Assert.assertEquals(ele.getWebElement("XPATH", PlanElements.litetype).getText(), "LITE");
		Assert.assertEquals(ele.getWebElement("XPATH", PlanElements.classictype).getText(), "CLASSIC");
		Assert.assertEquals(ele.getWebElement("XPATH", PlanElements.premiumtype).getText(), "PREMIUM");

	}

	public void verify_Liteprice() {
		int flag = 0;
		String text = ele.getWebElement("XPATH", PlanElements.liteprice).getText();
		String firstWord = text.split(" ")[0];
		System.out.println(firstWord);
		for (char c : firstWord.toCharArray()) {
			System.out.println(Character.isDigit(c));
			if (Character.isDigit(c)) {
				System.out.println(Character.isDigit(c));
				Assert.assertEquals(Character.isDigit(c), true);
			} else {
				flag = 1;
			}		
		}
		if (flag == 1) {
			logger.fail("Lite Price is not numeric in Bahrain Subsription");
		}
	}
	
	public void verify_Classicprice() {
		int flag = 0;
		String text = ele.getWebElement("XPATH", PlanElements.classicprice).getText();
		String firstWord = text.split(" ")[0];
		System.out.println(firstWord);
		for (char c : firstWord.toCharArray()) {
			System.out.println(Character.isDigit(c));
			if (Character.isDigit(c)) {
				System.out.println(Character.isDigit(c));
				Assert.assertEquals(Character.isDigit(c), true);
			} else {
				flag = 1;
			}		
		}
		if (flag == 1) {
			logger.fail("classicprice is not numeric in Bahrain Subsription");
		}
	}
	
	public void verify_Premiumprice() {
		int flag = 0;
		String text = ele.getWebElement("XPATH", PlanElements.premiumprice).getText();
		String firstWord = text.split(" ")[0];
		System.out.println(firstWord);
		for (char c : firstWord.toCharArray()) {
			System.out.println(Character.isDigit(c));
			if (Character.isDigit(c)) {
				System.out.println(Character.isDigit(c));
				Assert.assertEquals(Character.isDigit(c), true);
			} else {
				flag = 1;
			}		
		}
		if (flag == 1) {
			logger.fail("premiumprice is not numeric in Bahrain Subsription");
		}
	}

	public void verify_litecurrency() {
		String currencynm = ele.getWebElement("XPATH", PlanElements.liteprice).getText();
		int iend = currencynm.indexOf("/");
		String subString;
		if (iend != -1) {
			subString = currencynm.substring(iend - 3, iend);
			System.out.println(subString);
			if (subString.equals("BHD")) {
				Assert.assertEquals(subString, "BHD");
				logger.pass("Lite curreny is correct in Lite Subscription");
			} else {
				logger.fail("Bahrain curreny is wrong in Lite Subscription");
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
			if (subString.equals("BHD")) {
				Assert.assertEquals(subString, "BHD");
				logger.pass("Classic curreny is correct in Lite Subscription");
			} else {
				logger.fail("Bahrain curreny is wrong in Classic Subscription");
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
			if (subString.equals("BHD")) {
				Assert.assertEquals(subString, "BHD");
				logger.pass("Premium curreny is correct in Premium Subscription");
			} else {
				logger.fail("Bahrain curreny is wrong in Premium Subscription");
			}
		}

	}

}
